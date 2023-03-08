package GoIt_Homework_13.TestChatBot;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

public class CurrencyServicePrivatbank implements CurrencyService {
    private static final String URL = "https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11";
    @Override
    public List<CurrencyRateDto> getCurrencyRates() {
        try {
            String response = Jsoup.connect(URL).ignoreContentType(true).get().body().text();
            List<CurrencyRateResponsePrivatbank> responseDto = convertResponseToList(response);
            return responseDto.stream()
                    .map(dto -> new CurrencyRateDto(dto.getCcy(), dto.getBuy(), dto.getSale()))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private List<CurrencyRateResponsePrivatbank> convertResponseToList(String response) {
        Type type = TypeToken.getParameterized(List.class, CurrencyRateResponsePrivatbank.class).getType();
        Gson gson = new Gson();
        return gson.fromJson(response, type);
    }
}

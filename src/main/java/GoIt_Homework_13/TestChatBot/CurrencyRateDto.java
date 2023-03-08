package GoIt_Homework_13.TestChatBot;

import java.math.BigDecimal;

public class CurrencyRateDto {

    private Currency currency;
    private BigDecimal buyRate;
    private BigDecimal sellRate;

    public CurrencyRateDto(Currency currency, BigDecimal buyRate, BigDecimal sellRate) {
        this.currency = currency;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public CurrencyRateDto() {
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(BigDecimal buyRate) {
        this.buyRate = buyRate;
    }

    public BigDecimal getSellRate() {
        return sellRate;
    }

    public void setSellRate(BigDecimal sellRate) {
        this.sellRate = sellRate;
    }

    @Override
    public String toString() {
        return "Currency " + currency +
                ", buyRate - " + buyRate +
                ", sellRate - " + sellRate;
    }
}

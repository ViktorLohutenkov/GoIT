package GoIt_HomeWork_11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRandomNums {
    public static void main(String[] args) {

        System.out.println(getRandomStream(11,1,5)
                .collect(Collectors.toList()));
    }
        public static Stream<Long> getRandomStream (int c, long seed, int limit){
            long a = 25214903917L;
            long m = (long) Math.pow(2, 48);
        return  Stream.iterate(seed,x -> (a * x+ c) % m)
                .limit(limit);
            }
        }


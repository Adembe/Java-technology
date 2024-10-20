package uliral;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingUsing {
    String result1 ,result2, result3;
    public FunctionalProgrammingUsing() {
        String filePath = "src\\uliral\\PassengerBaggage.txt";
        try {
            List<PassengerBaggage> goodsInformation = goodsReadInformation(filePath);
            List<PassengerBaggage> resultA = find0_3AverageWeight(goodsInformation);
            System.out.println("a) Абсолют зөрүү нь 0.3 кг-аас хэтрэхгүй жинтэй тээш : " + resultA);
            long[] resultB = twoGoodsPassengersCount(goodsInformation);
            System.out.println("б) 1) Хоёроос олон бараатай зорчигчдын тоо : " + resultB[0] + "\n" +
                                "\t2) Тээшин дэх барааны тоо нь нийт барааны дундаж тооноос олон байдаг зорчигчдын тоо : " + resultB[1]);
            boolean resultC = findSimilarPassengers(goodsInformation);
            if(resultC == true){
                result1 = "Байна";
            }
            else {
                result1 = "Байхгүй";
            }
            System.out.println("в) Тээшиндээ ижил тооны бараатай, барааны жингийн зөрүү нь 0.5 кг-аас хэтрэхгүй ийм хоёр зорчигч байгаа эсэхийг тодорхойл : " + result1);
            boolean resultD = differFromOthers(goodsInformation);
            if(resultD == true){
                result2 = "Байна";
            }
            else {
                result2 = "Байхгүй";
            }
            System.out.println("г) Бусад зорчигчдоос барааны тоо, барааны жингийн хувьд ялгаатай зорчигч байгаа эсэхийг тодорхойл : " + result2);
            boolean resultE = SingleGoodsToPassenger(goodsInformation);
            if(resultE == true){
                result3 = "Байна";
            }
            else {
                result3 = "Байхгүй";
            }
            System.out.println("д) 30 кг-аас ихгүй жинтэй ганцхан бараатай зорчигч байгаа эсэхийг тодорхойл : " + result3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PassengerBaggage> goodsReadInformation(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.lines(path)
                .map(line -> {
                    String[] parts = line.trim().split("\\s+");
                    return new PassengerBaggage(Integer.parseInt(parts[0]), Double.parseDouble(parts[1]));
                })
                .collect(Collectors.toList());
    }

    public static List<PassengerBaggage> find0_3AverageWeight(List<PassengerBaggage> goodsInformation) {
        double avgWeight = goodsInformation.stream().mapToDouble(PassengerBaggage::getGoodsWeight).average().orElse(0);
        return isByCondition(goodsInformation, baggage -> AverageWeight(baggage, avgWeight, 0.3));
    }

    private static boolean AverageWeight(PassengerBaggage baggage, double avgWeight, double threshold) {
        return Math.abs(baggage.getGoodsWeight() - avgWeight) <= threshold;
    }

    public static long[] twoGoodsPassengersCount(List<PassengerBaggage> goodsInformation) {
        double avgItemCount = goodsInformation.stream().mapToInt(PassengerBaggage::getBaggageGoods).average().orElse(0);
        return new long[]{
                countPassengers(goodsInformation, baggage -> baggage.getBaggageGoods() > 2),
                countPassengers(goodsInformation, baggage -> baggage.getBaggageGoods() > avgItemCount)
        };
    }

    private static long countPassengers(List<PassengerBaggage> goodsInformation, Predicate<PassengerBaggage> condition) {
        return goodsInformation.stream().filter(condition).count();
    }

    public static boolean findSimilarPassengers(List<PassengerBaggage> goodsInformation) {
        List<PassengerBaggage> sortedBaggageInfo = sortGoodsInformation(goodsInformation);
        return IntStream.range(0, sortedBaggageInfo.size() - 1)
                .anyMatch(i -> Similar(sortedBaggageInfo.get(i), sortedBaggageInfo.get(i + 1), 0.5));
    }

    private static List<PassengerBaggage> sortGoodsInformation(List<PassengerBaggage> goodsInformation) {
        return goodsInformation.stream()
                .sorted(Comparator.comparingInt(PassengerBaggage::getBaggageGoods).thenComparing(PassengerBaggage::getGoodsWeight))
                .collect(Collectors.toList());
    }

    private static boolean Similar(PassengerBaggage baggage1, PassengerBaggage baggage2, double weightThreshold) {
        return baggage1.getBaggageGoods() == baggage2.getBaggageGoods()
                && Math.abs(baggage1.getGoodsWeight() - baggage2.getGoodsWeight()) <= weightThreshold;
    }

    public static boolean SingleGoodsToPassenger(List<PassengerBaggage> goodsInformation) {
        return goodsInformation.stream().anyMatch(baggage -> baggage.getBaggageGoods() == 1 && baggage.getGoodsWeight() <= 30);
    }

    private static List<PassengerBaggage> isByCondition(List<PassengerBaggage> goodsInformation, PassengerBaggageFilter condition) {
        return goodsInformation.stream().filter(condition::test).collect(Collectors.toList());
    }

    public static boolean differFromOthers(List<PassengerBaggage> goodsInformation) {
        List<PassengerBaggage> sortedBaggageInfo = sortGoodsInformation(goodsInformation);

        return IntStream.range(0, sortedBaggageInfo.size() - 1)
                .anyMatch(i -> !Similar(sortedBaggageInfo.get(i), sortedBaggageInfo.get(i + 1), 0));
    }


    public static void main(String[] args) {
        new FunctionalProgrammingUsing();
    }
}

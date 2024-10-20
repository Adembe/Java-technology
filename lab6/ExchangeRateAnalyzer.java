package lab6;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRateAnalyzer {
    public ExchangeRateAnalyzer() {
        String[] bankNames = {"TDBank", "Golomt Bank", "Khaan Bank", "Toriin Bank", "Bogd Bank"};
        String[] currenciesNames = {"USD", "EUR", "Yen", "GBP", "RUB", "CNY", "KRW"};

        Map<String, Map<String, Double>> exchangeRates = new HashMap<>();

        exchangeRates.put("TDBank", createExchangeRateMap(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0));
        exchangeRates.put("Golomt Bank", createExchangeRateMap(11.0, 22.0, 33.0, 44.0, 55.0, 66.0, 77.0));
        exchangeRates.put("Khaan Bank", createExchangeRateMap(9.0, 18.0, 27.0, 36.0, 45.0, 54.0, 63.0));
        exchangeRates.put("Toriin Bank", createExchangeRateMap(12.0, 24.0, 36.0, 48.0, 60.0, 72.0, 84.0));
        exchangeRates.put("Bogd Bank", createExchangeRateMap(11.5, 23.0, 34.5, 46.0, 57.5, 69.0, 80.5));

        double largestChange = 0.0;
        String largeBankName = null;
        String currencyName = null;

        // Analyze the exchange rate data
        for (String bank : bankNames) {
            for (String currency : currenciesNames) {
                double buyingRate = exchangeRates.get(bank).get(currency);
                double sellingRate = exchangeRates.get(bank).get(currency + " Cash");
                double rateChange = Math.abs(buyingRate - sellingRate);

                if (rateChange > largestChange) {
                    largestChange = rateChange;
                    largeBankName = bank;
                    currencyName = currency;
                }
            }
        }

        System.out.println("Хамгийн их ханшийн өөрчлөлт хийсэн Банк: " + largeBankName);
        System.out.println("Валютын нэр: " + currencyName);
        System.out.println("Өөрчлөгдсөн хэмжээ: " + largestChange);
    }

    private static Map<String, Double> createExchangeRateMap(double usd, double eur, double jpy, double gbp, double rub, double cny, double krw) {
        Map<String, Double> exchangeRateMap = new HashMap<>();
        exchangeRateMap.put("USD", usd);
        exchangeRateMap.put("USD Cash", usd + 0.4);
        exchangeRateMap.put("EUR", eur);
        exchangeRateMap.put("EUR Cash", eur + 0.5);
        exchangeRateMap.put("Yen", jpy);
        exchangeRateMap.put("Yen Cash", jpy + 1.2);
        exchangeRateMap.put("GBP", gbp);
        exchangeRateMap.put("GBP Cash", gbp + 0.0);
        exchangeRateMap.put("RUB", rub);
        exchangeRateMap.put("RUB Cash", rub + 2.1);
        exchangeRateMap.put("CNY", cny);
        exchangeRateMap.put("CNY Cash", cny + 3.0);
        exchangeRateMap.put("KRW", krw);
        exchangeRateMap.put("KRW Cash", krw + 0.59);
        return exchangeRateMap;
    }

    public static void main(String[] args) {
        new ExchangeRateAnalyzer();
    }
}

package project5;

import project5.exchangeapi.ExchangeRateProvider;

public class CurrencyCalculator {
    private ExchangeRateProvider rateProvider;

    public CurrencyCalculator(ExchangeRateProvider rateProvider) {

        this.rateProvider = rateProvider;
    }

    public double convertToCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
        double buyingRate = rateProvider.getBuyingExchangeRate(toCurrency);
        double sellingRate = rateProvider.getSellingExchangeRate(fromCurrency);

        return amount * (buyingRate / sellingRate);
    }

    public double convert(Currency fromCurrency, Currency toCurrency, double amount) {
        double buyingRate = rateProvider.getBuyingExchangeRate(toCurrency);
        double sellingRate = rateProvider.getSellingExchangeRate(fromCurrency);

        return amount * (buyingRate / sellingRate);
    }
}
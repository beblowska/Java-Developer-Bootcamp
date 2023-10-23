package project5.exchangeapi;

import project5.Currency;

public interface ExchangeRateProvider {
    double getBuyingRate(Currency currency);
    double getSellingRate(Currency currency);

    double getBuyingExchangeRate(Currency currency);

    double getSellingExchangeRate(Currency currency);
}

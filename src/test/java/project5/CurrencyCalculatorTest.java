package project5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import project5.exchangeprovider.ExternalExchangeRateProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CurrencyCalculatorTest {

    @Mock
    private ExternalExchangeRateProvider exchangeRateProvider;

    private CurrencyCalculator converter;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        converter = new CurrencyCalculator(exchangeRateProvider);
    }

    @Test
    public void testConvertPLNtoEUR() {
        when(exchangeRateProvider.getBuyingRate(Currency.PLN)).thenReturn(0.22);
        double result = converter.convert(Currency.PLN, Currency.EUR, 100.0);
        assertEquals(22.0, result, 0.01);
    }

    @Test
    public void testConvertPLNtoUSD() {
        when(exchangeRateProvider.getBuyingRate(Currency.PLN)).thenReturn(0.25);
        double result = converter.convert(Currency.PLN, Currency.USD, 100.0);
        assertEquals(25.0, result, 0.01);
    }

    @Test
    public void testConvertPLNtoGBP() {
        when(exchangeRateProvider.getBuyingRate(Currency.PLN)).thenReturn(0.18);
        double result = converter.convert(Currency.PLN, Currency.GBP, 100.0);
        assertEquals(18.0, result, 0.01);
    }
}


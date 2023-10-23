# Kalkulator Walut z Zewnętrznym API

Zadanie polega na implementacji kalkulatora walut, który potrafi przeliczyć wartość podaną w złotówkach na wartość w euro, dolarach amerykańskich i funtach brytyjskich. 
Dodatkowym założeniem jest, aby kalkulator walut pobierał aktualny kurs z zewnętrznego systemu.

## Struktura Projektu

1. **Interfejs Kursów Walutowych:** W celu zachowania elastyczności projektu, zdefiniowano interfejs ExchangeRateProvider, który zawierala metody do uzyskiwania kursów walut. 
    To pozwoliło na łatwą rozbudowę projektu o różne źródła kursów, bez konieczności zmiany samego kalkulatora.

2. **Typ Wyliczeniowy dla Walut:** Do reprezentacji obsługiwanych walut stworzono typ wyliczeniowy Currency. Każda obsługiwana waluta jest reprezentowana jako stała.

3. **Pobieranie Kursów z Zewnętrznego API:** Zadaniem klasy ExternalExchangeRateProvider jest pobieranie aktualnych kursów walut z zewnętrznego API dostawcy kursów.
   Wykorzystano narzędzia takie jak Apache HttpClient do nawiązywania połączenia i pobierania danych.

4. **Testowanie z Mockito:** W celu zapewnienia jakości kodu, wykorzystano framework Mockito do testowania jednostkowego.
   Dzięki temu można symulować odpowiedzi z zewnętrznego systemu i sprawdzać poprawność działania kalkulatora.

## Przykład Użycia

Kalkulator przelicza wartość z polskich złotych na euro, dolary amerykańskie i funty brytyjskie, korzystając z aktualnych kursów walut pobranych z zewnętrznego źródła.

## Podsumowanie

Projekt kalkulatora walut jet przykładem zastosowania programowania obiektowego, interfejsów i testowania jednostkowego. 
Elastyczność projektu pozwala na łatwą rozbudowę o nowe źródła kursów walut lub dodawanie obsługiwanych walut.

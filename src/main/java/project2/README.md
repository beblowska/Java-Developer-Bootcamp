# Prosty Kalkulator Rachunku

Kalkulator rachunku to prosta klasa BillCalculator, która pozwala na obliczenie końcowej wartości rachunku w różnych scenariuszach. 
Można użyć tej klasy, aby obliczyć rachunek z opłatą serwisową, zniżką na wartość rachunku lub dodatkową opłatą za opakowania na wynos.

## Przykład użycia

**Przypadk 1:** Obliczenie rachunku z opłatą serwisową
  ```
  BillCalculator calculator = new BillCalculator();
  double billValue = 100.0;
  float serviceCharge = 10.0f;
  double finalBill = calculator.calculate(billValue, serviceCharge);
  System.out.println("Końcowa wartość rachunku: " + finalBill)
```
**Przypadek 2:** Obliczenie rachunku z opłatą serwisową i zniżką na wartość rachunku
  ```
  BillCalculator calculator = new BillCalculator();
  double billValue = 100.0;
  float serviceCharge = 10.0f;
  double discount = 20.0;
  double finalBill = calculator.calculate(billValue, serviceCharge, discount);
  System.out.println("Końcowa wartość rachunku po zniżce: " + finalBill);
```

**Przypadek 3:** Obliczenie rachunku z opłatą serwisową i opłatą za opakowania na wynos
  ```
  BillCalculator calculator = new BillCalculator();
  double billValue = 50.0;
  float serviceCharge = 5.0f;
  short takeawayCharge = 2;
  double finalBill = calculator.calculate(billValue, serviceCharge, takeawayCharge);
  System.out.println("Końcowa wartość rachunku z opłatą za opakowania na wynos: " + finalBill);
```

## Uwagi

- Zniżka jest obliczana tylko na wartość rachunku, a nie na opłatę serwisową.

## Testy jednostkowe

W projekcie znajdują się również testy jednostkowe do powyższej metody.

- Testy te sprawdzają poprawność działania funkcji na różnych przypadkach.

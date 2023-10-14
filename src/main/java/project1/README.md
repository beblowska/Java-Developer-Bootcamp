# Metoda Dni Tygodnia

## Opis

Ten projekt zawiera prostą metodę, która na podstawie podanej liczby całkowitej zwraca odpowiedni dzień tygodnia. 
Dodatkowo, jeśli liczba jest poza zakresem 1-7, zwracany jest odpowiedni komunikat.

## Przykład użycia

    ```bash
    public class Main {
    public static void main(String[] args) {
        System.out.println(DayOfWeekResolver.getDayOfWeek(3));  // Output: "Wednesday"
        System.out.println(DayOfWeekResolver.getDayOfWeek(6));  // Output: "Weekend"
        System.out.println(DayOfWeekResolver.getDayOfWeek(9));  // Output: "There is no such a day!"
    }
    }

## Testy Jednostkowe

W projekcie znajdują się również testy jednostkowe do powyższej metody. 

- Testy te sprawdzają poprawność działania funkcji na różnych przypadkach.
- Testy sprawdzą, czy funkcja `getDayOfWeek` zachowuje się zgodnie z oczekiwaniami dla różnych przypadków.


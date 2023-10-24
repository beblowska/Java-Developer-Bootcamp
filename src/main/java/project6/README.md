# Lista Generyczna

Ta prosta implementacja generycznej listy jest oparta na interfejsie OwnList. 
Implementuje ona podstawowe operacje takie jak dodawanie, pobieranie, usuwanie elementów oraz zliczanie rozmiaru listy. 
Dzięki temu można przechowywać elementy dowolnego typu w liście.

## Przykład Użycia

    public class Main {
        public static void main(String[] args) {
            OwnList<String> stringList = new OwnListImpl<>();
            
            stringList.add("Pierwszy");
            stringList.add("Drugi");
            stringList.add("Trzeci");
            
            System.out.println("Rozmiar listy: " + stringList.size());
            
            System.out.println("Element na indeksie 1: " + stringList.get(1));
            
            stringList.remove("Drugi");
            
            System.out.println("Rozmiar listy po usunięciu: " + stringList.size());
        }
    }

## Testy Jednostkowe

Implementacja OwnList jest pokryta testami JUnit, które zapewniają poprawność działania

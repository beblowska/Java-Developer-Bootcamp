# Walidator numeru PESEL

Ta prosta klasa Java została stworzona do walidacji numeru PESEL na podstawie następujących kryteriów:

- Typu danych (zakładamy, że argument ma typ String).
- Długości

Jeżeli typ danych jest niezgodny, zostanie zgłoszony wyjątek WrongTypeOfDataException.
Jeśli długość jest niepoprawna, zostanie rzucony wyjątek IllegalLengthException. 
Każdy wyjątek zwraca odpowiedni komunikat błędu.

## Przykład użycia

    PeselValidator validator = new PeselValidator();
    
    try {
        validator.validate("twój_numer_pesel");
        System.out.println("PESEL jest poprawny.");
    } catch (WrongTypeOfDataException | IllegalLengthException e) {
        System.err.println("Walidacja nie powiodła się: " + e.getMessage());
    }

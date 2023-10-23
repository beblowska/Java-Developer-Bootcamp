package project4;

import project4.exceptions.WrongTypeOfDataException;
import project4.exceptions.IllegalLengthException;

public class PeselValidator {
    public static void validatePesel(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (pesel == null || !pesel.matches("\\d+")) {
            throw new WrongTypeOfDataException("PESEL must be a numeric string.");
        }
        if (pesel.length() != 11) {
            throw new IllegalArgumentException("Invalid PESEL length.");
        }
    }
}

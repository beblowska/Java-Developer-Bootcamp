package project4;

import project4.exceptions.IllegalLengthException;
import project4.exceptions.WrongTypeOfDataException;

import static project4.PeselValidator.validatePesel;

public class Main {
    public static void main(String[] args) {
        try {
            String pesel = "81020300068n";
            validatePesel(pesel);
            System.out.println("PESEL: " + pesel);
            System.out.println("PESEL validated successfully");
        } catch (WrongTypeOfDataException | IllegalLengthException exception) {
            System.out.println("Validation error: " + exception.getMessage());
        }
    }
}
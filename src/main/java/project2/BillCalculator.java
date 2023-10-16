package project2;

public class BillCalculator {

    public double calculate(double bill, float service) {
        return bill + service;
    }

    public double calculate(double bill, float service, double discount) {
        return (bill - discount) + service;
    }

    public double calculate(double bill, float service, short takeaway) {
        return bill + service + takeaway;
    }
}

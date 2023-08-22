package ThirdTask;

public class ThirdTask {
    public static void main(String[] args) {
        MonthlyPayment service = new MonthlyPayment();
        double sum = 1000_000;
        double percent = 9.99;
        int year = 3;
        int payment = (int) service.calculate(sum, percent, year);
        System.out.println("Ежемесячный платёж = " + payment);
    }
}

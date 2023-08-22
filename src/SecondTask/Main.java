package SecondTask;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 80;
        double h = 1.87;
        int bmi = (int) service.calculate(m, h);
        System.out.println("BMI = " + bmi);
    }
}
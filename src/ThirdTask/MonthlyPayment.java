package ThirdTask;

public class MonthlyPayment {
    public double calculate (double sum , double percent, double year){
        double result;
        double mPercent = (percent / 100 * 12);
        double fullPay = sum * (mPercent / (1 - (Math.pow((1+mPercent), -((year * 12) - 1)))));
        return result = fullPay / (year * 12);
    }
}

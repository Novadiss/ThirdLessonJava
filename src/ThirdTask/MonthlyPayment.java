package ThirdTask;

public class MonthlyPayment {
    public double calculate (double sum , double percent, double year){
        double result;
        double mPercent = (percent / 100 /12);
        double allPercent = Math.pow((1 + mPercent) , (year * 12));
        double fullPay = sum * mPercent * allPercent / (allPercent - 1);
        return result = fullPay;
    }
}

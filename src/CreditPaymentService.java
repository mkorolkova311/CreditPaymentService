public class CreditPaymentService {
    public double calculate(double amount, double PercentMonth, int period) {
     return amount * (PercentMonth + ( PercentMonth / ( Math.pow( ( 1 + PercentMonth ), period ) - 1 ) ) );
    }
}
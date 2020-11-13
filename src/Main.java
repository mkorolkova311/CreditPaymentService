public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();
        long amount = 1000000;
        double PercentYear = 9.99;
        double PercentMonth = PercentYear / 12 / 100;
        int period = 36;
        System.out.println(payment.calculate(amount,PercentMonth,period));
    }
}
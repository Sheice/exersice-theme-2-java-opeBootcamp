public class Main {
    public static void main(String[] args) {

        System.out.println(priceWithIva(10000));
    }

    public static double priceWithIva (int price) {
        double IVA = 0.19;

        double priceWithIva = price * IVA;

        return price + priceWithIva ;
    }
}
public class Main
{
    public static void main(String[] args) {
        double salesTax = 0.05;
        double itemPrice = 60.00;
        double totalTax = 0.00;
        double totalPrice = 0.00;
        totalTax = itemPrice * salesTax;
        totalPrice = totalTax + itemPrice;
        System.out.println("Your total price, with sales tax is " + totalPrice + " dollars ");
    }
}
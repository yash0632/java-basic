public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart(1000);

        
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double totalAmount) {
                System.out.printf("Paying %.2f with card",totalAmount);
            }
        });

    }
}

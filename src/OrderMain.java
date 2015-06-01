
public class OrderMain {
        public static void main( String[] args ) {

            Hand hand = new Hand();
            Card[] a = hand.showOrder();
            for (int i = 0; i < 5; i++) {
                System.out.println(a[i].getFace() + " de " + a[i].getSuit());
            }
            System.out.println("La carta con mayor valor es: \n");
            System.out.println(a[4].getFace() + " de " + a[4].getSuit());
        }
    }

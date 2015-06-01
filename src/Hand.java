
public class Hand {
    Card[] hand;
    int[] numHand = new int [5];


    public Hand() {
        hand = new Card[5];
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        myDeckOfCards.dealCard();
        System.out.println("Se reparten las cartas... ");

        for (int i = 0; i < 5; i++) {
            hand[i] = myDeckOfCards.dealCard();
        }
    }


    public Card[] showOrder(){
        orderHand();
        return hand;
    }


    public void orderHand () {
        int temporalNumber;
        Card temporalCard;
        this.getNumberToOrder();

        for (int i = 0; i < numHand.length - 2; i++) {
            for (int j = 0; j < numHand.length - 1; j++) {
                if (numHand[j] > numHand[j + 1]) {
                    temporalNumber = numHand[j];
                    numHand[j] = numHand[j + 1];
                    numHand[j + 1] = temporalNumber;
                    temporalCard = hand[j];
                    hand[j] = hand[j + 1];
                    hand[j + 1] = temporalCard;
                }
            }
        }
    }

    public int getFaceNumber( String face ) {
        int number = 0;

        switch (face) {
            case "As":
                number = 14;
                break;
            case "Dos":
                number = 2;
                break;
            case "Tres":
                number = 3;
                break;
            case "Cuatro":
                number = 4;
                break;
            case "Cinco":
                number = 5;
                break;
            case "Seis":
                number = 6;
                break;
            case "Siete":
                number = 7;
                break;
            case "Ocho":
                number = 8;
                break;
            case "Nueve":
                number = 9;
                break;
            case "Diez":
                number = 10;
                break;
            case "Jota":
                number = 11;
                break;
            case "Reina":
                number = 12;
                break;
            case "Rey":
                number = 13;
                break;
        }
        return number;
    }

    public int[] getNumberToOrder() {
        for( int i = 0; i < hand.length; i++){
            numHand[i] = getFaceNumber( hand[i].getFace() );
        }
        return numHand;
    }
}

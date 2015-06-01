import java.util.Random;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();


    public DeckOfCards() {
        String[] faces = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
                "Jota", "Reina", "Rey"};
        String[] suits = {"corazones", "diamantes", "treboles", "espadas"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] =
                    new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;

        for ( int position = 0; position < deck.length; position++ )
        {
            int second = randomNumbers.nextInt( NUMBER_OF_CARDS);

            Card temp = deck [ position ];
            deck [ position ] = deck [ second ];
            deck [ second ] = temp;
        }
    }

    public Card dealCard() {
        if ( currentCard < deck.length )
            return deck[ currentCard++ ];
        else
            return null;
    }

}
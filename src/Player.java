import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<UnoCard> hand;
	
	public Player(String name) {
		this.name = name;
		
		hand = new ArrayList<UnoCard>();
	}
	
	public void playTurn(Color validColor, Value validValue, UnoGame game, UnoDeck deck) {
		boolean didPlayCard = false;
		for (UnoCard card : hand) {
			if (card.isValid(validColor, validValue)) {
				hand.remove(card);
				game.playCard(card);
				didPlayCard = true;
				break;
			}
		}
		
		while (!didPlayCard) {
			if (deck.isEmpty()) {
				game.refillDeck();
			}
			UnoCard newCard = deck.drawOne();
			if (newCard.isValid(validColor, validValue)) {
				game.playCard(newCard);
				didPlayCard = true;
			} else {
				hand.add(newCard);
			}
		}
		
		if (hand.size() == 0) {
			game.endGame(this);
		}
	}
	
	public void draw(int drawCount, UnoDeck deck, UnoGame game) {
		for (int i = 0; i<drawCount; i++) {
			if (deck.isEmpty()) {
				game.refillDeck();
			}
			hand.add(deck.drawOne());
		}
	}
}

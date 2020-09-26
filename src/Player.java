import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<UnoCard> hand;
	
	public Player(String name) {
		this.name = name;
		
		hand = new ArrayList<UnoCard>();
	}
	
	public void draw(int drawCount, UnoDeck deck, Game game) {
		for (int i = 0; i<drawCount; i++) {
			if (deck.isEmpty()) {
				deck.refill(game.getDiscardPile());
			}
			hand.add(deck.drawOne());
		}
	}
}

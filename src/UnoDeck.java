import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnoDeck {
	private List<UnoCard> cards = new ArrayList<UnoCard>();
	private int cardsCount;
	
	public UnoDeck() {
		List<Color> colors = Color.getColors();
		List<Value> values = Value.getValues();
		
		for (int i = 0; i<4; i++) {
			cards.add(new UnoCard(colors.get(i), values.get(0), 0));
			for (int j = 1; j<13; j++) {
				int score;
				if (j<10) {
					score = j;
				} else {
					score = 20;
				}
				cards.add(new UnoCard(colors.get(i), values.get(j), score));
				cards.add(new UnoCard(colors.get(i), values.get(j), score));
			}
			cards.add(new UnoCard(Color.WILD, Value.WILD, 50));
			cards.add(new UnoCard(Color.WILD, Value.DRAW_FOUR, 50));
		}
		
		cardsCount = cards.size();
	}

	public List<UnoCard> getCards() {
		return cards;
	}

	public void setCards(List<UnoCard> cards) {
		this.cards = cards;
	}

	public int getCardsCount() {
		return cardsCount;
	}

	public void setCardsCount(int cardsCount) {
		this.cardsCount = cardsCount;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public UnoCard drawOne() {
		return cards.remove(cards.size()-1);
	}
}

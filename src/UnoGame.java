import java.util.ArrayList;
import java.util.List;

public class UnoGame {
	private List<Player> players;
	private List<UnoCard> discardPile;
	private UnoDeck deck;
	private boolean turnDirection;
	private Color activeColor;
	private Value activeValue;
	private boolean gameStarted;
	private boolean gameOver;
	private Player winner;
	private int activePlayer;
	
	public UnoGame() {
		deck = new UnoDeck();
		turnDirection = true;
		gameStarted = false;
		gameOver = false;
		
		players = new ArrayList<Player>();
		activePlayer = 0;
	}
	
	public void addPlayer(Player player) throws Exception {
		if (gameStarted) {
			throw new Exception("Can't add player after game has started.");
		}
		players.add(player);
	}
	
	public void startGame() throws Exception {
		if (players.size() < 2) throw new Exception ("At least two players are required to start.");
		for (Player player : players) {
			player.draw(7, deck, this);
		}
		UnoCard card = deck.drawOne();
		
	}
	
	public void refillDeck() {
		deck.refill(discardPile);
		deck.shuffle();
		discardPile.clear();
	}
	
	public void playCard(UnoCard card) {
		activeColor = card.getColor();
		activeValue = card.getValue();
		discardPile.add(card);
	}
	
	public void endGame(Player player) {
		gameOver = true;
		winner = player;
	}
}

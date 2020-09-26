
public class UnoCard {
	
	private final Color color;
	private final Value value;
	private int score;
	
	public UnoCard(Color color, Value value, int score) {
		this.color = color;
		this.value = value;
		this.score = score;
	}
	
	public String toString() {
		return color + "_" + value + "-" + score;
	}

	public Color getColor() {
		return color;
	}

	public Value getValue() {
		return value;
	}

	public int getScore() {
		return score;
	}
}

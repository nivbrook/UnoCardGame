
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnoDeck unoDeck = new UnoDeck();
		
		System.out.println(unoDeck.getCardsCount());
		for (UnoCard card : unoDeck.getCards()) {
			System.out.println(card.toString());
		}
		
		
	}

}

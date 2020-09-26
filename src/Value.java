import java.util.Arrays;
import java.util.List;

public enum Value {
	ZERO,
	ONE,
	TWO,
	THREE,
	FOUR,
	FIVE,
	SIX,
	SEVEN,
	EIGHT,
	NINE,
	SKIP,
	REVERSE,
	DRAW_TWO,
	DRAW_FOUR,
	WILD;
	
	public static List<Value> getValues(){
		return Arrays.asList(Value.values());
	}
}

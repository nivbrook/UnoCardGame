import java.util.Arrays;
import java.util.List;

public enum Color {
	RED,
	YELLOW,
	GREEN,
	BLUE,
	WILD;
	
	public static List<Color> getColors(){
		return Arrays.asList(Color.values());
	}
}

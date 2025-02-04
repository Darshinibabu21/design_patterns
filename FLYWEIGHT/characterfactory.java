package FLYWEIGHT;
import java.util.HashMap;
import java.util.Map;

public class characterfactory {
    private static final Map<Character,textcharacter> charactermap=new HashMap<>();
    public static textcharacter getchar(char symbol)
    {
        charactermap.putIfAbsent(symbol, new concretecharacter(symbol));
        return charactermap.get(symbol);
    }
}

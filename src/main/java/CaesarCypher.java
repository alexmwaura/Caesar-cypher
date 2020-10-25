import java.util.ArrayList;

public class CaesarCypher {
    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Object getIndex(String word){
        int index = alphabets.toLowerCase().indexOf(word);
        return index;
    }
}

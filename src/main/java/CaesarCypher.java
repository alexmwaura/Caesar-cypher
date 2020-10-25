import java.util.ArrayList;

public class CaesarCypher {
    public Object getIndex(String word){
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = alphabets.toLowerCase().indexOf(word);
        return index;
    }
}

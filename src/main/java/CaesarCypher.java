import java.util.ArrayList;

public class CaesarCypher {
    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Object getIndex(char letter){
        int index = alphabets.toLowerCase().indexOf(letter);
        return index;
    }
    public Object indexArray(String word){
        ArrayList<Object> integerIndex = new ArrayList<Object>();
        for(char letter: word.toCharArray()){
            integerIndex.add(getIndex(letter));
        }
        return integerIndex;
    }
}

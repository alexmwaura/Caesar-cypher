import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CaesarCypher {
    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Integer getIndex(char letter){
        boolean isLowerCase = Character.isLowerCase(letter);
        boolean isUpperCase = Character.isUpperCase(letter);
        if(isLowerCase){
            int indexLower = alphabets.toLowerCase().indexOf(letter) + 65;
            return indexLower;
        }
        else if(isUpperCase){
            int indexUpper = alphabets.indexOf(letter) + 97;
            return indexUpper;
        }
        else {
            return -1;
        }
    }

    public ArrayList<Integer> indexArray(@NotNull String word){
        ArrayList<Integer> integerIndex = new ArrayList<Integer>();
        for(char letter: word.toCharArray()){
          integerIndex.add(getIndex(letter));
        }
        return integerIndex;
    }

    public String encryptDecrypt(String sentence, int shiftIndex, String option){
        ArrayList<Integer> integerIndex = indexArray(sentence);
        ArrayList<Character> arrayListCharacters = new ArrayList<Character>();
        for(Integer index: integerIndex){
            if(option.toLowerCase().equals("encrypt")){
                if(index >= 65 && index <= 90 ){
                    int newIndex = index -65;
                    arrayListCharacters.add(alphabets.toLowerCase().charAt(newIndex + shiftIndex));
                }else if(index == -1){
                    arrayListCharacters.add(' ');
                }else if (index >=97 && index <= 112){
                    int newIndex = index-97;
                    arrayListCharacters.add(alphabets.charAt(newIndex + shiftIndex));
                }
            }
            else if(option.toLowerCase().equals("decrypt")){
                if(index >= 65 && index <= 90 ){
                    int newIndex = index -65;
                    arrayListCharacters.add(alphabets.toLowerCase().charAt(newIndex - shiftIndex));
                }else if(index == -1){
                    arrayListCharacters.add(' ');
                }else if (index >=97 && index <= 112){
                    int newIndex = index-97;
                    arrayListCharacters.add(alphabets.charAt(newIndex - shiftIndex));
                }
            }
       }
        StringBuilder encryptedResult = new StringBuilder(arrayListCharacters.size());
        for(char encrypted: arrayListCharacters){
            encryptedResult.append(encrypted);
        }
        return encryptedResult.toString();
    }
}

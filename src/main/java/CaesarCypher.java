import java.util.ArrayList;

public class CaesarCypher {
    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Integer getIndex(char letter){
        boolean isLowerCase = Character.isLowerCase(letter);
        boolean isUpperCase = Character.isUpperCase(letter);
        if(isLowerCase){
            int indexLower;
            indexLower = alphabets.toLowerCase().indexOf(letter) + 65;
            return indexLower;
        }
        else if(isUpperCase){
            int indexUpper;
            indexUpper = alphabets.indexOf(letter) + 97;
            return indexUpper;
        }
        else {
            return -1;
        }
    }

    public ArrayList<Integer> indexArray(String sentence){
        ArrayList<Integer> integerIndex = new ArrayList<Integer>();
        for(char letter: sentence.toCharArray()){
          integerIndex.add(getIndex(letter));
        }

        return integerIndex;
    }

    public String encryptDecrypt(String sentence, int shiftIndex, String option){

        ArrayList<Character> arrayListCharacters = new ArrayList<Character>();
        if(option.toLowerCase().equals("encrypt")){
            ArrayList<Integer> integerIndex = indexArray(sentence);
            for(Integer index: integerIndex){
                if(index >= 65 && index <= 90 ){
                    int newIndex = ((index - 65) + shiftIndex) % 26;
                    arrayListCharacters.add(alphabets.toLowerCase().charAt(newIndex));
                }else if(index == -1){
                    arrayListCharacters.add(' ');
                }else if (index >=91 && index <= 112){
                    int newIndex = ((index-97)+ shiftIndex) % 26;
                    arrayListCharacters.add(alphabets.charAt(newIndex));
                }
            }
       }
        else if(option.toLowerCase().equals("decrypt")){
            ArrayList<Integer> integerIndex = indexArray(sentence);
            for(Integer index: integerIndex){
                if(index >= 65 && index <= 90 ){
                    int newIndex = (((index - 65) - shiftIndex) + 26) % 26;
                    arrayListCharacters.add(alphabets.toLowerCase().charAt(newIndex));
                }else if(index == -1){
                    arrayListCharacters.add(' ');
                }else if (index >=91 && index <= 112){
                    int newIndex = (((index-97) - shiftIndex) + 26) % 26;
                    arrayListCharacters.add(alphabets.charAt(newIndex));
                }
            }
        }
        StringBuilder endocryptResult = new StringBuilder(arrayListCharacters.size());
        for(char endocrypt: arrayListCharacters){
            endocryptResult.append(endocrypt);
        }
        return endocryptResult.toString();
    }
}

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CaesarCypherTest {
    @Test
    public void getIndexLower_returnTheIndexOfASingleLetterLower_Integer(){
        CaesarCypher caesarCypher = new CaesarCypher();
        Integer index = 66;
        assertEquals(index,caesarCypher.getIndex('b'));
    }

    @Test
    public void indexArray_returnIndexOfUpperAndLower_ArrayList(){
        CaesarCypher caesarCypher = new CaesarCypher();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(65);
        arrayList.add(98);
        assertEquals(arrayList,caesarCypher.indexArray("aB"));
    }
    @Test
    public void indexArray_detectSpace_ArrayList(){
        CaesarCypher caesarCypher = new CaesarCypher();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(65);
        arrayList.add(-1);
        assertEquals(arrayList, caesarCypher.indexArray("a "));
    }
    @Test
    public void encryptedString_encryptString_String(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String encryptedString = "Gdkkn";
        assertEquals(encryptedString,caesarCypher.encryptDecrypt("Hello",25, "encrypt"));
    }
    @Test
    public void decryptString_decryptString_String(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String decrypted = "Hello";
        assertEquals(decrypted, caesarCypher.encryptDecrypt("Gdkkn", 25, "decrypt"));
    }
}
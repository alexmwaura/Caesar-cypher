import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CaesarCypherTest {
    @Test
    public void getIndex_returnTheIndexOfASingleLetter_0(){
        CaesarCypher caesarCypher = new CaesarCypher();
        int index = 0;
        assertEquals(index,caesarCypher.getIndex('a'));
    }

    @Test
    public void indexArray_returnIndexOfWord_ArrayList(){
        CaesarCypher caesarCypher = new CaesarCypher();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(0);
        arrayList.add(1);
        assertEquals(arrayList,caesarCypher.indexArray("ab"));
    }
}
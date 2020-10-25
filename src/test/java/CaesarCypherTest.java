import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCypherTest {
    @Test
    public void getIndex_returnTheIndexOfASingleLetter_0(){
        CaesarCypher caesarCypher = new CaesarCypher();
        int index = 0;
        assertEquals(index,caesarCypher.getIndex("a"));
    }
}
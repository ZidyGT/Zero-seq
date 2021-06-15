import org.junit.Test;
import sequence.Checker;
import sequence.Sequence;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ZeroSumTests {

    @Test
    public void testIsZeroSum(){

        // setup
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(-2);

        // exercise
        final boolean rs = Checker.isZeroSeq(list);

        // evaluation
        assertTrue(rs);
    }

    @Test
    public void testIsNotZeroSum(){

        // setup
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(-2);

        // exercise
        final boolean rs = Checker.isZeroSeq(list);

        // evaluation
        assertFalse(rs);
    }
    @Test
    public void testParse(){

        // setup
        Sequence seq = new Sequence();
        String[] charList = {"2", "1", "-2"};
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(-2);

        // exercise
        seq.parseSeq(4, charList);

        // evaluation
        final List<Integer> output = seq.getSequence();
        assertEquals(output, list);
    }
    
}

package sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Sequence {

    private List<Integer> sequence;

    public Sequence() {
        this.sequence = new ArrayList<>();
    }

    public void parseSeq(Integer size, String[] list) {
        if (size > list.length) {
            size = list.length;
        }
        Iterator<String> iterator = Arrays.stream(list).iterator();
        while (iterator.hasNext()) {
            if( size > 0) {
                sequence.add(parseInt(iterator.next()));
            }
            size--;
        }
    }

    public List<Integer> getSequence() {
        return sequence;
    }

}

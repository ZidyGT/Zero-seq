import io.Reader;
import io.Writer;
import sequence.Checker;
import sequence.Sequence;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ZeroSum {

    private static List<Sequence> sequencies;

    public static void main(String[] args) {


        Reader reader = new Reader("example.in");
        Writer writer = new Writer("example.out");

        sequencies = new ArrayList<>();

        Integer count = null;
        String line;
        while ( (line = reader.readLine()) != null){
            if (count != null && line.contains(" ")) {
                Sequence seq = new Sequence();
                seq.parseSeq(count, line.split(" "));
                sequencies.add(seq);
            } else{
                count = parseInt(line);
            }
        }
        sequencies.forEach( sequence -> {
            writer.writeLine(Checker.isZeroSeq(sequence.getSequence()) ? "yes":"no");
        });
        reader.close();
        writer.close();
    }

}

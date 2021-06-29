package db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sequence {
    @Id
    @GeneratedValue
    private long id;

    private List<Integer> sequence;

    public Sequence() {
        this.sequence = new ArrayList<Integer>();
    }

    public List<Integer> getSequence() {
        return sequence;
    }
}

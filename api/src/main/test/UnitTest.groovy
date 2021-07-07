import domain.DbService
import domain.Sequence
import main.Application
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = Application.class)
class UnitTest extends Specification {

    @Autowired
    private DbService service;

    def "try save sequence"() {
        expect: "Sequence stored in DB"
        Sequence seq = new Sequence();
        seq.setCount(3);
        seq.setSequence('1 2 3');
        when:
            Long id = service.addSeq(seq);
            Sequence storedSeq = service.getSeq(id);
        then:
            seq.getCount() == storedSeq.getCount() && seq.getSequence().equals(storedSeq.getSequence());
    }
}

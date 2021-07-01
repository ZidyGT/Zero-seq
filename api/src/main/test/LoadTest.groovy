import api.ApplicationController
import domain.DbService
import main.Application
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = Application.class)
class LoadTest extends Specification {

    @Autowired
    private DbService service;

    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        service
    }
}

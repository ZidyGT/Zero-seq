import api.ApplicationController
import main.Application
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = Application.class)
class LoadContextTest extends Specification {

    @Autowired
    private ApplicationController webController;

    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        webController
    }
}

import main.Application
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class ApplicationTest extends Specification{

    @Autowired
    private MockMvc mvc;

    def "E2E test"() {
        expect: "Status is 200"
            def response = mvc.perform(post("/form")
                    .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                    .param("count", "3")
                    .param("sequence", "1 2 3"))
                    .andExpect(view().name("result"))
    }
}

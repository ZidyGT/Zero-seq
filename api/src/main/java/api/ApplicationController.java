package api;

import domain.DbService;
import domain.Sequence;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Log4j2
@Controller
public class ApplicationController{

    @Autowired
    DbService service;


    @GetMapping("/")
    public String View(Sequence sequence){
        return "form";
    }

    @GetMapping("/forms")
    public ResponseEntity<List<Sequence>> getForms(){
        List <Sequence> sequences = service.getSeqs();
        log.info("Returning " + sequences.size() + "sequencies");
        return new ResponseEntity<List<Sequence>>(sequences, HttpStatus.OK);
    }

    @PostMapping("/form")
    public String addForm(@Valid Sequence seq, BindingResult result){
        log.info("Sending " + seq.toString());
        if (result.hasErrors()) {
            return "form";
        }
        Long id = service.addSeq(seq);
        return "result";
    }
}

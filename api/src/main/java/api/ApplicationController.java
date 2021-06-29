package api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController{

    @GetMapping("/ui")
    public String View(Model model){
        return "form";
    }
}

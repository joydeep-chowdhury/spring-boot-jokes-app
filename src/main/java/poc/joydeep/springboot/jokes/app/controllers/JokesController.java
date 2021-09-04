package poc.joydeep.springboot.jokes.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import poc.joydeep.springboot.jokes.app.services.JokesService;

@Controller
public class JokesController {

    private final JokesService jokesService;


    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());

        return "index";
    }
}

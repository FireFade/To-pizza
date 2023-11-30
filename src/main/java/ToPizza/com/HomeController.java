package ToPizza.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Home Page!");
        return "home";
    }

    @GetMapping("/other")
    public String otherPage(Model model) {
        model.addAttribute("message", "This is the Other Page!");
        return "other";
    }

    @GetMapping("/hawaiian")
    public String hawaiianPage(Model model) {
        model.addAttribute("message", "This is the Hawaiian Page!");
        return "hawaiian";
    }

    @GetMapping("/american")
    public String americanPage(Model model) {
        model.addAttribute("message", "This is the American Page!");
        return "american";
    }

    @PostMapping("/submit")
    public String submit() {
        return "redirect:/other";
    }

    @PostMapping("/back")
    public String back() {
        return "redirect:/home";
    }
}

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

    @PostMapping("/submit")
    public String submit() {
        return "redirect:/other";
    }

    @GetMapping("/PizzaIzolo")
    public String pizzaIzoloPage(Model model) {
        model.addAttribute("message", "This is the PizzaIzolo Page!");
        return "PizzaIzolo";
    }

    @PostMapping("/back")
    public String back() {
        return "redirect:/home";
    }

    @GetMapping("/Reviews")
    public String reviewsPage(Model model) {
        model.addAttribute("message", "This is the Reviews Page!");
        return "Reviews";
    }
}

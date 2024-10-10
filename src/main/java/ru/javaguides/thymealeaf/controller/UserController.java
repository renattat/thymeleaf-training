package ru.javaguides.thymealeaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.javaguides.thymealeaf.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {


    // handle method to handle variable-expression request
    // http://localhost:8080/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Ramesh", "remesh@gmail.com", "AMDIN", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    // handle method to handle selection expression
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Ramesh", "remesh@gmail.com", "AMDIN", "male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // handle method to handle message expressions request
    // http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression(Model model) {
        return "message-expression";
    }

    // handler method to handle link expressions
    // http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    // handle method to handle fragment expression
    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("users")
    public String users(Model model) {
        User admin = new User("Admin", "admin@gmail.con", "ADMIN", "MALE");
        User ramish = new User("Ramish", "ramish@gmail.con", "USER", "MALE");
        User meena = new User("Meana", "meena@gmail.con", "USER", "FEMALE");

        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramish);
        users.add(meena);

        model.addAttribute("users", users);
        return "users";
    }



    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Admin", "admin@gmail.con", "ADMIN", "MALE");
        User ramish = new User("Ramish", "ramish@gmail.con", "USER", "MALE");
        User meena = new User("Meana", "meena@gmail.con", "USER", "FEMALE");

        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramish);
        users.add(meena);

        model.addAttribute("users", users);
        return "if-unless";
    }

    @GetMapping("switch-case")
    public String switchCase(Model model) {
        User user = new User("Ramish", "admin@gmail.con", "USER", "MALE");

        model.addAttribute("user", user);
        return "switch-case";
    }




























}

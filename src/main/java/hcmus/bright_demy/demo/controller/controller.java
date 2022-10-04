package hcmus.bright_demy.demo.controller;

import hcmus.bright_demy.demo.model.User;
import hcmus.bright_demy.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class controller {
    @Autowired
    UserService service;

    @GetMapping(value = "/user/list", produces = "application/json")
    public String getUsers(Model model){
        List<User> users = service.getUsers();
        for(User user: users){
            System.out.println(user);
        }
        model.addAttribute("users",users);
        return "users";
    }
}

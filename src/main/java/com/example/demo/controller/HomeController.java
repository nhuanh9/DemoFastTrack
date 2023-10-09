package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    ArrayList<Car> listCar = new ArrayList<>();
    ArrayList<User> listUser = new ArrayList<>();


    @GetMapping("/register")
    public String showRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String register(User user) {
        listUser.add(user);
        return "login";
    }

    @PostMapping("/login")
    public String login(User user) {
        for (int i = 0; i < listUser.size(); i++) {
            if (user.getUsername().equals(listUser.get(i).getUsername()) && user.getPassword().equals(listUser.get(i).getPassword())) {
                return "redirect:/index";
            }
        }

        return "redirect:/";
    }

    @PostMapping("/add-car")
    public String saveNewCar(Car car) {
        listCar.add(car);
        return "redirect:/index";
    }


    @GetMapping("/index")
    public String home(Model model) {
        model.addAttribute("listCar", listCar);
        return "index";
    }

    @GetMapping("/add-car")
    public String showAddCar() {
        return "addCar";
    }

    @GetMapping("/")
    public String showLogin() {
        return "login";
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

import java.util.stream.Collectors;

@Controller
public class CarController {

    @Autowired
    Service service;

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false) int count, ModelMap model) {

        model.addAttribute("carsList", service.getList().stream().limit(count).collect(Collectors.toList()));
        return "cars";
    }
}

package controller;

import model.Custommer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustommerService;

import java.util.List;

@Controller
@RequestMapping("/custommer")
public class CustommerController {
    CustommerService custommerService = new CustommerService();
    @GetMapping ("")
    public ModelAndView display(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Custommer> custommerList = custommerService.findAll();
        modelAndView.addObject("name", custommerList);
        return modelAndView;
    }





}

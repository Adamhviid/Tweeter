package com.example.demo.controllers;


import com.example.demo.models.Twit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TwitController {
    Twit displayTwit = new Twit("","");

    @GetMapping("/")
    public String index(Model twitModel) {
        twitModel.addAttribute("displayTwit", displayTwit);
        return "index";
    }

    @PostMapping("/postTwit")
    public String postTwit(WebRequest formData) {
        String twitName = new String(formData.getParameter("twitName"));
        String twitText = new String(formData.getParameter("twitText"));
        Twit setDisplayTwit = new Twit(twitName,twitText);
        displayTwit = setDisplayTwit;

        return "redirect:/";
    }
}

package com.g4.fauxexchange.controller;

import com.g4.fauxexchange.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlgorithmController {
    @GetMapping("/result")
    public String result() {
        return "result";
    }
}
package com.cqu.romantic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoveController {
    @RequestMapping("/")
    String love() {
        return "Love.html";
    }
}

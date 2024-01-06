package io.export.exportadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexOperationController {

    @RequestMapping("/home/login")
    public String login() {
        return "operation_services/index";
    }

    @RequestMapping("/home/admin")
    public String admin() {
        return "operation_services/admin";
    }

    @RequestMapping("/home/home")
    public String home() {
        return "operation_services/home";
    }
}

package io.export.exportadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexOperationController {

    @RequestMapping("/export_v1/login")
    public String login() {
        return "operation_services/index";
    }

    @RequestMapping("/export_v1/admin")
    public String admin() {
        return "operation_services/admin";
    }

    @RequestMapping("/export_v1/home")
    public String home() {
        return "operation_services/home";
    }

    @RequestMapping("/export_v1/payments")
    public String payments() {
        return "operation_services/payments";
    }

    @RequestMapping("/export_v1/period")
    public String period() {
        return "operation_services/period";
    }

    @RequestMapping("/export_v1/registration")
    public String registration() {
        return "operation_services/registration";
    }


    @RequestMapping("/export_v1/representative")
    public String representative() {
        return "operation_services/representative";
    }

    @RequestMapping("/export_v1/salon")
    public String salon() {
        return "operation_services/salon";
    }


    @RequestMapping("/export_v1/school")
    public String school() {
        return "operation_services/school";
    }


    @RequestMapping("/export_v1/section")
    public String section() {
        return "operation_services/section";
    }

    @RequestMapping("/export_v1/student")
    public String student() {
        return "operation_services/student";
    }

    @RequestMapping("/export_v1/subject")
    public String subject() {
        return "operation_services/subject";
    }

    @RequestMapping("/export_v1/teacher")
    public String teacher() {
        return "operation_services/teacher";
    }





}

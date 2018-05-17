package com.example.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class CalculatorController {

    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String calculatorForm() {
        return "calculatorForm";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public String calculator(HttpServletRequest request, Model model) {
        Float val1 = Float.valueOf(request.getParameter("val1"));
        Float val2 = Float.valueOf(request.getParameter("val2"));
        String sign = request.getParameter("sign");

        model.addAttribute("result", Calculator.getResult(val1, val2, sign));
        return "result";
    }
}

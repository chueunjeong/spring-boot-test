package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class Controller2 {

    @RequestMapping("test1")
    public String test1(Model model) {
        model.addAttribute("message", "안녕하세요");
        return "second/test1";
    }

    @RequestMapping("test2")
    public String test2(Model model) {
        Product product = new Product("맥주", 2000);
        model.addAttribute("product", product);
        return "second/test2";
    }
    @RequestMapping("test3")
    public String test3(Model model) {
        Student student=new Student(1,"201332038","추은정","miho7724@gmail.com");
        model.addAttribute("student", student);
        return "second/test3";
    }

}

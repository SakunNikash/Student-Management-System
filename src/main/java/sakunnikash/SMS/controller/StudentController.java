package sakunnikash.SMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sakunnikash.SMS.service.StudentService;

@Controller
public class StudentController {
    private StudentService StudentService;

    public StudentController(StudentService studentService) {
        StudentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", StudentService.getAllStudents());
        return  "students";
    }
}

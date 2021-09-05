package sakunnikash.SMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sakunnikash.SMS.entity.Student;
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

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        StudentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",StudentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
        Student exStudent = StudentService.getStudentById(id);
        exStudent.setId(id);
        exStudent.setFirstName(student.getFirstName());
        exStudent.setLastName(student.getLastName());
        exStudent.setEmail(student.getEmail());

        StudentService.updateStudent(exStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        StudentService.deleteStudentById(id);
        return "redirect:/students";
    }
}

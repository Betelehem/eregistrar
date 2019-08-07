package edu.mum.studentcrud.controller;

import edu.mum.studentcrud.domin.Student;
import edu.mum.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
//@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/listStudent")
    public ModelAndView findAll(){
                List<Student> students = studentService.findAll();
                ModelAndView modelAndView= new ModelAndView();
                modelAndView.addObject("students",students);
                modelAndView.setViewName("list");
        return modelAndView;
    }

    @GetMapping("/newStudent")
    public String addnewstuform(Model model){

        model.addAttribute(new Student());

        return "student";
    }
    @GetMapping("students/{studId}")
    public Student getStudent(@PathVariable Integer studId){
        Student stud=studentService.findById(studId);
        if(stud== null){
             throw new RuntimeException("Strudent Id not found" +studId);
        }
        return stud;
    }

    @PostMapping("/students")
    public String addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result){

        //student.setId(null);
        studentService.save(student);


        return "redirect:listStudent";

    }
    @GetMapping("/editStudent")
    public String updateStudent(@RequestParam("studentId") Integer studentId,Model model){

        model.addAttribute("student", studentService.findById(studentId));
        return  "student";
    }

    @GetMapping("/deletestudents")
    public String deleteStudent(@RequestParam("studentId") Integer studentId,Model model) {
        Student student = studentService.findById(studentId);
        if (student == null) {
            throw new RuntimeException("Student id not found" );
        }
        studentService.deleteById(studentId);
        return "redirect:/listStudent";
    }
    }





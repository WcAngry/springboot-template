package com.itheima.springbootweek02.Controller;

import com.itheima.springbootweek02.entity.Student;
import com.itheima.springbootweek02.service.StudentService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @ Resource
    private StudentService studentService;

    @PostMapping
    public String createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return "success";
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    public Student getStudentByName(@RequestParam String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/all")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student student) {
        studentService.updateStudentById(id, student);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "success";
    }
}
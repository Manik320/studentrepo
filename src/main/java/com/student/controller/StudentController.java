package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

 @Autowired
 private StudentService studentService;

 @GetMapping
 public List<Student> getAllStudents() {
     return studentService.getAllStudents();
 }

 @PostMapping("/add")
 public Student addStudent(@RequestBody Student student) {
     return studentService.addStudent(student);
 }
 
 @GetMapping("/{id}")
 public Optional<Student> getStudentById(@PathVariable Long id) {
     return studentService.getStudentById(id);
 }

// @PostMapping
// public Student addStudent(@RequestBody Student student) {
//     return studentService.addStudent(student);
// }

 @DeleteMapping("/{id}")
 public void deleteStudent(@PathVariable Long id) {
     studentService.deleteStudent(id);
 }

 @PostMapping("/update")
 public Student updateStudent(@RequestBody Student student) {
     return studentService.updateStudent(student);
 }
}

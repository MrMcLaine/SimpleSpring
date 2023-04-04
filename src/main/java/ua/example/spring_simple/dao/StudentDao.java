package ua.example.spring_simple.dao;

import ua.example.spring_simple.entity.Student;

import java.util.List;

public interface StudentDao {

    Student create(Student student);

    Student read(Integer id);

    Student update(Student student);

    void delete(Integer id);

    List<Student> readAll();
}

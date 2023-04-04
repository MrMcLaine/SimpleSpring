package ua.example.spring_simple.dao.impl;

import ua.example.spring_simple.dao.StudentDao;
import ua.example.spring_simple.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private List<Student> student_db = new ArrayList<>();


    @Override
    public Student create(Student student) {
        student_db.add(student);
        return student;
    }

    @Override
    public Student read(Integer id) {
        return student_db.get(id - 1);
    }

    @Override
    public Student update(Student student) {
        Student studentFromDB = student_db.get(student.getId() - 1);
        studentFromDB.setName(student.getName());
        studentFromDB.setAge(student.getAge());
        return studentFromDB;
    }

    @Override
    public void delete(Integer id) {
        student_db.remove(student_db.get(id - 1));
    }

    @Override
    public List<Student> readAll() {
        return student_db;
    }
}

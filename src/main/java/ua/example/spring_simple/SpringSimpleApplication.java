package ua.example.spring_simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.example.spring_simple.dao.StudentDao;
import ua.example.spring_simple.entity.Student;

@SpringBootApplication
public class SpringSimpleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringSimpleApplication.class, args);

        StudentDao studentDao = ctx.getBean(StudentDao.class);

        Student created = new Student(1, "Some testing name", 19);
        Student updated = new Student(1, "Some name for update", 20);

        //create
        studentDao.create(created);

        //read
        studentDao.read(1);

        //update
        studentDao.update(updated);

        //read all
        studentDao.readAll();

        //delete
        studentDao.delete(1);

    }

}

package ua.example.spring_simple.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.example.spring_simple.dao.StudentDao;
import ua.example.spring_simple.dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {
    @Bean(name = "studentDao")
    public StudentDao getStudentDao() {
        return new StudentDaoImpl();
    }
}

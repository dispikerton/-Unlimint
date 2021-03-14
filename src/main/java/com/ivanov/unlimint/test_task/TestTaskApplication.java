package com.ivanov.unlimint.test_task;

import com.ivanov.unlimint.test_task.parsers.Parser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskApplication.class, args);

        Parser parser = new Parser();
        parser.parse(args);
    }
}

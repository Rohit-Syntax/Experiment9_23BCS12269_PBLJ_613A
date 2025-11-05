package com.cu.parta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s = ctx.getBean(Student.class);
        s.show();
        ctx.close();
    }
}

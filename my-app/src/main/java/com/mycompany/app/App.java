package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/Beans.xml");
        Curso _curso = applicationContext.getBean("miCurso", Curso.class);
        String nombreProfe = _curso.getProfesor().getNombre();

        System.out.print(nombreProfe);

    }
}

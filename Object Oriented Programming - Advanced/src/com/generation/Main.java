package com.generation;
import com.generation.Courses.*;
import com.generation.Students.*;


public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addNewStudent( "1030", new Student( "Carlos", "1030", 31 ));
        studentService.addNewStudent( "1040", new Student( "Ian", "1020", 28 ));
        studentService.addNewStudent( "1050", new Student( "Elise", "1020", 26 ));
        studentService.addNewStudent( "1020", new Student( "Santiago", "1020", 33 ));

        studentService.enrollStudents( "Math", "1030" );

        //System.out.println(studentService.getStudents()); 

        studentService.getAllData();

    }
}

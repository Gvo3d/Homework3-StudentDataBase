package App;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Gvozd on 19.11.2015.
 */
public class Application {
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {

    students.add( new Student("Denis", "Yakimov", 2) );
        for(Student str: students){
            System.out.println(str);
        }

    }



}
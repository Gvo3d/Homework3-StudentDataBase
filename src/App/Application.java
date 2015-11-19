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
        students.add( new Student("Denis", "Volohov", 2) );
        students.add( new Student("Denis", "Kirilyk", 2) );
        students.add( new Student("Denis", "Bondar", 2) );
        students.add( new Student("Denis", "Chumachenko", 2) );

        Collections.sort(students);

        for(Student str: students){
            System.out.println(str.getComparableSurname());
        }

    }



}
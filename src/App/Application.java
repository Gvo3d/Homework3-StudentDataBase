package App;

import java.lang.reflect.Array;
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


        for(Student str: students){
            System.out.println(str.getComparableSurname());
        }

        for(int i=0; i< students.size(); i++) System.out.println(students.toArray()[i]);

    }

    public static void SortingStudents(Array target[]){
        int arraylength = target.length;
        String sort[] = new String[arraylength];
        System.arraycopy(target, 0, sort, 0, 1);


    }


}
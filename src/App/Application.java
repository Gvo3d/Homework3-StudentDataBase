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

    public static void SortingStudents(){
        int arraylength = students.size();
        for (int i = 0; i < students.size()-1; i++){
            for (int j = 0; j<students.size() -i-1; j++){
                boolean comparingstudents = students.sort(students.a);


                if (a[j]<a[j+1]) {
                    bubble = a[j+1];
                    a[j+1]=a[j];
                    a[j]=bubble;
                }
            }
        }

        for (int i=0; i<a.length; i++)
            System.out.println(a[i]);

    }


}
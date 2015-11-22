package App;

public class Application {
    private static int groupcount;

    public static void main(String[] args) {
    Group gr1=GroupCreate();
        gr1.Add("Denis", "Yakimov");



         for (int i=1; i<=gr1.FilledUpTo(); i++) System.out.println(gr1.Student(i));




//    students.add( new Student("Denis", "Yakimov", 2) );
//        students.add( new Student("Denis", "Volohov", 2) );
//        students.add( new Student("Denis", "Kirilyk", 2) );
//        students.add( new Student("Denis", "Bondar", 2) );
//        students.add( new Student("Denis", "Chumachenko", 2) );
//
//
//        for(Student str: students){
//            System.out.println(str.getComparableSurname());
//        }
//
//        for(int i=0; i< students.size(); i++) System.out.println(students.toArray()[i]);
//
//    }
//
//    public static void SortingStudents(){
//        int arraylength = students.size();
//        for (int i = 0; i < students.size()-1; i++){
//            for (int j = 0; j<students.size() -i-1; j++){
//                boolean comparingstudents = students.sort(students.a);
//
//
//                if (a[j]<a[j+1]) {
//                    bubble = a[j+1];
//                    a[j+1]=a[j];
//                    a[j]=bubble;
//                }
//            }
//        }
//
//        for (int i=0; i<a.length; i++)
//            System.out.println(a[i]);

    }

    public static Group GroupCreate(){
        Group newgroup = new Group(groupcount+1);
        groupcount++;
        return newgroup;
    }
}
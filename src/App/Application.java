package App;

public class Application {
    private static int groupcount=0;
    private static Group grouparray[] = new Group[1];

    public static void main(String[] args) {
        GroupArrayInit();

//        GroupCreate();

        grouparray[0].Add("Denis", "Yakimov");
        grouparray[0].Add("Penis", "Takimov");
        grouparray[0].Add("Menis", "Rakimov");
        grouparray[0].Add("Benis", "Fakimov");
        grouparray[0].Add("Tenis", "Dakimov");

        for (int i = 1; i <= grouparray[0].FilledUpTo(); i++) System.out.println(grouparray[0].Student(i));

//        for (int i = 0; i<grouparray.length; i++) System.out.println(grouparray[i].groupId);
//        System.out.println("Group "+grouparray[1].IdShow()+ " has "+grouparray[1].FilledUpTo()+ " students.");


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

    public static void GroupCreate() {
        if (groupcount >= grouparray.length) {
            Group newgroups[] = new Group[groupcount + 1];

            for (int i = 0; i < grouparray.length; i++) {
                newgroups[i] = grouparray[i];
            }
            newgroups[groupcount] = new Group(groupcount);
            groupcount++;
            grouparray = newgroups;
        } else {
            grouparray[groupcount] = new Group(groupcount);
            groupcount++;
        }
        System.out.println("Group \"" + (groupcount-1) + "\" created.");
    }

    public static void GroupArrayInit() {
        grouparray[0] = new Group(groupcount);
        groupcount++;
    }

}
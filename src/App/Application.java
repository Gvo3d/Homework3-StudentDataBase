package App;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Application {
    private static int groupcount=0;
    private static Group grouparray[] = new Group[1];

    public static void main(String[] args) {
        GroupArrayInit();
        GroupCreate();

        grouparray[0].Add("Denis", "Yakimov");
        grouparray[0].Add("Penis", "Takimov");
        grouparray[0].Add("Menis", "Rakimov");
        grouparray[0].Add("Benis", "Fakimov");
        grouparray[0].Add("Tenis", "Dakimov");


        grouparray[1].Add("Konstantin", "Kirilyk");
        grouparray[1].Add("Ponstantin", "Lirilyk");
        grouparray[1].Add("Ronstantin", "Pirilyk");
        grouparray[1].Add("Gonstantin", "Mirilyk");
        grouparray[1].Add("Bonstantin", "Dirilyk");
        grouparray[1].Add("Wonstantin", "Zirilyk");
        grouparray[1].Add("Tonstantin", "Firilyk");

        for (int i=0; i<=grouparray[0].FilledUpTo(); i++) grouparray[0].setStudentMarks(i, new int[]{1, 2, 3, 4, 5, 6, 7});
        for (int i=0; i<=grouparray[1].FilledUpTo(); i++) grouparray[1].setStudentMarks(i, new int[]{5, 2, 3, 8, 5, 9, 7});


        System.out.println("StudentDataBase");
        System.out.println("Made by Denis Yakimov for Hillel School");
        System.out.println();
        System.out.println("Commands: ");
        System.out.println("\"a\"-add a student to a group");
        System.out.println("\"h\"-delete a student from a group");
        System.out.println("\"f\"-find a student from a group");
        System.out.println("\"n\"-create a group");
        System.out.println("\"c\"-clear a group");
        System.out.println("\"d\"-delete a group");
        System.out.println("\"l\"-show group list");
        System.out.println("\"s\"-show group students list");
        System.out.println("\"j\"-join two groups");
        System.out.println("\"e\"-show if groups are equals");
        System.out.println("\"g\"-search for a number of students in group");
        System.out.println("\"q\"-quit program");

        while (true) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        switch (input) {
            case "a":
                AddStudent();
                break;
            case "h":
                DeleteStudent();
                break;
            case "f":
                FindAStudent();
                break;
            case "n":
                GroupCreate();
                break;
            case "c":
                GroupClear();
                break;
            case "d":
                GroupDelete(GetGroupID());
                break;
            case "l":
                GroupList();
                break;
            case "s":
                GroupStudentsList();
                break;
            case "j":
                GroupJoin();
                break;
            case "e":
                System.out.println(GroupComparsion());
                break;
            case "g":
                MassSearch();
                break;
            case "q":
                System.exit(0);
                break;


            default: {
            }
            }
        }

        //Output
//        if (!errthrow) System.out.println("Result is:" + result);



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

    private static void GroupStudentsList() {
        int group = GetGroupID();
            for (int i=1; i<grouparray[group].length; i++) {
                System.out.println(grouparray[group].StudentToString(i));
            }

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
        System.out.println("Group \"" + (groupcount) + "\" created.");
    }

    public static void GroupClear() {
        int group = GetGroupID();
        if (GroupSearch(group) != 0) {
            grouparray[GroupSearch(group)]= null;
            grouparray[GroupSearch(group)].length=0;
            System.out.println("Group cleared!");
        } else System.out.println("No such group!");
    }

    public static void GroupArrayInit() {
        grouparray[0] = new Group(groupcount+1);
        System.out.println("Group \"1\" created.");
        groupcount++;
    }

    public static void GroupDelete(int groupnumber) {
        grouparray[groupnumber] = null;
    }

    public static int GetGroupID() {
        int number=0;
        System.out.println("Input a group ID ");
        while (number == 0) {
                        Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                number = in.nextInt();
                number=GroupSearch(number);
            } else System.out.println("Error in data input, reinput number!");
        }
        return number;
    }

    public static int GroupSearch(int group){
        int result=0;
        for (int i = 0; i<groupcount; i++) {
            if (grouparray[i].IdShow() == group) {
                result = i;
            } else {
                System.out.println("This group is not exist");
            return 0;}
            }
            return result;
        }

    public static String InputName (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student name.");
     return scanner.nextLine();
    }

    public static String InputSurname (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student surname.");
        return scanner.nextLine();
    }

    public static void AddStudent () {
        int group = GetGroupID();
        String name = InputName();
        String surname = InputSurname();
        if (GroupSearch(group) != 0) {
            grouparray[GroupSearch(group)].Add(name, surname);
            System.out.println("Student added!");
        } else System.out.println("Student is NOT added.");
    }

    public static void DeleteStudent () {
        boolean makeflag = false;
        int group = GetGroupID();
        String surname = InputSurname();
        if (GroupSearch(group) != 0) {
            for (int i = 0; i<=grouparray[GroupSearch(group)].FilledUpTo(); i++) {
                if (grouparray[GroupSearch(group)].students[i].getSurname().equals(surname)) {
                    grouparray[GroupSearch(group)].StudentDelete(i);
                    makeflag = true;
                }
            }
            if (!makeflag) {
                System.out.println("Can't delete!");
            } else System.out.println("Student deleted! Array is automatically trimmed.");
        }
    }

    public static void FindAStudent() {
        int group = GetGroupID();
        String surname = InputSurname();
        String searcheable = grouparray[GroupSearch(group)].Find(surname);
        if (searcheable.equals("")) {
            System.out.println("No such student at "+ group+ " group!");
        } else System.out.println(searcheable);
    }

    public static void GroupList () {
        for (int i=0; i<grouparray.length; i++) {
            System.out.println("Group "+i+" with "+grouparray[i].FilledUpTo()+" students");
        }
    }

    public static void GroupJoin() {
        System.out.println("Enter 2 group IDs, first one would be extended with second one students.");
        int group = GetGroupID();
        int group2 = GetGroupID();
        group=GroupSearch(group);
        group2=GroupSearch(group2);
        if ((group !=0) && (group2 !=0)) {
            grouparray[group].ChangeArrayLength(grouparray[group].length+ grouparray[group2].length);
            for (int i=0; i<grouparray[group2].length; i++) {
                grouparray[group].Add(grouparray[group2].students[i].getName(), grouparray[group2].students[i].getSurname());
                grouparray[group].setStudentMarks(i + grouparray[group].FilledUpTo() - 1, grouparray[group2].getStudentMarks(i));
            }
        } else System.out.println("Group ID error!");
    }

    public static String GroupComparsion() {
        System.out.println("Enter 2 group IDs.");
        int group = GetGroupID();
        int group2 = GetGroupID();
        group=GroupSearch(group);
        group2=GroupSearch(group2);
        for (int i=0; i<grouparray[group].length; i++) {
            if (!(grouparray[group].students[i].equals(grouparray[group2].students[i]))) {
                return "Groups are not equal!";
            }
        }
        return "Groups are equal!";
    }

    public static void StudentCompare(int group, String surname) {
        String searcheable = grouparray[group].Find(surname);
        if (!(searcheable.equals(""))) {
            System.out.println("Student "+surname+" is at "+ group+ " group!");
        }
    }

    public static void MassSearch() {
        String search="";
        int i=0;
        String arrayofstudents[] = new String[30];
        System.out.println("Enter student surnames(up to 30), end your input with \"q\" symbol.");
        while (!(search.equals("q"))) {
            Scanner scanner = new Scanner(System.in);
            search = scanner.nextLine();
            arrayofstudents[i]=search;
            i++;
        }
        for (int j=0; j<arrayofstudents.length; j++) {
            for (int m=0; m<grouparray.length; m++) {
                StudentCompare(m, arrayofstudents[j]);
            }
        }
    }
}
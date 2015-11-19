package App;

public class Student implements Comparable{
    public String name;
    public String surname;
    public int group;
    public int mark[];

    public Student(String name, String surname, int group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(byte group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public char getComparableSurname() {
        String upperfirstletter;
        upperfirstletter = String.valueOf(surname.charAt(0));
        upperfirstletter = upperfirstletter.toUpperCase();
        return upperfirstletter.charAt(0);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMark(int markindex) {
        return mark[markindex];
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student comparablestudent) {
        int thissurname, hissurname;
        char thissurnamechar = this.getComparableSurname();
        char hissurnamechar = comparablestudent.getComparableSurname();
        thissurname = (int) thissurnamechar;
        hissurname = (int) hissurnamechar;
    if (thissurname>hissurname) {
        return 1;
    } else return 0;
    }

    @Override
    public String toString() {
        String resultofstudent = surname + " " + name + " from " + group + " gr";
        return resultofstudent;
    }

}

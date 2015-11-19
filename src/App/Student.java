package App;

/**
 * Created by Gvozd on 19.11.2015.
 */
public class Student {
    private String name;
    private String surname;
    private byte group;
    private byte mark[];

    public Student(String name, String surname, byte group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public byte getGroup() {
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getMark(int markindex) {
        return mark[markindex];
    }

    public void setMark(byte[] mark) {
        this.mark = mark;
    }
}

package App;

public class Group {
    private int groupId;
    public int length=1;
    private int filledUpTo;
    private Student[] students = new Student[1];

    public Group(int groupId) {
        this.groupId = groupId;
        this.filledUpTo = 0;
        this.ChangeArrayLength(10);
    }

    public void ChangeArrayLength(int newlength){
        Student[] newstudents = new Student[newlength];

        for (int i = 0; i<length; i++) {
        newstudents[i]=students[i];
        }
        for (int i = students.length; i<newlength; i++) {
            newstudents[i] = new Student ("", "", groupId);
        }
        students = newstudents;
        this.length = students.length;
    }

    public void Add (String name, String surname){
        if (length>filledUpTo) {
            students[filledUpTo+1] = new Student (name, surname, groupId);
            filledUpTo++;
        } else { ChangeArrayLength(length+1);
        this.Add(name, surname); }
    }

    public String Student(int studentindex){
        return students[studentindex].toString();
    }

    public int FilledUpTo(){
        return this.filledUpTo;
    }

    public int IdShow(){
        return this.groupId;
    }

}

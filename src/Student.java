public class Student implements Observer, DisplayElement {
    private int totalNumberOfStudents;
    private String studentName;
    private Subject studentData;
    public Student(Subject studentData, String Name) {
        this.studentData  = studentData;
        this.studentName = Name;
        studentData.registerObserver(this, Name);
    }
    public void update(int count, String Name) {
        this.totalNumberOfStudents = count;
        display(Name);
    }
    public void display(String Name) {
        System.out.println("Hi "+ this.studentName + ", We got a new Subscriber :). \nPlease welcome new joinee: " + Name +". \nNow our total Subcribers are:"+totalNumberOfStudents);
    }
}
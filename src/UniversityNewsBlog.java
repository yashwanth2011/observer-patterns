/*
 * The following class is used to notify individual students
 * who subscribed to UniversityNewsBlog about new admissions.
 * By default while admission every student is a subscriber.
 * If any students wants to unsubscribe it can be done later, as haapened below in case of Reddy.
 */

public class UniversityNewsBlog {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        Student newStudent1 = new Student(studentData, "Reddy");
        Student newStudent2 = new Student(studentData, "Katray");
        Student newStudent3 = new Student(studentData, "Friday");
        studentData.removeObserver(newStudent1); // removeObserver is considered as unsubscription
        Student newStudent4 = new Student(studentData, "Jarvis");
        Student newStudent5 = new Student(studentData, "tony");
        Student newStudent6 = new Student(studentData, "Stark");
    }
}
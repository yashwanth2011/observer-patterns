import java.util.*;

public class StudentData implements Subject {
    private ArrayList students;
    public StudentData() {
        students = new ArrayList();
    }
    public void registerObserver(Observer o, String Name) {
        students.add(o);
        studentCountChanged(Name);
    }
    public void removeObserver(Observer o) {
        int i = students.indexOf(o);
        if (i >= 0) {
            students.remove(i);
        }
// I choose not to notify in case of an unsubscription as it doesn't make sense.
    }
    public void studentCountChanged(String Name) {
        notifyObservers(Name);
    }
    public void notifyObservers(String Name) {
        int i;
        for (i = 0; i < students.size(); i++) {
            Observer student= (Observer) students.get(i);
            student.update(students.size(), Name);
        }
        System.out.println("-----------------------------------------------");


        /* We assume that there is subscriber count box in UniversityNewBlog home page where we can displaythe count.
         *
         * below  stateement is used as a log just to be sure every subscriber got notified.
         * log("Total number of Notifications sent:  "+ i);

         * We can also include several other functions like postNewComment(), postNewEventt(), changeInEvents(), etc..,.
         * And whenever these are excuted students will be notified but we need to use a different DisplayElement Interface.
         */
    }
}
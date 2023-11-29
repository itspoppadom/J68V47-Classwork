package Lesson12Objects.L12E1;

public class L12E1 {
    public static void displayStudent(Student thisStudent){
        System.out.format("(%d) %s %s %n",thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }
    public static void main(String[] args) {
        // create student object and display
        Student student1 = new Student();
        student1.id = 30087241;
        student1.firstName = "Dominic";
        student1.surname = "Cameron";
        student1.present = true ;
        displayStudent(student1);
        // update values of student object and display

    }
}
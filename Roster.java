package com.studentroster;
import java.util.ArrayList;

/**
 * created by joshua harem 15dec2016 for c169 pa
 */

public class Roster {
    
    static ArrayList<Student> students = new ArrayList<>();
    
    //main method of program
    public static void main(String[] args) {
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
            "2,Suzan,Erickson, Erickson_1990@gmailcom,19,91,72,85",
            "3,Jack,Napoli,the_lawyer99@yahoo.com,19,85,84,87",
            "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
            "5,Joshua,Harem,jharem@wgu.edu,30,42,69,99"
        };
        
        //input split by comma
        for (int i = 0; i < students.length; i++) {
            //parse string values
            String characters = students[i];
            String[] arrayVar = characters.split(",");
            String studentId = arrayVar[0];
            String firstName = arrayVar[1];
            String lastName = arrayVar[2];
            String email = arrayVar[3];
            //parse int values
            int age = Integer.parseInt(arrayVar[4]);
            int grade1 = Integer.parseInt(arrayVar[5]);
            int grade2 = Integer.parseInt(arrayVar[6]);
            int grade3 = Integer.parseInt(arrayVar[7]);
            
            //add student to the students array
            Roster.add(studentId, firstName, lastName, email, age, grade1, grade2, grade3);
        }
        
        //print all student info
        Roster.printAll();
        //print invalid emails in roster
        Roster.printInvalidEmails();
        //print average grade 
        Roster.printAverageGrade("1");
        //remove student from roster
        Roster.remove("3");
        //remove same student, expected not found
        Roster.remove("3");
        
    }
    
    //adding new student to roster
    public static void add(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
        Student student = new Student(studentId, firstName, lastName, email, age, grade1, grade2, grade3);
        students.add(student);
    }
    
    //remove a student from roster
    public static void remove(String studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)) {
                students.remove(i);
                System.out.println("Student (" +studentId+ ") has been removed from the roster.");
                return;
            }
        }
        System.out.println("Error: Student with this ID (" +studentId+ ") can not be found.");
    }
    
    //print the student array
    public static void printAll() {
        for (Student student : students) {
            student.print();
        }
    }
    
    //print invalid email
    public static void printInvalidEmails() {
        String invalidEmail = "Email address invalid: ";
        for (Student Student : students) {
            String emailsInRoster = Student.getEmail();
            if (!(emailsInRoster.contains("@")) || (emailsInRoster.contains(" ")) || !(emailsInRoster.contains("."))) {
                System.out.println(invalidEmail + emailsInRoster);
            }
        }
    }
    
    //print student average grade
    public static void printAverageGrade(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                double totalGrades = student.getGrade1() + student.getGrade2() + student.getGrade3();
                double gradeAverage = totalGrades / 3;
                
                System.out.println("Student (" +studentId+ ") overall average grade is " +gradeAverage);
            }
        }
    }
}
    
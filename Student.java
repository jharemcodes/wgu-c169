package com.studentroster;

/**
 * created by joshua harem 15dec2016 for c169 pa
 */

//student class - includes student id, first name, last name, email, age, and grades
public class Student {
    
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int grade1;
    private int grade2;
    private int grade3;
    private final int GRADES = 3;
    int[] grades = new int[GRADES];
    
    //student constructor
    public Student(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setGrade1(grade1);
        setGrade2(grade2);
        setGrade3(grade3);
    }   
    
    //studentId accessor & mutator
    public String getStudentId() {
        return studentId;
    }

    private void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    //firstName accessor & mutator
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }  

    //lastName accessor & mutator
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //email accessor & mutator
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //age accessor & mutator
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //grade1 accessor & mutator
    public int getGrade1() {
        return grades[0];
    }

    public void setGrade1(int grade1) {
        this.grades[0] = grade1;
    }

    //grade2 accessor & mutator
    public int getGrade2() {
        return grades[1];
    }

    public void setGrade2(int grade2) {
       this.grades[1] = grade2;
    }

    //grade3 accessor & mutator
    public int getGrade3() {
        return grades[2];
    }

    public void setGrade3(int grade3) {
        this.grades[2] = grade3;
    }
    
    //print all the student data
    public void print() {
        String tab = "  ";
        String studentId = getStudentId();
        String firstName = getFirstName();
        String lastName = getLastName();
        String email = getEmail();
        int age = getAge();
        int grade1 = getGrade1();
        int grade2 = getGrade2();
        int grade3 = getGrade3();

        System.out.println("Student ID: " +studentId+tab+ " First name: " +firstName+tab+ " Last name: " +lastName+tab+
            " Email: " +email+tab+ " Age: " +age);
    }
}
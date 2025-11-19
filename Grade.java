package Codes;

import java.util.ArrayList;

class Students{
    String name;
    ArrayList<Double> grade = new ArrayList<>();


    Students(String name){
        this.name = name;
        
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    void addGrade(double grade1, double grade2, double grade3){
        grade.add(grade1);
        grade.add(grade2);
        grade.add(grade3);
        System.out.println("Added Grades: " + grade);
    }

    void avgGrade(ArrayList<Double> grade){
        double sum = 0;
        for (int i = 0; i < grade.size(); i++) {
            sum += grade.get(i);
        }

        System.out.println("Average Grade: " + sum/grade.size());
    }
    
}

class ManagementStudent extends Students {
    ArrayList<Students> students = new ArrayList<>();

    ManagementStudent(String name) {
        super(name);
    }

    void addStudent(Students student) {
        students.add(student);
    }

    void display() {
        System.out.println("Name: " + name);
        for (Students student : students) {
            student.display();
        }
    }
}

public class Grade {
    public static void main(String[] args) {
        Students student1 = new Students("John");
        student1.addGrade(90, 80, 70);
        student1.avgGrade(student1.grade);
        student1.display();

        Students student2 = new Students("Doe");
        student2.addGrade(80, 70, 60);
        student2.avgGrade(student2.grade);
        student2.display();

        ManagementStudent managementStudent = new ManagementStudent("Management Student");
        managementStudent.addStudent(student1);
        managementStudent.addStudent(student2);
        managementStudent.display();
    }
}

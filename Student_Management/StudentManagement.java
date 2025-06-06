/*Explaination : This program uses Java Collections (ArrayList) to store and manage the marks of 5 students. 
It calculates the total and average marks for each student.*/

package Student_Management;

import java.util.*;

class Student {
    String name;
    ArrayList<Integer> marks = new ArrayList<>();

    Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks.addAll(marks);
    }

    int totalMarks() {
        int sum = 0;
        for (int m : marks)
            sum += m;
        return sum;
    }

    double averageMarks() {
        return totalMarks() / (double) marks.size();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Total: " + totalMarks());
        System.out.println("Average: " + averageMarks());
        System.out.println();
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", Arrays.asList(78, 85, 90)));
        students.add(new Student("Bob", Arrays.asList(60, 70, 65)));
        students.add(new Student("Charlie", Arrays.asList(88, 92, 79)));
        students.add(new Student("David", Arrays.asList(55, 60, 58)));
        students.add(new Student("Eva", Arrays.asList(95, 98, 96)));

        for (Student s : students) {
            s.display();
        }
    }
}

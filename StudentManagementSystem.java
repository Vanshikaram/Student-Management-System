import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }
    
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.forEach(System.out::println);
        }
    }
    
    public void updateStudent(int id, String newName, String newEmail) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setEmail(newEmail);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    
    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentClass {
    private List<Student> students = new ArrayList<Student>();

    Scanner scanner = new Scanner(System.in);

    public void displayStudentList() {
        System.out.println("Student list");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + 1 + ". ID = " + students.get(i).getId() + ", Name: " + students.get(i).getName() + ", Age = " + students.get(i).getAge());
        }
    }

    public void addNewStudent() {
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        Student student = new Student(id, name, age);
        students.add(student);
    }

    public void checkEditId() {
        System.out.println("Enter the id to edit");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                System.out.println("Enter edit id");
                int idEdit = scanner.nextInt();
                students.get(i).setId(idEdit);
                System.out.println("Enter edit name");
                String name = scanner.next();
                students.get(i).setName(name);
                System.out.println("Enter edit age");
                int age = scanner.nextInt();
                students.get(i).setAge(age);
            }
        }
    }

    public void deleteById() {
        System.out.println("Enter the id to delete");
        int id = scanner.nextInt();
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                student = students.get(i);
            }
        }
        if (student != null) {
            students.remove(student);
            System.out.println("delete successful");
        } else {
            throw new IndexOutOfBoundsException("id not found");
        }
    }

    public void searchName() {
        System.out.println("Enter the name to search");
        String name = scanner.next();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                System.out.println(i + 1 + ". ID = " + students.get(i).getId() + ", Name: " + students.get(i).getName() + ", Age = " + students.get(i).getAge());
                check = true;
            }
        }
        if (!check) {
            throw new IndexOutOfBoundsException("There is no name in the list");
        }
    }

    public void searchId() {
        System.out.println("Enter the id to search");
        int id = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                System.out.println(i + 1 + ". ID = " + students.get(i).getId() + ", Name: " + students.get(i).getName() + ", Age = " + students.get(i).getAge());
                check = true;
            }
        }
        if (!check) {
            throw new IndexOutOfBoundsException("id not found");
        }
    }
}

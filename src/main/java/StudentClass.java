import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentClass {
    private List<Student> studentList = new ArrayList<Student>();

    public void displayStudentList (){
        for (int i = 0; i < studentList.size(); i++){
            System.out.println( i +". Name: " + studentList.get(i).getName() + ", Aeg = " + studentList.get(i).getAeg());
        }
    }
    public void addNewStudent (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();
        System.out.println("Enter aeg");
        int aeg = input.nextInt();
        Student student = new Student(name, aeg);
        studentList.add(student);
    }
    public void removeStudent (){
        System.out.println("Select the component you want to delete");
        displayStudentList();
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        Student result = studentList.remove(index);
        System.out.println("delete successful: Name: " + result.getName() + ", Aeg = " + result.getAeg());
    }
}

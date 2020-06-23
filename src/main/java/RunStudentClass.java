import java.util.Scanner;

public class RunStudentClass extends StudentClass {

    public static void main(String[] args) {
        RunStudentClass studentClass = new RunStudentClass();
        Scanner input = new Scanner(System.in);
        int choose;

        do {
            System.out.println("Choose a function");
            System.out.println("1. Display list");
            System.out.println("2. Add to the list");
            System.out.println("3. Delete from list");
            System.out.println("0. Exit!");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Student list");
                    studentClass.displayStudentList();
                    break;
                case 2:
                    studentClass.addNewStudent();
                    break;
                case 3:
                    studentClass.removeStudent();
                    break;
            }
        } while (choose != 0);
    }
}

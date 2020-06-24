import java.util.Scanner;

public class RunStudentClass extends Student {

    public static void main(String[] args) {
        StudentClass students = new StudentClass();
        Scanner input = new Scanner(System.in);
        int choose;

        do {
            System.out.println("Choose a function");
            System.out.println("1. Print the student list");
            System.out.println("2. Add to the list");
            System.out.println("3. Edited by id");
            System.out.println("4. Search by name");
            System.out.println("5. Search by id");
            System.out.println("6. Delete by id");
            System.out.println("0. Exit!");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    students.displayStudentList(); break;
                case 2:
                    students.addNewStudent(); break;
                case 3:
                    students.checkEditId(); break;
                case 4:
                    students.searchName(); break;
                case 5:
                    students.searchId(); break;
                case 6:
                    students.deleteById();
            }
        } while (choose != 0);
    }
}

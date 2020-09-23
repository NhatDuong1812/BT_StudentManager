import java.util.ArrayList;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Menu mn = new Menu();
//        studentArrayList.add(mn.add(studentArrayList));
//        mn.show(studentArrayList);
        do {
            System.out.println("STUDENT MANAGER");
            System.out.println("1. Add student. ");
            System.out.println("2. Delete student. ");
            System.out.println("3. Search student. ");
            System.out.println("4. Print student. ");
            System.out.print("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    int check = 0;
                    for (Student student : studentArrayList
                    ) {
                        if ((id == student.id)) {
                            check = 1;
                            break;
                        }
                    }
                    if (check == 1) {
                        System.out.println("Id đã tồn tại vui lòng nhập lại");
                    } else {
                        studentArrayList.add(mn.add(studentArrayList, id));
                    }
                    break;
                case 2:
                    studentArrayList.remove(mn.delete(studentArrayList));
                    break;
                case 3:
                    System.out.println("Enter id want find: ");
                    int i = Integer.parseInt(sc.nextLine());
                    System.out.println(mn.search(studentArrayList, i));
                    break;
                case 4:
                    mn.show(studentArrayList);
                    break;
                default:
                    System.out.println("Loi!!");
            }
        } while (true);
    }
}

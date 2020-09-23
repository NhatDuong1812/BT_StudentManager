import java.util.List;
import java.util.Scanner;

public class Menu {
    public Student add(List<Student> studentList , int id) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("-Enter ID: ");
//        int id = Integer.parseInt(sc.nextLine());
//        for (Student student : studentList
//        ) {
//            if ((id != student.id) && (id > 0)) {
//                System.out.print("");
//            } else {
//                System.out.println("Id đã tồn tại vui lòng nhập id khác");
//
//            }
//        }
        System.out.println("-Enter name: ");
        String name = sc.nextLine();
        System.out.println("-Enter date of birth: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("-Enter gender: ");
        String gender = sc.nextLine();
        System.out.println("-Enter class: ");
        String nameClass = sc.nextLine();
        Student p = new Student(id, name, dateOfBirth, gender, nameClass);
        return p ;
    }
    public void show(List<Student> studentList){
        for (Student s: studentList
        ) {
            System.out.println(s.toString());
        }
    }

    public boolean delete(List<Student> studentList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID want find: ");
        int idFind = Integer.parseInt(sc.nextLine());
        // Student s =new Student();
        for (Student  s: studentList
             ) {
            if (idFind == s.id){
                studentList.remove(s);
                System.out.println("Delete complete!!");
                break;
            }
        }
        return true ;
    }

    public Student search(List<Student> studentList, int id){
        Student student = new Student();
        for (Student s: studentList
             ) {
            if (id == s.id){
                student = s;
                break;
            }
        }
        return student ;
    }
}

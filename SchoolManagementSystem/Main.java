package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher ivanka = new Teacher(2,"Ivanka",700);
        Teacher george = new Teacher(3,"George",600);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(ivanka);
        teacherList.add(george);

        Student vera = new Student(1,"Vera",4);
        Student alex = new Student(2,"Alex",12);
        Student tomas = new Student(3,"Tomas",5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(vera);
        studentList.add(alex);
        studentList.add(tomas);

        School vss = new School(teacherList,studentList);


        vera.payFees(5000);
        alex.payFees(6000);
        System.out.println("VSS has earned $" + vss.getTotalMoneyEarned());
        System.out.println("---------MAKING SCHOOL PAY SALARY------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("VSS hase spend fo salary to " + lizzy.getName() + " and now has $"+ vss.getTotalMoneyEarned());
    }
}

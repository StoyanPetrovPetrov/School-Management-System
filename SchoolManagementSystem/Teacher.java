package SchoolManagementSystem;

public class Teacher {
    private int salaryEarnt;
    private int id;
    private String name;
    private int salary;


    public Teacher(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarnt = 0;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void receiveSalary(int salary){
        salaryEarnt += salary;
        School.updateTotalMoneySpend(salary);

    }
}

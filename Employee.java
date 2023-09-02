public class Employee {
    int id;
    double salary;
    String company,city, name;

     Employee()
    {
        System.out.println("This is default constructor");
    }
     Employee(int i,double s,String com,String ci, String n){
        id=i;
        name=n;
        salary=s;
        company=com;
        city=ci;
    }
    public static void main(String[] args){
        Employee emp=new Employee();
        System.out.println("Default constructor called");
        Employee obj=new Employee(12546,94332.7,"Tesla","California","Alex");
        System.out.println("The person named " + obj.name + " with the id "+obj.id + " lives in "+ obj.city+" and works at "+obj.company+" and gets the salary "+ obj.salary);
    }
}

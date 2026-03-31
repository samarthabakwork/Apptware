abstract class Employee{
    private String name;
    private double baseSalary;

   public Employee(String name,double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}


class Developer extends Employee{
    public Developer(String name,double baseSalary){
        super(name,baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()+5000;
    }
}

class Manager extends Employee {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 10000;
    }
}
public class OOPs_Program {
public static void main(String args[])
{
    Employee e1=new Developer("Hitesh",25000);
    Employee e2=new Manager("Sujay",50000);
    System.out.println(e1.getName()+" Salary :"+e1.calculateSalary());
    System.out.println(e2.getName()+" Salary :"+e2.calculateSalary());
}
}

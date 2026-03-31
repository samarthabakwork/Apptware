public class Program_Clone {
    public static void main(String args[]){

        try {
            Student s1 = new Student();
            s1.id = 1;
            s1.addr=new Address();
            s1.addr.city = "Nashik";


            Student s2 = (Student) s1.clone();
            s2.addr.city="Mumbai";
            System.out.println("s1==s2:"+(s1==s2));
            System.out.println("s1(Nashik) city is : "+s1.addr.city);




            Employee e=new Employee();
            e.id=2;
            e.addr=new Address();
            e.addr.city="Mumbai";

            Employee e1=(Employee)e.clone();
            e1.addr.city="Nashik";
            System.out.println("e==e1:"+(e==e1));
            System.out.println("e city(Mumbai) is :"+e.addr.city);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}

class Student implements Cloneable{
    int id;
    Address addr;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
class Address{
    String city;
}

class Employee implements Cloneable{
    int id;
    Address addr;



    @Override
    protected Object clone() throws CloneNotSupportedException{
        Employee e=(Employee) super.clone();
        e.addr=new Address();
        e.addr.city=this.addr.city;

        return e;
    }
}




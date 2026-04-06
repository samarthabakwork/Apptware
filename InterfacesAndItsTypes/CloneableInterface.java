package InterfacesAndItsTypes;

public class CloneableInterface {
    public static void main(String args[]) throws CloneNotSupportedException{
        Student s1=new Student(1,"Hitesh");
        Student s2=(Student) s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }
}

class Student implements Cloneable{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;

    }

    public String toString(){
        return id+" "+name;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

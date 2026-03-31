public class ToString_Program {
    public static void main(String []args){
        Student1 s1=new Student1();
        s1.id=1;
        s1.name="Santosh";
        System.out.println(s1);
    }

}

class Student1{
    int id;
    String name;

    @Override
    public String toString(){
        return "id: "+id+" name: "+name;
    }
}
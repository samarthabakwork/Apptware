public class Equals_Program {
    public static void main(String args[]){
        Student3 s1=new Student3(1,"Hitesh");
        Student3 s2=new Student3(1,"Hitesh");
        System.out.println(s1.equals(s2));
    }
}

class Student3{
int id;
String name;

public Student3(int id,String name){
    this.id=id;
    this.name=name;
}
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass() !=obj.getClass()) return false;

        Student3 s=(Student3) obj;
        return this.id==s.id && (this.name!=null && this.name.equals(s.name));
    }
}

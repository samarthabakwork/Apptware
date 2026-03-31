public class Hashcode_Program {
    public static void main(String args[]){
        Student4 s1=new Student4(1,"Hitesh");
        Student4 s2=new Student4(1,"Hitesh");
        System.out.println("s1"+s1.hashCode());
        System.out.println("s2"+s2.hashCode());
    }

}

class Student4{
    int id;
    String name;

    public Student4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Student4 s=(Student4) obj;
        return this.id==s.id && this.name.equals(s.name);
    }

    @Override
    public int hashCode(){
        return id +name.hashCode();
    }


}


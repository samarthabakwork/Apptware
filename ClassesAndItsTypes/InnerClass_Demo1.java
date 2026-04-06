package ClassesAndItsTypes;

class A{
 int a=10;
    class B{
        //can access instance and static member of outer class
        public void display(){
            System.out.println("B class Method called");
            System.out.println(a);
        }
    }

    static class C{
        public void display(){
            System.out.println("C class Method called");
            //System.out.println(a);//cannot access instance member of outer class
        }
    }
}



public class InnerClass_Demo1 {
    public static void main(String[] args) {
        A a=new A();
        A.B b=a.new B();
        b.display();

        A.C c=new A.C();
    }
}

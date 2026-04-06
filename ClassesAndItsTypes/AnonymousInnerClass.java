package ClassesAndItsTypes;


class B{
    public void display(){
        System.out.println("A class method");
    }

}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        B b=new B()
        {
            public void display(){
                System.out.println("anonymous inner class method");
            }
        };
        b.display();
    }
}

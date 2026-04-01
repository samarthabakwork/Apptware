package ExceptionHandling;

public class Finally {
    public static void main(String args[]){
        int a=10;
        int b=0;

        try{
            System.out.println(a/b);
            System.out.println("Message after the result");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block executed");
        }
    }

}

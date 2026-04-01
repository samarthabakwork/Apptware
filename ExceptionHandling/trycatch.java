package ExceptionHandling;

public class trycatch {

    public static void main(String args[]){
        int a=10;
        int b=0;
        try{
            int result=a/b;
            System.out.println("result: "+result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}



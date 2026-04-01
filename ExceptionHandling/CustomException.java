package ExceptionHandling;

public class CustomException {
    public static void main(String args[]){
        int age=15;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age should be greater than 18");
            }
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}


class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

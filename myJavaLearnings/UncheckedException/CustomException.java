package myJavaLearnings.UncheckedException;

import java.util.Scanner;

class InvalidInputException extends RuntimeException{
    public InvalidInputException(){
        super("Invalid Input provided.");
    }
    public InvalidInputException(String message){
        super(message);
    }   
    public InvalidInputException(String message, Throwable cause){
        super(message, cause);
    }
}
public class CustomException {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    try{
        System.out.println("Enter a number :");
        int num= sc.nextInt();
        if(num<0){
            throw new InvalidInputException("Number is negative", new IllegalArgumentException());
        }
    }catch(InvalidInputException ex){
        System.err.println("Exception is "+ex.getMessage());
    }catch(Exception ex){
        System.err.println("Exception is "+ex.getMessage());
    }
}
}

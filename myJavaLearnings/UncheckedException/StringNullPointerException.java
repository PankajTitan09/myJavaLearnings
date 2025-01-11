package myJavaLearnings.UncheckedException;

public class StringNullPointerException {
    public static void main(String[] args) {
        String str= null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException ex){
            System.out.println("Exception is "+ex.getMessage());    
        }
    }
    
}

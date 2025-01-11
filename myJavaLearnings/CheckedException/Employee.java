package myJavaLearnings.CheckedException.CheckedException;
class NotValidException extends Exception{
    public NotValidException(String message){
        super(message);
    }
}
public class Employee {
    private String name;
    private int age;

    public Employee(){ 
    }
    public Employee(String name, int age){
        this.name= name;
        this.age=age;
    }
    public String toString(){
        return "Employee name is "+name+" and age is "+age;
    }
    public static void checkAge(int age) throws NotValidException{
            if(age<18){
                throw new NotValidException("Age is not valid for this employee");
            }
    }
    public static void main(String[] args) {
        try{
            Employee employee= new Employee();
            employee.name="John";
            employee.age= 46;
            checkAge(employee.age);
            System.out.println(employee.toString());    
        }
       catch(NotValidException e){
            System.out.println("Exception is "+e.getMessage());
        }
    }
    
}

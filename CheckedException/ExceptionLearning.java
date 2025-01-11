package CheckedException;

//custom checked exception
class AgeNotValidException extends Exception {
    public AgeNotValidException(String messsage) {
        super(messsage);
    }
}

class ExceptionLearing {
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeNotValidException e) {
            System.out.println("Exception is " + e.getMessage());
        }

    }

    public static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age is not valid");
        }
        System.out.println("Valid Age is " + age);
    }
}

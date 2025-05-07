import java.util.Random;
import java.util.*;

abstract class Person {
static Scanner sc=new Scanner(System.in);
    static final String RESET = "\u001B[0m";
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String CYAN = "\u001B[36m";
    static String PURPLE = "\u001B[35m";
    static final String WHITE = "\u001B[37m";
    static final String BOLD="\u001B[1m";
    static final String BLINK="\u001B[5m"; 

    protected String name;
    protected String mobileNumber;
    protected String password;

    Person(String name, String mobileNumber, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    abstract void register();
    abstract boolean login();

    boolean validateMobileNumber(String mobile) {
        return mobile.matches("^[9876]\\d{9}$");
    }

    boolean validatePassword(String password) {
        return password.matches("^[A-Z][a-zA-Z0-9@#]{7,14}$");
    }

    String generateOTP() {
        Random rand = new Random();
        int otp = 1000 + rand.nextInt(9000);
        return String.valueOf(otp);
    }

}
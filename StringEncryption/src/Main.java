import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the string to be encrypted:");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int len = s.length();
        s = s.substring(len - 1) + s.substring(0,len - 1) + "ay";
        System.out.println(s);
        s = s.substring(1,len) + s.substring(0,1);
        System.out.println("Original string: "+s);
    }
}

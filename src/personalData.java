import java.util.Scanner;

public class personalData {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your Age: ");
        String age = in.nextLine();

        System.out.println("Enter your City: ");
        String city = in.nextLine();

        System.out.println("My name is " + name + ", I am " + age + " yars old.");
        System.out.println("I am from " + city + ".");
    }
}

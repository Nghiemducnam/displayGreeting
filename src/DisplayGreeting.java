import java.util.Scanner;
public class DisplayGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name below");
        String name = sc.nextLine();
        System.out.println("hello " + name);
    }
}

import java.util.Scanner;

public class Input {
    public static String[] read() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        return parts;
    }
}

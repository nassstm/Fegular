import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word");
        String wrd = scanner.nextLine();

        Found.Find(wrd);
    }
}
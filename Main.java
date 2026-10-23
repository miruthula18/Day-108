import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);

        System.out.println("Reversed: " + sb.reverse());

        sc.close();
    }
}
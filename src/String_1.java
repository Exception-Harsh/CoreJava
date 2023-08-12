import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s1 = scan.nextLine();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' || s1.charAt(i) == ',' || s1.charAt(i) == ' ')
                s2.append(s1.charAt(i));
        }
        System.out.println(s2);
    }
}

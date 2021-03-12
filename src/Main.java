import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length, cnt;
        String chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_-";
        int max = chars.length();
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        System.out.println("Input length of password: ");
        length = sc.nextInt();
        System.out.println("Input count of passwords: ");
        cnt = sc.nextInt();

        for (int x = 0; x < cnt; x++) {
            for (int i = 0; i < length; i++) {
                password.append(chars.charAt(random.nextInt(max)));
            }
            System.out.println(password);
            password.delete(0, length);
        }
    }
}

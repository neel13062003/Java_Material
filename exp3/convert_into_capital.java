import java.io.*;
import java.util.*;

public class convert_into_capital {
    public static void main(String[] args) {
        char ch;
        int i;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String s1 = new String();
        System.out.print("Enter String : ");
        s1 = sc.nextLine();
        sb.append(s1);
        for (i = 0; i < s1.length(); i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                ch = (char) (sb.charAt(i) - 32);
                sb.setCharAt(i, ch);
            } else {
                ch = (char) (sb.charAt(i));
                sb.setCharAt(i, ch);

            }
        }
        s1 = sb.toString();
        System.out.println("Capital String Is : " + s1);
    }
}
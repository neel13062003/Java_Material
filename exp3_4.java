import java.util.Scanner;
//import java.lang.StringBuffer;

public class exp3_4 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		StringBuffer strBuff = new StringBuffer();

		strBuff.append(str);

		System.out.println();
		strBuff = toUpperCase(strBuff);
		System.out.println("toUpperCase : " + strBuff);
	}

	public static StringBuffer toUpperCase(StringBuffer strBuff) {

		int n = strBuff.length();
		for (int i = 0; i < n; i++) {
			if (strBuff.charAt(i) >= 97 && strBuff.charAt(i) <= 122)
				strBuff.setCharAt(i, (char) (strBuff.charAt(i) - 32));
		}
		return strBuff;
	}
};
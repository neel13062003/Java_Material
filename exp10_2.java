import java.io.*;

public class exp10_2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);

			int b;
			int characters = 0, words = 0, lines = 0;

			int i = 0;
			while ((b = fis.read()) != -1) {
				// words
				if (i == 0 && (char) b == ' ') {
					characters++;
					while ((b = fis.read()) != -1 && (char) b == ' ')
						characters++;
				}
				if ((char) b == ' ') {
					characters++;
					words++;
					while ((b = fis.read()) != -1 && (char) b == ' ')
						characters++;
				}

				// lines
				if ((char) b == '.') {
					words++;
					lines++;
				}

				// characters
				characters++;
				i++;
				// System.out.println(i + (char) b + "");
			}

			System.out.println("ch : " + characters + ", words : " + words + ", lines : " + lines);
			fis.close();

		} catch (FileNotFoundException notFound) {
			System.out.println(notFound);

		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
};
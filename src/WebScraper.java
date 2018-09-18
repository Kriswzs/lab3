import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class WebScraper {
        public static String urlToString(final String url) {
            Scanner urlScanner;
            try {
                urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
            } catch (IOException e) {
                return "";
            }
            String contents = urlScanner.useDelimiter("\\A").next();
            urlScanner.close();
            return contents;
        }
        public static void main(String[] unused) {
            String[] text = urlToString(unused[]);
            String[] newarray = text.split("\\A");
            int count = 0;
            for (int i = 0; i < newarray.length; i++) {
               if (newarray[i] != ' ') {
                count = count + 1;
            }
        }
            System.out.println(count);
    }
}

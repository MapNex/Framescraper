import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Scraper {
    private String URL;
    private String websiteContent;

    public Scraper(String URL) throws IOException {
        this.URL = URL;

        //Instantiating the URL class
        URL url = new URL(URL);
        //Retrieving the contents of the specified page
        Scanner sc = new Scanner(url.openStream());
        //Instantiating the StringBuffer class to hold the result
        StringBuffer sb = new StringBuffer();

        while(sc.hasNext()) {
            sb.append(sc.next());
            //System.out.println(sc.next());
        }

        //Retrieving the String from the String Buffer object
        this.websiteContent = sb.toString();
    }

    public String getURL() {
        return URL;
    }

    
}

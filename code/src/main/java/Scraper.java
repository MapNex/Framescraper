import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Shopscraper class representing a specific instantiation of a ConceptScraper
 * @author Mathias Jarbekk
 * @author Thomas Johannessen
 * @author Joakim Jensen
 * @author Michal Kowalski
 * @version 1.0
 * @see ConceptScraper
 */
public class Scraper {
    private String URL;
    private String websiteContent;


    /**
     * Constructor for a shop scraper
     * @param URL Link to target site for scraping
     * @throws IOException Throws an IO Exception whenever user input is crashing with an expected string value
     */
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

    /**
     *
     * @return The url as a String
     */
    public String getURL() {
        return URL;
    }

    /**
     *
     * @return The website content as String
     */
    public String getWebsiteContent() {
        return websiteContent;
    }

    /**
     *
     * @param tag The tag from which we want to see the content of
     * @return The content is returned as Strings in String[]
     */
    public String[] getContentFromTag(String tag){
        return null;
    }

    /**
     *
     * @param id The id of an element which we want to get the content from
     * @return returns the content as String in String[]
     */
    public String[] getContentFromId(String id){
        return null;
    }

    /**
     *
     * @param className The class name of the element which we want to get the content of
     * @return returns the content of the given class as strings in String[]
     */
    public String[] getContentFromClass(String className){
        return null;
    }

    /**
     *
     * @return the links as String in String[]
     */
    public String[] getLinksInPage(){
        return null;
    }

    /**
     *
     * @param searchString string we want to see if exist in the HTML code
     * @return returns boolean based on if the String was found or not. True for was found and false for was not found.
     */
    public boolean contains(String searchString){
        return true;
    }

    /**
     *
     * @return all found classes as strings in String[]
     */
    public String[] getClassesInPage(){
        return null;
    }

    /**
     *
     * @return all found id's as strings in String[]
     */
    public String[] getIdsInPage(){
        return null;
    }
}

import java.io.IOException;

public abstract class ConceptScraper {

    /**
     * This is a abstract class to let the predefined
     * classes use the methods from Scraper with correct inheriting.
     */

    private Scraper scraper;

    /**
     * @param URL Takes a string with the URL as parameter. This is forwarded to the Scraper
     *           and instantiates a new object from the webpage.
     * @throws IOException If the string sent in could not be processed as intended.
     */
    public ConceptScraper(String URL) throws IOException {
        scraper = new Scraper(URL);
    }

    /**
     * @return A object of the Scraper class which all the Scrapers methods can be applied to.
     */
    public Scraper getScraper(){
        return scraper;
    }
}

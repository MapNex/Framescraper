import java.io.IOException;

public class ShopScraper extends ConceptScraper{

    public ShopScraper(String url) throws IOException {
        super(url);
    }

    public String[] getProductInfo() {
        return null;
    }

    public String[][] getCategoryProductInfo() {
        return null;
    }

    public String[] getProductSpecifications() {
        return null;
    }

    public String[] getProductSpecification(String spec) {
        return null;
    }

    public Double getProductAverageRating() {
        return null;
    }

    public String[] getAProductsFeedbackComments() {
        return null;
    }
}

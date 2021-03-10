import java.io.IOException;

public class StockScraper extends ConceptScraper {

    public StockScraper(String url) throws IOException {
        super(url);
    }


    public String[] getStockInfo(String aksjeTicker){
        return null;
    }

    public Double getStockReturn(String aksjeTicker, int kjoptKurs, int antallAksjer){
        return null;
    }

    public Double getStockReturnPrcent(String aksjeTicker, int kjoptkurs, int antallAksjer){
        return null;
    }


}
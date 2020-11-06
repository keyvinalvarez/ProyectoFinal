package Objects;


import java.util.List;

public class Product {

    private String name;
    private List<Currency> price;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Currency> getPrice() {
        return price;
    }

    public void setPrice(List<Currency> price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

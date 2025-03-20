public class Movie {
    private String title;
    private String category;
    private double price;

    public Movie(String title, String category, double price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Category: " + category + ", Price: R$" + price;
    }
}
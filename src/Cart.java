import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static Cart instace;

    private List<Movie> movies;

    private Cart() {
        this.movies = new ArrayList<>();
    }

    public static Cart getInstance() {
        if (instace == null) {
            instace = new Cart();
        }
        return instace;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void clearCart() {
        movies.clear();
        System.out.println("Todos os filmes foram removidos do carrinho!");
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Movie movie : movies) {
            total += movie.getPrice();
        }
        return total;
    }

    public void printCart() {
        if (movies.isEmpty()) {
            System.out.println("Carrinho vazio. :(");
        } else {
            System.out.println("Filmes no carrinho:");
            for (Movie movie : movies) {
                System.out.println(movie);
                System.out.println();
            }
            System.out.println();
            System.out.println("Valor Total: R$" + calculateTotal());
        }
    }
}
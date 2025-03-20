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
}
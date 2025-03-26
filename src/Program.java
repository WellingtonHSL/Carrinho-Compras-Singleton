import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("Como treinar seu dragão", "Aventura", 48.60));
        movieList.add(new Movie("Superman", "Ação", 61.19));
        movieList.add(new Movie("Transformers o lado oculto da lua", "Ação", 54.89));
        movieList.add(new Movie("Minecraft O filme", "Aventura", 46.60));
        movieList.add(new Movie("Oblivion", "Aventura", 52.59));
        movieList.add(new Movie("It a Coisa", "Terror", 62.99));
        movieList.add(new Movie("Tenet", "Ficção", 43.90));
        movieList.add(new Movie("Batman", "Ação", 45.50));
        movieList.add(new Movie("A vida a bela", "Comédia", 40.30));
        movieList.add(new Movie("De volta para o Fututo", "Ficção", 43.80));

        Cart cart = Cart.getInstance();
        int choice;

        BE_Facade facade = new BE_Facade();

        do {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Lista de Filmes");
            System.out.println("2 - Ver Carrinho");
            System.out.println("3 - Adicionar Filme ao Carrinho");
            System.out.println("4 - Limpar Carrinho");
            System.out.println("5 - Facade - imprimir");
            System.out.println("6 - Facade - retornar inteiro");
            System.out.println("7 - Facade - cobrar");
            System.out.println("8 - Facade - realizar pagamento");
            System.out.println("0 - Sair");
            System.out.print("Escolha alguma opção: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 0:
                    System.out.println("Fechando o sistema...");
                    break;
                case 1:

                    for (int i = 0; i < movieList.size(); i++) {
                        System.out.println(i + " - " + movieList.get(i));
                        System.out.println();
                    }
                    break;
                case 2:
                    cart.printCart();

                    break;
                case 3:
                    for (int i = 0; i < movieList.size(); i++) {
                        System.out.println(i + " - " + movieList.get(i));
                    }
                    System.out.print("Digite o número do filme que deseja adicionar: ");
                    int movieIndex = scanner.nextInt();

                    if (movieIndex >= 0 && movieIndex < movieList.size()) {
                        Movie selectedMovie = movieList.get(movieIndex);
                        cart.addMovie(selectedMovie);
                        System.out.println("Filme adicionado ao carrinho: " + selectedMovie.getTitle());
                    } else {
                        System.out.println("Opção inválida!");
                    }

                    break;
                case 4:
                    cart.clearCart();
                    System.out.println("Carrinho limpo!");
                    System.out.println();
                    break;
                case 5:
                    facade.imprimir();
                    break;
                case 6:
                    System.out.println(facade.retornarInt());
                    break;
                case 7:
                    System.out.println(facade.cobranca(30.5));;
                    break;
                case 8:
                    System.out.println(facade.fazerPagamento(50.0));
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (choice != 0);

        scanner.close();
    }
}

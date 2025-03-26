public class BE_Facade {

    private Biblioteca biblioteca;


    public BE_Facade(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public BE_Facade() {
        this.biblioteca = new Biblioteca();
    }

    public void imprimir(){
        biblioteca.imprime();
    }

    public int retornarInt(){
        return biblioteca.retornaInteiro();
    }

    public String cobranca(double totalPreco){
        return biblioteca.cobrar(totalPreco);
    }

    public String fazerPagamento(double valorPago){
        return biblioteca.realizarPagamento(valorPago);

    }
}
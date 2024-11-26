
public class Main {
    public static void main(String[] args) {

    Vendas vendas= new Vendas();
        String nome= vendas.getNome();

    Inputs input= new Inputs();
        double preco= input.Preco();
        int quantidade= input.quantidade();
        quantidade= input.Loop(quantidade);


    System.out.println("////////////////////////////");
    System.out.println("preço:"+preco);
    System.out.println("nome:"+nome);
    System.out.println("quantidade atual:"+ quantidade);
    }
}
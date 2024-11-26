
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Users {
    private Scanner scanner;
    private List<String> escolhas;
    private String nome;

    public Users(){
        this.scanner= new Scanner(System.in);
        this.escolhas= new ArrayList<>();
        this.nome=nome;
    }
//setando o usuario
    public String nomeuser( ) {
        System.out.println("CADASTRO DDE USUARIOS");
        System.out.print("qual é o seu nome:");
         nome=scanner.next();
        scanner.nextLine();
        return nome;
    }
// setando escolha do usuario
    public String pegalivro(CreateBooks livro){
        System.out.print("escolha seu livro:");
        String escolhauser= scanner.next();
        scanner.nextLine();
        List livros=livro.getLivros();
        if (livros.contains(escolhauser)){ //comparando se o livro escolhido esta dentro da lista de livros com o acesso do getter.
            livros.remove(escolhauser);//removendo a escolha do usuario da lista principal de livros
            escolhas.add(escolhauser);// e adicionando na lista individual do usuario
        }
        while (true){
            System.out.println("caso deseja pegar mais livros aperte (a) para salvar seu cadastro aperte (S)");
            System.out.print("DIGITE AQUI:");
            String requestuser= scanner.next();
            scanner.nextLine();
            if (requestuser.equals("a")){
                System.out.print("seu proximo livro: ");
                String proximiescolha= scanner.next();
                scanner.nextLine();
                livros.remove(proximiescolha);
                escolhas.add(proximiescolha);
            } else if (requestuser.equals("s")){
                System.out.println("salvo com sucesso!!");
                break;
            }
        }//while acaba nessa chave
        // fazer um return dentro do while impede a repetçao
        return escolhauser;
    }
// metodo para devolver o livro. OBS(esse metodo podria ficar dentro do loop
// com o modelo de clicar uma tecla e escolher remover um livro, mas eu preferir deixar fora), entao vc que esta vendo isso
// te indico colocar dentro do loop para ficar bem mais organizado.
    public void devolvelivro(CreateBooks livro){
        System.out.println("LIVROS QUE DESEJA DEVOLVER");
        System.out.print("livro: ");
        String devolvelivro= scanner.next();
        scanner.nextLine();
        List livros=livro.getLivros();
        if (escolhas.contains(devolvelivro)){
            escolhas.contains(devolvelivro);
            livros.add(devolvelivro);
        }else System.out.println("verrifique se o nome do livro esta correto!");

        System.out.println("livros devolvido:"+devolvelivro);
        System.out.println("lista de livro:"+livros);
    }
// exibi as escolhas e o nome do usuario
    public void returnExibicion(CreateBooks livro){
        List livros= livro.getLivros();
        System.out.println("O usuario: "+nome);
        System.out.println("Pegou os Livros: "+escolhas);
        System.out.println("Livros restantes: "+livros);
    }

    public void fecharscanner(){
       scanner.close();

    }









}
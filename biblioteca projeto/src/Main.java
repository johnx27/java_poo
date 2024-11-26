public class Main {
    public static void main(String[] args) {
        CreateBooks listlivros= new CreateBooks();
        listlivros.livros();

        Users user1= new Users();
        user1.nomeuser();
        user1.pegalivro(listlivros);
        user1.returnExibicion(listlivros);
        user1.devolvelivro(listlivros);

    }
}
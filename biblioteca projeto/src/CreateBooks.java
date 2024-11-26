

import java.util.ArrayList;
import java.util.List;

public class CreateBooks {
    private List<String> livros;


    public CreateBooks(){
        this.livros= new ArrayList<>();
    }
    public void livros(){
        System.out.print("LISTA DE LIVROS:");
        livros.add("Dom Quichote");
        livros.add("Alice no Pais das Maravilhas");
        livros.add("Gato e a Lebre");
        livros.add("Romeo e Julieta");
        System.out.println(livros);
    }

    public List<String> getLivros() {
        return livros;
    }
}

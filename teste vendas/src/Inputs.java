import java.util.Scanner;

public class Inputs {
    private Scanner scanner;

    public Inputs(){
        this.scanner= new Scanner(System.in);


    }
// LOOP PARA ADICIONAR,TIRAR E SALVAR
    public int Loop(int quant){
        String user;
        int valoradd;
        while (true){
            System.out.print("escolha (a) para adicionar (x)retirar ou (s) ppara salvar:");
            user= scanner.next();
            scanner.nextLine();
            // ADICIONA MAIS HÁ QUANTIDADE
            if (user.equals("a")){
                System.out.print("digite o valor para ser add:");
                valoradd= scanner.nextInt();
                scanner.nextLine();
                quant+= valoradd;
            // RETIRA
            } else if (user.equals("x")) {
                System.out.print("Digite o valor para retirar:");
                valoradd = scanner.nextInt();
                scanner.nextLine();
                quant -= valoradd;
            // encerrra o loop
            } else if (user.equals("s")){
                System.out.println("salva com sucesso!");
                break;
            }
        }
        return quant;
    }
// INPUT QUE LEIA UM DOUBLE
    public double Preco() {
        double valor;
        //criando repetiçao até que o valor seja um dooble
        while (true) {
            System.out.print("seu o valor:");
            valor = scanner.nextDouble();
            scanner.nextLine();
            if (valor > 0) {
                break;
            }
            System.out.println("tente novamente");
        }
        return valor;
    }
// INPUT QUE LEIA UM INTEGER
    public int quantidade(){
        System.out.print("digite a quantidade:");
        int valorint= scanner.nextInt();
        scanner.nextLine();
        return valorint;
    }

// FECHANDO O SCANNER
    public void fecharscanner() {
        scanner.close();
    }

}



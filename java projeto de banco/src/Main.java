public class Main {
    public static void main(String[] args) {
        ContaBanco conta= new ContaBanco();
        conta.setNome("john");
        conta.setSaldo(430.0f);
        conta.setNumconta(1234567);
        conta.AbrirConta("cp");
        conta.estado();
//        conta.FecharConta();
    }
}
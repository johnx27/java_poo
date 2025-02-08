
public class ContaBanco {
    private String nome;
    protected String tipo;
    public int numConta;
    private float saldo;
    private boolean status;

    // printnado o objeto
    public void estado(){
        System.out.println("Nome:"+this.getNome());
        System.out.println("Tipo:"+this.getTipo());
        System.out.println("Numero da conta:"+this.getNumconta());
        System.out.println("Saldo:"+this.getSaldo());
        System.out.println("Status:"+this.getStatus());
    }
    // Metodo Constructor
    public ContaBanco() {
        this.saldo= 0.0f; //iniciando a conta com tudo desligado ou seja saldo zero e a conta false indicando que ainda n foi aberta.
        this.status= false;
    }
    // MÉTODOS
    public void AbrirConta(String tp){ // tp é a variavel a qual o tipo da conta sera armazenando.
        this.setStatus(true);
        this.setTipo(tp);
        if (tp == "cc"){
            this.setSaldo(50.0f);
        } else if (tp == "cp") {
            this.setSaldo(150.0f);
            System.out.println("Por sua conta ser [CP] vc recebe:"+this.getSaldo());
        }
    }

    public void FecharConta(){
        if (saldo>0){
            System.out.println("conta nao pode ser fechada pois contem dinheiro");
        } else if (saldo<0) {
            System.out.println("seu saldo é negativo");
        }else if(saldo == 0) {
            this.setStatus(false);
            System.out.println("conta fechada");
        }
    }
//    public void Sacar() {
//
//    }
//
//    public void Taxa() {
//
//    }
    // MÉTODOS GET E SET
    public String getNome() {
        return nome;
    }
    public void setNome( String t) {
        nome= t;
    }
    public int getNumconta() {
        return numConta;
    }
    public void setNumconta( int nc) {
        numConta= nc;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tp) {
        tipo= tp;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo( float sl) {
        saldo= sl;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus( boolean st) {
        status = st;
    }
}
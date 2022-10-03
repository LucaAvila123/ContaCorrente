public class ContaCorrente {
    //usando protected ao invés de private pra poder usar na subclasse dessa daqui
    protected double saldo;
    protected String nome;

    public ContaCorrente(String nome){
        this.nome = nome;
    }
    public void saque(double quantia){
        //aqui incluindo a taxa de 0.5% para os saques
        if(quantia*1.005 <= saldo){
            saldo -= quantia*1.005;
        }
        else{
            System.out.println("Saldo indisponível");
        }
    }

    public void depositar(double quantia){
        saldo += quantia;
    }

    public double getSaldo() {
        return saldo;
    }
}

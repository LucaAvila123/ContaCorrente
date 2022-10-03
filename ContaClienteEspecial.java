public class ContaClienteEspecial extends ContaCorrente {
    
    public ContaClienteEspecial(String nome) {
        super(nome);
    }

    //como é uma subclasse com especificidades de saque (porcentagem)
    //tem que usar Override aqui 
    @Override
    public void saque(double quantia) {
        //aqui incluindo a taxa de 0.1% para os saques por ser cliente especial
        if(quantia*1.001 <= saldo){
            saldo -= quantia*1.001;
        }
        else{
            System.out.println("Saldo indisponível");
        }
    }
}

public class App {
    public static void main(String[] args) {
        ContaCorrente pedro = new ContaCorrente("Pedro");

        ContaClienteEspecial maria = new ContaClienteEspecial("Maria>");

        pedro.depositar(1000);
        maria.depositar(2000);

        System.out.printf("Saldo atual da Maria: %.2f\n", maria.getSaldo());
        System.out.printf("Saldo atual do Pedro: %.2f\n", pedro.getSaldo());

        maria.saque(1000);
        pedro.saque(500);

        System.out.printf("Saldo atual da Maria: %.2f\n", maria.getSaldo());
        System.out.printf("Saldo atual do Pedro: %.2f\n", pedro.getSaldo());
    }
}

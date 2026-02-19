public class Main {
    public static void main(String[] args) {
        
        ContaBancaria contaDePablo = new ContaBancaria(1, 500);

        System.out.println(contaDePablo.consultarSaldo());

        contaDePablo.depositar(25);
        System.out.println(contaDePablo.consultarSaldo());

        contaDePablo.sacar(20);
        System.out.println(contaDePablo.consultarSaldo());

    }
}
 
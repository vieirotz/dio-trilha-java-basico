import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {

        Scanner contaTerminal = new Scanner(System.in);

        System.out.println("Digite o numero da Agencia: ");
            String agencia = contaTerminal.nextLine();

        System.out.println("Digite o Seu nome: ");
            String nome = contaTerminal.nextLine();

        System.out.println("Digite Sua Conta: ");
            int conta = contaTerminal.nextInt();

        System.out.println("Digite o valor de Deposito: ");
            double saldo = contaTerminal.nextDouble();   

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque ");

        
        //TO DO: Conhecer e importar a classe Scanner

        //TO DO: Exibir as mensagens para o nosso usuario

        //TO DO: Obter pela scanner os valores digitados no terminal

        //TO DO: Exibir as mensagens criadas
    }
}

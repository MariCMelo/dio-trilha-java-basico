import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Por favor, digite seu nome completo: ");
            String name = sc.nextLine();
            System.out.println(name);

            System.out.print("Por favor, digite o número de agência bancária: ");
            String bankAccount = sc.nextLine();
            System.out.println(bankAccount);

            System.out.print("Por favor, digite o nome de sua agência bancária: ");
            String bankAgency = sc.nextLine();
            System.out.println(bankAgency);

            double balance = 0.0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Por favor, digite o seu saldo: ");
                String balanceInput = sc.nextLine();
                try {
                    balance = Double.parseDouble(balanceInput);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.err.println("Por favor, insira um número válido para o saldo.");
                }
            }

            System.out.println("Olá, " + name + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + bankAgency
                    + ", conta " + bankAccount + " e seu saldo de " + balance + " já está disponível para saque!");
        } catch (Exception err) {
            System.err.println("Ocorreu um erro ao processar os dados. Por favor, tente novamente.");
        } finally {

            sc.close();
        }

    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(15000);
        /*try {
            bankAccount.Deposit(15000 );
        }catch (LimitException e){
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Напишите сумму вывода ");
                bankAccount.withDrew(scanner.nextInt());
            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                try {
                    bankAccount.withDrew((int) limitException.getRemeniningAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
            }
        }*/
        try {
            while (true){
                bankAccount.withDrew(6000);
            }
        } catch (LimitException e) {
            System.out.println("У тебя ошибка " + e.getMessage());
            System.out.println(" Счет  " + e.getRemeniningAmount());
        }
    }
}
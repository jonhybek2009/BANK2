import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = {
                new Account("Ади", 10000),
                new Account("Ринат", 5000),
                new Account("бека", 3000)
        };

        while (true) {
            System.out.println("\n--- Меню Банка ---");
            System.out.println("1. Проверка баланса");
            System.out.println("2. Пополнить Счет");
            System.out.println("3. Снять Деньги");
            System.out.println("4. Перевести деньги");
            System.out.print("Выбери опцию: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (Account acc : accounts) {
                        acc.checkBalance();
                    }
                    break;

                case 2:
                    System.out.print("номер аккаунта (0, 1, 2): ");
                    int accIndex = scanner.nextInt();
                    System.out.print(" сумма для пополнения: ");
                    double depositAmount = scanner.nextDouble();
                    accounts[accIndex].deposit(depositAmount);
                    break;

                case 3:
                    System.out.print(" номер аккаунта (0, 1, 2): ");
                    accIndex = scanner.nextInt();
                    System.out.print("сумма для снятия: ");
                    double withdrawalAmount = scanner.nextDouble();
                    accounts[accIndex].withdrawal(withdrawalAmount);
                    break;

                case 4:
                    System.out.print("какой браток хочет отправить к другому братку (0, 1, 2): ");
                    int senderIndex = scanner.nextInt();
                    System.out.print("один из номеров моих братков (0, 1, 2): ");
                    int recipientIndex = scanner.nextInt();
                    System.out.print("Сколько хочу перевести: ");
                    double transferAmount = scanner.nextDouble();
                    accounts[senderIndex].transaction(accounts[recipientIndex], transferAmount);
                    break;


            }
        }
    }
}
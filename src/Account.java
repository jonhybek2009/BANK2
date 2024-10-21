public class Account {
    private double balance;
    private String ownerName;

    public Account(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Баланс " + ownerName + ": " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " добавлено на счет " + ownerName);
        } else {
            System.out.println("Некорректная сумма для пополнения!");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " снято со счета " + ownerName);
        } else {
            System.out.println("Недостаточно денег ");
        }
    }

    public void transaction(Account recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdrawal(amount);
            recipient.deposit(amount);
            System.out.println(amount + " переведено от " + ownerName + " к " + recipient.ownerName);
        } else {
            System.out.println(" Бро тебе не хватает денег.");
        }
    }
}
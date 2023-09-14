public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Пополнено: " + sum);
        } else {
            System.out.println("Неверная сумма для пополнения");
        }
    }

    public void withdraw(double sum) throws LimitException {
        if (sum > 0) {
            if (amount >= sum) {
                amount -= sum;
                System.out.println("Снято: " + sum);
            } else {
                throw new LimitException ("Недостаточно средств на счете" , amount);
            }
        } else {
            System.out.println("Неверная сумма для снятия");
        }
    }
}

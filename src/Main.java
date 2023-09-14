public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount(0.0);

        bankAccount.deposit(15000.0);

        double currentBalance = bankAccount.getAmount();
        System.out.println("Текущий баланс клиента: " + currentBalance);
        while (true) {
            try {
                bankAccount.withdraw(6000.0);
                System.out.println("Снято 6000 сом. Текущий баланс: " + bankAccount.getAmount());
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Ошибка: " + e.getMessage() + ". Снимаем доступную сумму: " + remainingAmount);
                bankAccount.withdraw(remainingAmount);
                break;}



        }

    }}

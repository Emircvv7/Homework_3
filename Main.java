public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000.0);

        while (true) {
            try {
                account.withdraw(6000.0);
                System.out.println("Снято 6000 сом. Остаток на счете: " + account.getAmount() + " сом.");
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Невозможно снять запрошенную сумму. Доступно для снятия: " + remainingAmount + " сом.");
                account.deposit(remainingAmount);
                break;
            }
        }
    }
}





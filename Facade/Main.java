public class Main {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();

        // Open an account
        bankSystem.openAccount("Abir", "Savings");

        // Apply for a loan
        bankSystem.applyForLoan("Abir", 1000);

        // Close the account
        bankSystem.closeAccount("Abir");
    }
}

public class AccountService {
    public void openAccount(String customerName, String accountType) {
        System.out.println("Opened a " + accountType + " account for " + customerName);
    }

    public void closeAccount(String customerName) {
        System.out.println("Closed account for " + customerName);
    }
}

public class LoanService {
    public boolean processLoan(String customerName, double amount) {
        System.out.println("Loan approved for " + customerName + " amount: " + amount);
        return true;
    }
}

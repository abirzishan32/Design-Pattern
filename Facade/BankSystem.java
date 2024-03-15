public class BankSystem {
    private AccountService accountService;
    private LoanService loanService;
    private CreditScoreService creditScoreService;

    public BankSystem() {
        accountService = new AccountService();
        loanService = new LoanService();
        creditScoreService = new CreditScoreService();
    }

    public void openAccount(String customerName, String accountType) {
        accountService.openAccount(customerName, accountType);
    }

    public boolean applyForLoan(String customerName, double amount) {
        double creditScore = creditScoreService.getCreditScore(customerName);
        if (creditScore >= 600) {
            return loanService.processLoan(customerName, amount);
        } else {
            System.out.println("Loan application rejected. Low credit score.");
            return false;
        }
    }

    public void closeAccount(String customerName) {
        accountService.closeAccount(customerName);
    }



}

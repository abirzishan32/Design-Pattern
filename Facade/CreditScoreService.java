public class CreditScoreService {
    public double getCreditScore(String customerName) {
        // In a real system, this method would retrieve the credit score from a database or external service
        // For simplicity, let's return a random score between 400 and 800
        return Math.random() * 400 + 400;
    }
}

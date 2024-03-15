public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Starting application...");
        logger.log("Application running.");
        logger.log("Application stopped.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Another log message.");

        if (logger == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Both logger instances are different.");
        }
    }
}

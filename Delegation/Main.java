public class Main {
    public static void main(String[] args) {
        // Create a Worker with an Electrician delegate
        Worker electricianWorker = new Worker(new Electrician());
        electricianWorker.performTask();

        // Change the delegate to a Plumber
        electricianWorker.setTaskDelegate(new Plumber());
        electricianWorker.performTask();

        // Create a Worker with a Carpenter delegate
        Worker carpenterWorker = new Worker(new Carpenter());
        carpenterWorker.performTask();
    }
}

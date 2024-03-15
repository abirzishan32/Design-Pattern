public class Main {
    public static void main(String[] args) {
        Connection proxyConnection = new ProxyConnection("https://mywebsite.com");
        proxyConnection.connect();
    }
}

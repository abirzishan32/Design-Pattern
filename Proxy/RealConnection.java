public class RealConnection implements Connection{
    private String url;

    public RealConnection(String url)
    {
        System.out.println("Create real connection instance");
        this.url = url;
    }

    @Override
    public void connect()
    {
        System.out.println("Connect to " + url + " by real connection");
    }
}

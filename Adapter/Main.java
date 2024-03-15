public class Main
{
    public static void main(String[] args)
    {
        Adaptor adaptor = new Adaptor(new HDMIToVGA());
        adaptor.convert();

        Adaptor adaptor2 = new Adaptor(new VGAToHDMI());
        adaptor2.convert();
    }
}

import internet.Internet;
import internet.ProxyInternet;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("calebe.org");
            internet.connectTo("whatever.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
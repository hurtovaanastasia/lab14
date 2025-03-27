import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        String [] adresses = {"0945.192.168.1.1", "256.300.10.44", "10.0.0.1", "172.16.254.1", "1.2.3.4", "127.0.0.1", "999.999.999.999", "192.168.01.1"};
        String perfectIP = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        Pattern pattern = Pattern.compile(perfectIP);
        System.out.println("Найденные IP-адреса в строке:");
        for(String ip: adresses) {
            Matcher matcher = pattern.matcher(ip);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
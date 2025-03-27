import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ВВедите размерность массива: ");
        int n = input.nextInt();
        String [] adresses = new String[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            adresses[i] = input.nextLine();
        }
        String perfectIP = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        Pattern pattern = Pattern.compile(perfectIP);
        System.out.println("Найденные IP-адреса в массиве:");
        for(String ip: adresses) {
            Matcher matcher = pattern.matcher(ip);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
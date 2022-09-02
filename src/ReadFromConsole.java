import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int i= scanner.nextInt();
        System.out.println(i+" "+s);
    }
}
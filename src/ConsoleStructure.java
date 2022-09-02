import java.util.Scanner;

public class ConsoleStructure {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("Not");
        }else if(age>=18 &&age<=21){
            System.out.println("So so");
        }else {
            System.out.println("Yes");
        }
    }

}

import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Harmonic {

    public static void main(String[] args) {
        int n;
        double result=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number n: ");
        n=scan.nextInt();


        for (int i=1; i<=n;i++){
            result+=(1.0/i);
        }

        System.out.println("Result :" + result);
    }
}

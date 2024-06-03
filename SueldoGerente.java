import java.util.Scanner;

public class SueldoGerente {
    //● Gerentes: reciben un sueldo base (por ser gerentes) + una bonificación
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo de un ingeniero: ");
        double sueldo = scanner.nextDouble();
        System.out.println("Sueldo Gerente: " + (sueldo + 500));

    }
}

import java.util.Scanner;
//● Ingenieros: cobran según las horas que trabajan y su sueldo por hora
public class SueldoIngenieros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo de un ingeniero: ");
        double sueldo = scanner.nextDouble();
        System.out.println("Ingrese las horas trabajadas por el ingeniero: ");
        double horas = scanner.nextDouble();
        double sueldoTotal = sueldo * horas;
        System.out.println("El sueldo total del ingeniero es: " + sueldoTotal);
        
    }
    
}

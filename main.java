import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.println("Ingrese el número de empleados:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la información del empleado " + (i + 1));
            System.out.print("id: ");
            String id = scanner.nextLine();
            System.out.print("nombre: ");
            int nombre = scanner.nextInt();
            System.out.print("email: ");
            double email = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea

            Empleado empleado = new Empleado(id, nombre, email);
            empleados.add(empleado);
        }

        System.out.println("\nInformación de los empleados:");
        for (Empleado emp : empleados) {
            System.out.println(emp.getDescripcion());
        }
    }
}
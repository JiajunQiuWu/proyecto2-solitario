import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Seleccione el tipo de empleado (1: Gerente, 2: Ingeniero, 3: Administrativo): ");
            int tipo = scanner.nextInt();
            System.out.print("Ingrese ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consumir la línea nueva
            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese email: ");
            String email = scanner.nextLine();
            //switch de las decisiones que quieres tomar
            switch (tipo) {
                case 1:
                    System.out.print("Ingrese sueldo base: ");
                    double sueldoBase = scanner.nextDouble();
                    System.out.print("Ingrese bonificación: ");
                    double bonificacion = scanner.nextDouble();
                    empleados.add(new Gerente(id, nombre, email, sueldoBase, bonificacion));
                    break;
                case 2:
                    System.out.print("Ingrese horas trabajadas: ");
                    double horasIngeniero = scanner.nextDouble();
                    System.out.print("Ingrese sueldo por hora: ");
                    double sueldoHoraIngeniero = scanner.nextDouble();
                    empleados.add(new Ingeniero(id, nombre, email, horasIngeniero, sueldoHoraIngeniero));
                    break;
                case 3:
                    System.out.print("Ingrese horas trabajadas: ");
                    double horasAdministrativo = scanner.nextDouble();
                    System.out.print("Ingrese sueldo por hora: ");
                    double sueldoHoraAdministrativo = scanner.nextDouble();
                    empleados.add(new Administrativo(id, nombre, email, horasAdministrativo, sueldoHoraAdministrativo));
                    break;
                default:
                    System.out.println("Tipo de empleado no válido.");
                    i--; 
                    break;
            }
        }
        //informacion del empleado 
        System.out.println("Información de empleados:");
        for (Empleado empleado : empleados) {
            empleado.describir();
            System.out.println();
        }

        scanner.close();
    }
}

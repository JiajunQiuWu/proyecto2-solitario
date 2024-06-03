
class Administrativo extends Empleado {
    private double horasTrabajadas;
    private double sueldoPorHora;

    public Administrativo(int id, String nombre, String email, double horasTrabajadas, double sueldoPorHora) {
        super(id, nombre, email);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * sueldoPorHora;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Rol: Administrativo");
        System.out.println("Salario: " + calcularSalario());
    }
}

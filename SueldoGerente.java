

class Gerente extends Empleado {
    private double sueldoBase;
    private double bonificacion;

    public Gerente(int id, String nombre, String email, double sueldoBase, double bonificacion) {
        super(id, nombre, email);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + bonificacion;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Rol: Gerente");
        System.out.println("Salario: " + calcularSalario());
    }
}
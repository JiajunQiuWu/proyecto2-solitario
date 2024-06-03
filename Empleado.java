abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String email;

    public Empleado(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public abstract double calcularSalario();

    public void describir() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }
}
public class Empleado {
    private String id;
    private int nombre;
    private int email;

    public Empleado(String id, int edad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getDescripcion() {
        return "Empleado: " + this.id + ", " + this.nombre + ", " + this.email;
    }

}

package Tipo_de_persona;

public class Maestro extends Persona {
    private static int idMaestro;
    private String asignatura;
    private int horas_de_trabajo;
    private double salario;
    private boolean ocupado = true;

    public Maestro(String nombre, String apellidos, int edad, char genero, String asignatura, int horas_de_trabajo, double salario) {
        super(nombre, apellidos, edad, genero);
        idMaestro++;
        this.asignatura = asignatura;
        this.horas_de_trabajo = horas_de_trabajo;
        this.salario = salario;
    }

    public boolean getOcupado(){
        return ocupado;
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    public boolean s(){
        if(!ocupado){
          //  ocupado = true;
            System.out.println(ocupado);
        }else{
            System.out.println(ocupado);
        }
        return ocupado;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getHoras_de_trabajo() {
        return horas_de_trabajo;
    }

    public void setHoras_de_trabajo(int horas_de_trabajo) {
        this.horas_de_trabajo = horas_de_trabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void obtener_informacion() {
        System.out.println(idMaestro + "| " + super.getNombre() + " " + super.getApellidos() + " " + super.getEdad() +
                " " + super.getGenero());
    }
}

package Tipo_de_persona;

public class Alumno extends Persona {
    protected static int idAlumno;

    public Alumno(String nombre, String apellidos, int edad, char genero){
        super(nombre, apellidos, edad, genero);
        idAlumno++;
    }

    public void obtener_informacion() {
        System.out.println(idAlumno + "| " + super.getNombre() + " " + super.getApellidos() + " " + super.getEdad() +
                " " + super.getGenero());
    }
}

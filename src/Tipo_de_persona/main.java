package Tipo_de_persona;

public class main {
    public static void main(String[] args) {
        Maestro m1 = new Maestro("Oscar", "Castaneda", 18, 'h', "Matematicas", 3, 2000.15);
        m1.obtener_informacion();
     //   m1.s();
            System.out.println(Persona.idPersona);
        Maestro m2 = new Maestro("Rosa Evelia", "Serrano",56, 'm', "Español", 5, 2300.24);
        m2.obtener_informacion();
            System.out.println(Persona.idPersona);
        Alumno a1 = new Alumno("Edgar", "Castaneda", 22, 'h');
        a1.obtener_informacion();
        System.out.println(Persona.idPersona);
    }
}

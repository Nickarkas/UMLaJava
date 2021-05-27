/**
 * Clase Main ejercicio propuesto.
 * version 0.5
 */
package umlajava;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author nmcc
 */
public class UMLaJava {

    /**
     * ArrayList Carrera
     */
    static ArrayList<Carrera> coleccionCarreras;

    /**
     * ArrayList Materia
     */
    static ArrayList<Materia> materias;

    /**
     * Método para crearColección()
     */
    public static void crearColeccion() {
        coleccionCarreras = new ArrayList<Carrera>();
    }

    /**
     * Método para agregarCarrera()
     *
     * @param carrera
     */
    public static void agregarCarrera(Carrera carrera) {
        coleccionCarreras.add(carrera);
    }

    /**
     * Método para eliminarCarrera()
     *
     * @param carrera
     */
    public static void eliminarCarrera(Carrera carrera) {
        coleccionCarreras.remove(carrera);
    }

    public static void main(String[] args) {

        crearColeccion();

        Carrera c1 = new Carrera("Arquitectura", "ETSAS");
        agregarCarrera(c1);
        Carrera c2 = new Carrera("Licenciatura en Sistemas", "Informática");
        agregarCarrera(c2);

        /**
         * Crea materias y agrega a cada una de las carreras
         */
        Materia m1 = new Materia("Construcción");
        c1.agregarMateria(m1);
        Materia m2 = new Materia("Estructuras");
        c1.agregarMateria(m2);
        Materia m3 = new Materia("Proyectos");
        c1.agregarMateria(m3);

        Materia m4 = new Materia("Programación");
        c2.agregarMateria(m4);
        Materia m5 = new Materia("Programación Orientada a Objetos");
        c2.agregarMateria(m5);
        Materia m6 = new Materia("Redes");
        c2.agregarMateria(m6);

        /**
         * Crear profesores y agrega cómo titulares de materia
         */
        Profesor p1 = new Profesor("Antonio Barrionuevo", 19556, 8000, 6);
        Profesor p2 = new Profesor("Pepe Morales", 17938, 8631, 5);
        Profesor p3 = new Profesor("Ana Dianez", 13284, 9091, 19);
        c2.encontrarMateria("Programación").setTitular(p1);
        c2.encontrarMateria("Programación Orientada a Objetos").setTitular(p2);
        c2.encontrarMateria("Redes").setTitular(p3);

        /**
         * Crear alumnos y agrega a las materias de la carrera 1
         */
        Alumno a1 = new Alumno("Pepe Pérez", 54353);
        Alumno a2 = new Alumno("Manuela Juárez", 53341);
        Alumno a3 = new Alumno("Antonio Meza", 46323);
        Alumno a4 = new Alumno("Juana Arcos", 56899);
        Alumno a5 = new Alumno("Vanessa Selena", 49027);

        c2.encontrarMateria("Programación").agregarAlumno(a1);
        c2.encontrarMateria("Programación").agregarAlumno(a2);
        c2.encontrarMateria("Programación").agregarAlumno(a5);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAlumno(a1);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAlumno(a2);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAlumno(a3);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAlumno(a4);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAlumno(a5);
        c2.encontrarMateria("Redes").agregarAlumno(a3);
        c2.encontrarMateria("Redes").agregarAlumno(a5);

        /**
         * Creao Objeto Calendar para la fecha
         */
        Calendar cal = Calendar.getInstance();

        cal.set(2021, Calendar.MARCH, 7, 0, 0, 0);
        Asistencia as1 = new Asistencia(cal.getTime());
        as1.agregarAlumno(a1);
        as1.agregarAlumno(a2);
        as1.agregarAlumno(a5);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAsistencia(as1);

        cal.set(2021, Calendar.MARCH, 1, 0, 0, 0);
        Asistencia as2 = new Asistencia(cal.getTime());
        as1.agregarAlumno(a2);
        as1.agregarAlumno(a5);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAsistencia(as2);

        cal.set(2021, Calendar.MARCH, 30, 0, 0, 0);
        Asistencia as3 = new Asistencia(cal.getTime());
        as3.agregarAlumno(a1);
        as3.agregarAlumno(a2);
        as3.agregarAlumno(a4);
        c2.encontrarMateria("Programación Orientada a Objetos").agregarAsistencia(as3);

        /**
         * Impresión en consola de carreras con sus materias
         */
        for (Carrera c : coleccionCarreras) {
            System.out.print("*** Carrera: ");
            System.out.println(c.getNombre());
            System.out.println("-Materias:");
            for (Materia m : c.getMaterias()) {
                System.out.println(m.getNombre());
            }
            System.out.println("-------------");
        }

        /**
         * Impresión en consola de cada materia
         */
        System.out.println("Detalle de " + c2.getNombre());
        for (Materia m : c2.getMaterias()) {
            System.out.println("Materia: " + m.getNombre() + " - Titular: " + m.getTitular().getNombre() + " - Cantidad de inscriptos: " + m.calcularInscriptos());
        }
        System.out.println("-------------");

        /**
         * Impresión en consola de los inscritos
         */
        System.out.println("*** Inscriptos por materia");
        for (Materia m : c2.getMaterias()) {
            System.out.println("-" + m.getNombre() + ": Listado de alumnos inscriptos:");
            for (Alumno a : m.getAlumnos()) {
                System.out.println(a.getNombre());
            }
            System.out.println("-------------");
        }

        /**
         * Impresión de inscritos y porcentaje de asistencia el día XXX
         */
        System.out.println("*** Cantidad de inscriptos en POO: " + c2.encontrarMateria("Programación Orientada a Objetos").calcularInscriptos());
        System.out.println("*** Asistencia a POO el 11/03/2021");
        cal.set(2021, Calendar.MARCH, 11, 0, 0, 0);
        Date fecha = cal.getTime();
        System.out.println(c2.encontrarMateria("Programación Orientada a Objetos").calcularAsistencia(fecha));
        System.out.println("-------------");

        /**
         * Impresión sueldo XXX
         */
        System.out.println("Sueldo de Marcela Estevez:");
        System.out.println(p2.calcularSueldo());

    }
}

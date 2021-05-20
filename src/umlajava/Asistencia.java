/**
 * Clase Asistencia ejercicio propuesto.
 *
 */
package umlajava;

/**
 * Importamos el paquete de Java -> Date
 */
import java.util.Date;

/**
 * @author nmcc
 */
public class Asistencia {

    /**
     * Atributo fecha
     */
    private Date fecha;

    /**
     * Constructor por parámetro Asistencia()
     *
     * @param fecha
     */
    public Asistencia(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método getFecha()
     *
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método setFecha()
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}

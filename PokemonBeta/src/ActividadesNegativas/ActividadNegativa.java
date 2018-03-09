
package ActividadesNegativas;
import java.util.Random;
import Pokemones.Impresiones;


/**
 *
 * @author fabricio
 */
public class ActividadNegativa {
    int actividadAleatoria;
    String nombre;
    
    public ActividadNegativa(String nombre){
        this.nombre = nombre;
    }

    public ActividadNegativa() {
    }
    public void ImprimirSeleccion(){
        System.out.println("La actividad seleccionada fue: " + nombre + "\n");
    }
    public void SeleccionRandom(){
        Random aleatorio = new Random();
        actividadAleatoria = 1 + aleatorio.nextInt(3);
        this.actividadAleatoria = actividadAleatoria;
    }
    public void SeleccionActividad(){
        Impresiones imprimir = new Impresiones();
        SeleccionRandom();
        if (actividadAleatoria == 1){
            ActividadNegativa actividad1 = new Actividad1("Ver Television");
            imprimir.actividadCuatro();
            actividad1.ImprimirSeleccion();
        } else if (actividadAleatoria == 2){
            ActividadNegativa actividad2 = new Actividad2("Estudiar");
            imprimir.actividadCinco();
            actividad2.ImprimirSeleccion();
        } else {
            ActividadNegativa actividad3 = new Actividad3("Dormir");
            imprimir.actividadSeis();
            actividad3.ImprimirSeleccion();
        }
    }
}

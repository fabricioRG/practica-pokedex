
package ActividadesNegativas;
import java.util.Random;
//import Pokemones.Pokemon;


/**
 *
 * @author fabricio
 */
public class ActividadNegativa {
    int actividadAleatoria;
    String nombre;
    //Pokemon pokemon = new Pokemon();
    
    public ActividadNegativa(String nombre){
        this.nombre = nombre;
    }

    public ActividadNegativa() {
    }
    public void ImprimirSeleccion(){
        System.out.println("La actividad seleccionada fue: " + nombre);
    }
    public void SeleccionRandom(){
        Random aleatorio = new Random();
        actividadAleatoria = 1 + aleatorio.nextInt(3);
        this.actividadAleatoria = actividadAleatoria;
    }
    public void SeleccionActividad(){
        SeleccionRandom();
        if (actividadAleatoria == 1){
            ActividadNegativa actividad1 = new Actividad1("Ver Television");
            actividad1.ImprimirSeleccion();
        } else if (actividadAleatoria == 2){
            ActividadNegativa actividad2 = new Actividad2("Estudiar");
            actividad2.ImprimirSeleccion();
        } else {
            ActividadNegativa actividad3 = new Actividad3("Esconderse");
            actividad3.ImprimirSeleccion();
        }
        //pokemon.PerderVida();
    }
}


package ActividadesPositivas;
import java.util.Random;
import java.util.Scanner;
import Pokemones.Pokemon;
import Pokemones.Impresiones;

/**
 *
 * @author fabricio
 */
public class Actividad1 {
    
    int aleatorio, aleatorio2, seleccion;
    final String ganar = "!HAS GANADO¡, sigue asi";
    final String empatar = "!HAS EMPATADO¡, intentalo para la proxima";
    final String perder = "!HAS PERDIDO¡, intentalo para la proxima";
    
    public void Aleatorio(){
        Random random = new Random();
        aleatorio = 1 + random.nextInt(3);
        this.aleatorio = aleatorio;
    }
    public void Aleatorio2(){
        Random random2 = new Random();
        aleatorio2 = 1 + random2.nextInt(5);
        this.aleatorio2 = aleatorio2;
    }
    public int VidaGanar(){
        int HP;
        HP = 5 + aleatorio2;
        return HP;
    }
    
    public void Juego(){
        Aleatorio();
        Impresiones();
        InicioJuego();
        VidaGanar();
        
    }
    public void Impresiones(){
        Impresiones imprimiendo = new Impresiones();
        imprimiendo.ActividadUno();
        Scanner select = new Scanner(System.in);
        System.out.println("'Actividad: Piedra, Papel o Tijera'\n");
        
        System.out.println("Prueba tu habilidad seleccionando sabiamente tu arma:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        seleccion = select.nextInt();
    }
    public void InicioJuego(){
        if (aleatorio == 1){
            ProcesoJuego1();
        } else if (aleatorio == 2){
            ProcesoJuego2();
        } else if(aleatorio == 3){
            ProcesoJuego3();
        }
    }
    public void ProcesoJuego1(){
        if (seleccion == 1){
            System.out.println("--Piedra vs Piedra--");
            System.out.println(empatar);
        } else if (seleccion == 2){
            System.out.println("--Papel vs Piedra--");
            System.out.println(ganar);
        } else if (seleccion == 3){
            System.out.println("--Tijera vs Piedra");
            System.out.println(perder);
        }    
    }
    public void ProcesoJuego2(){
        if (seleccion == 1){
            System.out.println("--Piedra vs Papel--");
            System.out.println(perder);
        } else if (seleccion == 2){
            System.out.println("--Papel vs Papel--");
            System.out.println(empatar);
        } else if (seleccion == 3){
            System.out.println("--Tijera vs Papel");
            System.out.println(ganar);
        }
    }
    
    public void ProcesoJuego3(){
        if (seleccion == 1){
            System.out.println("--Piedra vs Tijera--");
            System.out.println(ganar);
        } else if (seleccion == 2){
            System.out.println("--Papel vs Tijera --");
            System.out.println(perder);
        } else if (seleccion == 3){
            System.out.println("--Tijera vs Tijera");
            System.out.println(empatar);
        }
    }
}


package ActividadesPositivas;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author fabricio
 */
public class Actividad1 {
    
    int aleatorio;
    int seleccion;
    public void Aleatorio(){
        Random random = new Random();
        aleatorio = 1 + random.nextInt(3);
        this.aleatorio = aleatorio;
    }
    
    public Actividad1() {
    }
    
    public void Juego(){
        Aleatorio();
        Impresiones();
        InicioJuego();
        
    }
    public void Impresiones(){
        Scanner select = new Scanner(System.in);
        System.out.println("'Juego: Piedra, Papel o Tijera'\n");
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
            System.out.println("!HAS EMPATADO¡, intentalo para la proxima");
        } else if (seleccion == 2){
            System.out.println("--Papel vs Piedra--");
            System.out.println("!HAS GANADO¡, sigue asi");
        } else if (seleccion == 3){
            System.out.println("--Tijera vs Piedra");
            System.out.println("!HAS PERDIDO¡, intentalo para la proxima");
        }    
    }
    public void ProcesoJuego2(){
        if (seleccion == 1){
            System.out.println("--Piedra vs Papel--");
            System.out.println("!HAS PERDIDO¡, intentalo para la proxima");
        } else if (seleccion == 2){
            System.out.println("--Papel vs Papel--");
            System.out.println("!HAS EMPATADO¡, intentalo para la proxima");
        } else if (seleccion == 3){
            System.out.println("--Tijera vs Papel");
            System.out.println("!HAS GANADO¡, sigue asi");
        }
    }
    
    public void ProcesoJuego3(){
        if (seleccion == 1){
            System.out.println("--Piedra vs Tijera--");
            System.out.println("!HAS GANADO¡, sigue asi");
        } else if (seleccion == 2){
            System.out.println("--Papel vs Tijera --");
            System.out.println("!HAS PERDIDO¡, intentalo para la proxima");
        } else if (seleccion == 3){
            System.out.println("--Tijera vs Tijera");
            System.out.println("!HAS EMPATADO¡, intentalo para la proxima");
        }
    }
}

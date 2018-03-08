
package ActividadesPositivas;

import java.util.Random;
import java.util.Scanner;
import Pokemones.Impresiones;

/**
 *
 * @author fabricio
 */
public class Actividad2 {
    int aleatorio, seleccion;
    
    public void Aleatorio(){
        Random random = new Random();
        aleatorio = 1 + random.nextInt(10);
        this.aleatorio = aleatorio;
    }

    public Actividad2() {
    }
    
    public void Actividad(){
        Aleatorio();
        Impresiones();
        InicioJuego();
        Seleccion();
        Respuesta();
        
    }
    
    public void Impresiones(){
        Impresiones imprimir = new Impresiones();
        imprimir.actividadDos();
        System.out.println("Actividad: 'Adivinanzas Logicas' [Pondras a prueba tu ingenio]");
        System.out.println("A continuacion encontraras una adivinanza, elige sabiamente\n");
    }
    public void Seleccion(){
        Scanner select = new Scanner(System.in);
        System.out.println("Selecciona la respuesta correcta");
        seleccion = select.nextInt();
    }
    public void InicioJuego(){
        if(aleatorio == 1){
            Pregunta1();
        } else if (aleatorio == 2){
            Pregunta2();
        } else if (aleatorio == 3){
            Pregunta3();
        } else if (aleatorio == 4){
            Pregunta4();
        } else if (aleatorio == 5){
            Pregunta5();
        } else if (aleatorio == 6){
            Pregunta6();
        }else if (aleatorio == 7){
            Pregunta7();
        } else if (aleatorio == 8){
            Pregunta8();
        } else if (aleatorio == 9){
            Pregunta9();
        } else {
            Pregunta10();
        }
    }
    public void Respuesta(){
        if (seleccion == 2){
            System.out.println("Felicidades, has acertado a la respuesta, sigue asi");
        } else {
            System.out.println("Lo siento, no es la respuesta correcta, intentalo para la proxima");
        }
    }
    public void Pregunta1(){
        System.out.println("Un avión lleno de pasajeros, se estrella justo en la frontera entre España y Portugal...\n" +
"\n" +
"Pregunta: ¿Donde entierran a los sobrevivientes?");
        System.out.println("1. En España\n" + 
                "2. No los entierran\n" +
                "3. En Portugal");
    }
    public void Pregunta2(){
        System.out.println("Si Juan habla más bajo que Pedro y Carlos habla más alto que Pedro.\n" +
"\n" +
"Pregunta: ¿Habla Juan más alto o más bajo que Carlos?");
        System.out.println("1. Carlos\n" +
                "2. Juan\n" +
                "3. Pedro");
    }
    public void Pregunta3(){
        System.out.println("Domingo murió, lunes lo velaron y martes lo enterraron.\n" +
"\n" +
"Pregunta: ¿Como se llama el muerto?");
        System.out.println("1. No se sabe quien murio\n" +
                "2. Domingo\n" +
                "3. Nunca lo sabremos xd");
    }
    public void Pregunta4(){
        System.out.println("Si el hijo de Juan es el padre de mi hijo.\n" +
"\n" +
"Pregunta: ¿Que relación tengo con Juan?\n");
        System.out.println("1. El padre de Juan\n" +
                "2. El hijo de Juan\n" +
                "3. El abuelo de Juan");
    }
    public void Pregunta5(){
        System.out.println("¿Cuantos animales tengo en casa si todos son perros menos dos, todos son gatos menos dos y todos son conejos menos dos?");
        System.out.println("1. Tengo seis animales, dos perros, dos gatos y dos conejos\n" +
                "2. Tengo tres animales, un perro, un gato y un conejo\n" + 
                "3. Tengo ocho animales, dos tres perros, tres gatos y dos conejos");
    }
    public void Pregunta6(){
        System.out.println("Un hombre va a la capital, por el camino se cruza con 5 mujeres, cada mujer lleva 5 niños y cada niño 5 perros.\n" +
"\n" +
"Pregunta: Entre hombres, mujeres, niños y perros ¿Cuantos van a la capital?");
        System.out.println("1. 126\n" +
                "2. 1\n" +
                "3. 16");
    }
    public void Pregunta7(){
        System.out.println("Si una camiseta se seca al sol en dos minutos.\n" +
"\n" +
"Pregunta: ¿Cuando tardan en secarse 5 camisetas?");
        System.out.println("1. diez minutos\n" +
                "2. dos minutos\n"+
                "3. un minuto");
    }
    public void Pregunta8(){
        System.out.println("Si cinco cazadores cazan 5 liebres en cinco días.\n" +
"\n" +
"Pregunta: ¿Cuanto tardará en cazar un cazador una liebre?");
        System.out.println("1. cinco dias\n" +
                "2. un dia\n"+
                "3. medio dia");
    }
    public void Pregunta9(){
        System.out.println("Soy mas  de uno sin llegar a tres, y llego a cuatro cuando dos me des.");
        System.out.println("1. cuatro\n"+
                "2. dos\n"+
                "3. uno");
    }
    public void Pregunta10(){
        System.out.println("Si 5 gatos cazan 5 ratones en 5 minutos, ¿Cuantos gatos cazaran 100 ratones en 100 minutos?");
        System.out.println("1. 10 gatos\n"+
                "2. 100 gatos\n"+
                "3. 50 gatos");
    }
    
}

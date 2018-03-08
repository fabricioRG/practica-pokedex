package ActividadesPositivas;

import java.util.Random;
import java.util.Scanner;
import Pokemones.Impresiones;

/**
 *
 * @author fabricio
 */
public class Actividad3 {

    int aleatorio;
    String respuesta;

    public Actividad3() {
    }

    public void Actividad() {
        Impresiones imprimir = new Impresiones();
        Scanner respuesta = new Scanner(System.in);
        imprimir.actividadTres();
        System.out.println("Actividad: Leer Chistes Matematicos\n");
        System.out.println("¿Te gustan los chistes? s/n");
        this.respuesta = respuesta.nextLine();
        if (this.respuesta.equalsIgnoreCase("s")) {
            System.out.println("A continuacion encontraras un chiste [Diviertete un poco, no hace mal xD]\n");
            Aleatorio();
            InicioJuego();
        } else {
            System.out.println("Debes desestresarte leyendo chistes, que amargado :/ \n");
        }

    }

    public void Aleatorio() {
        Random random = new Random();
        aleatorio = 1 + random.nextInt(10);
        this.aleatorio = aleatorio;
    }

    public void Impresiones() {
        
    }

    public void InicioJuego() {
        if (aleatorio == 1) {
            chiste1();
        } else if (aleatorio == 2) {
            chiste2();
        } else if (aleatorio == 3) {
            chiste3();
        } else if (aleatorio == 4) {
            chiste4();
        } else if (aleatorio == 5) {
            chiste5();
        } else if (aleatorio == 6) {
            chiste6();
        } else if (aleatorio == 7) {
            chiste7();
        } else if (aleatorio == 8) {
            chiste8();
        } else if (aleatorio == 9) {
            chiste9();
        } else {
            chiste10();
        }
    }

    public void chiste1() {
        System.out.println(" Estaba Jesús predicando en el monte Sinaí y dijo a sus discípulos:\n"
                + "\n"
                + "y = ax2 + bx + c\n"
                + "\n"
                + "¿Y eso qué es? Dijo uno de los discípulos. \n"
                + "\n"
                + "A lo que Jesús respondió:  ¡Una parábola !\n");
    }

    public void chiste2() {
        System.out.println("Definición matemática de mujer:\n"
                + "\n"
                + "\"Conjunto de curvas peligrosas que ponen recta una parábola\"     \n");
    }

    public void chiste3() {
        System.out.println("¿Qué es un niño complejo?\n"
                + "Un niño con la madre real y el padre imaginario. \n");
    }

    public void chiste4() {
        System.out.println(" EXCUSAS PARA NO HACER LOS DEBERES DE MATEMÁTICAS\n"
                + "\n"
                + " \n"
                + "\n"
                + "-Es que tengo una calculadora solar, y como estaba nublado...\n"
                + "\n"
                + "-Sé como comprobarlo, pero es que este margen es muy pequeño.\n"
                + "\n"
                + "- Metí los deberes en la carpeta y la cerré pero vino un perro tetradimensional y se los comió.\n"
                + "\n"
                + "- Juraría que los guardé en una botella de Klein, pero esta mañana no estaban.\n"
                + "\n"
                + "- Estaba viendo el partido de fútbol cuando se me ocurrió comprobar si convergía... y claro, no me dio tiempo a hacer los deberes.\n");
    }

    public void chiste5() {
        System.out.println("Dos matemáticos están discutiendo en un bar. Uno de ellos dice que la gente no sabe nada de matemáticas, mientras que el otro mantiene que todo el mundo esta preparado para resolver casi cualquier problema  que les aparezca en su vida. En esto que el que dice que no tienen ni idea se va al cuarto de baño, y el otro llama a una camarera rubia y le dice :\n"
                + "\n"
                + "\n"
                + "- Mire, ¿me puede hacer un favor? Dentro de un rato le haré una pregunta, y usted me tiene que responder \"un tercio de x al cubo\".\n"
                + "- Un cubo de que?\n"
                + "- No, \"un tercio de x al cubo\".\n"
                + "- Un trozo de queso en cubos ?\n"
                + "- No, \"un tercio de x al cubo\", repita.\n"
                + "- Un tejido de equis en cubos ? No tiene sentido !\n"
                + "- No, no, fíjese, lo esta diciendo mal, es \"un tercio de x al cubo\".\n"
                + "- Un tercio de x al cubo ?\n"
                + "- Si !Eso es! No lo olvide, por favor!\n"
                + "\n"
                + "\n"
                + "En esto que la camarera se aleja repitiendo en voz baja \"un tercio de x al cubo\", \"un tercio de x al cubo\"... y el otro matemático vuelve.\n"
                + "- Mira, para que veas, vamos a hacerle una pregunta a cualquiera, por ejemplo, esa camarera rubia, y verás como nos responde.\n"
                + "- Vale. Llámala.\n"
                + "- Oiga ! Camarera, por favor !\n"
                + "- Si ?\n"
                + "- Usted sabe cuánto es la integral de x al cuadrado ?\n"
                + "- Ah...! Un tercio de x al cubo... más la constante de integración.\n"
                + "\n"
                + "\n");
    }

    public void chiste6() {
        System.out.println("Sucedió que un día estaban muy aburridos los números y las funciones, así que para matar el aburrimiento, se les ocurrió hacer una fiesta. Dicho y hecho, arrendaron un local y comenzaron el cachondeo.\n"
                + "\n"
                + "Lo estaban pasando de miedo, el 69 para que les cuento, entre la función seno y el número pi se iniciaba un romance, etc., en fin el desmadre era máximo. Resultó que la derivada, muy envidiosa, decide ir y aguar la fiesta. Cuando llega, horror total, salen todos los números y funciones, temerosos de ser \"atacados\" y \"modificados\"... un verdadero desastre, todos muy urgidos con la derivada. Ésta, muy orgullosa de su poder, ve que alguien ni se inmuta con su presencia, así que se dirige hacia él y lo increpa: - Oye tú, ¿acaso no me tienes miedo? - ¡No! - ¿Sabes quien soy? - ¡Sí! - Y entonces... ¿por qué no escapas como todos los otros? - ¡Porque no quiero! - ¿Quién eres tú, que te atreves a hablarme así? - Soy ex\n"
                + "\n"
                + "  \n");
    }

    public void chiste7() {
        System.out.println(" 2 + 2 = ?\n"
                + "\n"
                + "    Ingeniero: 3.9968743\n"
                + "\n"
                + "    Físico: 4.000000004 ± 0.00000006\n"
                + "\n"
                + "    Matemático: Espere, solo unos minutos más, ya he probado que la solución existe y es única, ahora la estoy acotando...\n"
                + "\n"
                + "    Filósofo: ¿Qué quiere decir 2+2?\n"
                + "\n"
                + "    Lógico: Defina mejor 2+2 y le responderé.\n"
                + "\n"
                + "    Contador: ¿Cuánto quiere que de?\n");
    }

    public void chiste8() {
        System.out.println("Encontramos a un físico y un matemático tomando un café en un bar. Cuando por la cristalera ven una furgoneta completamente vacía. Más tarde, dos individuos entran en la furgoneta y al rato salen 3 individuos. El físico, sin perder detalle dice:\n"
                + "\n"
                + "-¡Eso es imposible!. -¿Por qué?. -responde el matemático- Sólo tiene que entrar un individuo en la furgoneta para que ésta esté completamente vacía?.\n");
    }

    public void chiste9() {
        System.out.println("A dos extraterrestres se les estropea la nave y no tienen más remedio que aterrizar y buscar un taller. En esto que se encuentran con un terrícola.\n"
                + "\n"
                + "- Buenas tardes, verá se nos ha estropeado el OVNI y estamos buscando un taller, ¿podría usted decirnos donde estamos?.\n"
                + "\n"
                + "El tío se queda pensando un rato hasta que dice:\n"
                + "\n"
                + "- Están ustedes en la Tierra.\n"
                + "\n"
                + "-Jo tío vámonos, 6.000 millones de terrícolas y hemos ido a encontrar al más gilipollas de todos- dice el 2º ET.\n"
                + "\n"
                + "-No tío-replica el 1º-¿no te das cuenta de que es un matemático?\n"
                + "\n"
                + "-¿Y cómo sabes eso?\n"
                + "\n"
                + "-Muy sencillo, ante una pregunta simple que cualquier ser de la galaxia con una mínima capacidad intelectual hubiera podido responder rápida y eficazmente, él ha tenido que meditar varios minutos para al final contestarnos algo que es absolutamente cierto, que ya sabíamos y que no nos sirve de nada.  \n");
    }

    public void chiste10() {
        System.out.println("Va ex por la calle y se le cruza un integrador, el cual, todo prepotente, le dice: \"¡A que te integro!\" y ex le contesta: \"Y a mí qué ...\" \n");
    }

}

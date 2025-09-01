# Implementando una Lista Enlazada

## Introducción

Java posee una herramienta potente llamada `LinkedList`, la cual es parte de su framework de **Colecciones** (`Collections`). Una **lista enlazada** es una estructura de datos donde cada elemento, o **nodo**, contiene una referencia al siguiente en la secuencia. A diferencia de los arreglos (`arrays`), las listas enlazadas no requieren un bloque contiguo de memoria, lo que las hace excelentes para escenarios donde se necesita insertar o eliminar elementos con frecuencia.

Imagine que está organizando una búsqueda del tesoro para sus amigos, con una serie de pistas que conducen a un tesoro escondido. Cada pista apunta a la siguiente, formando una cadena que debe seguirse secuencialmente para alcanzar el objetivo. De manera similar, en programación, una lista enlazada es una estructura de datos donde cada elemento apunta al siguiente en la secuencia.

En esta actividad, aprenderá a utilizar la clase `LinkedList` incorporada en Java para gestionar secuencias como esta. Al finalizar, será capaz de:
* Declarar e inicializar una `LinkedList`.
* Añadir, actualizar, acceder y eliminar elementos de ella.

## Explore un Ejemplo de la `LinkedList` Incorporada en Java

Imagine que está creando una secuencia de pistas para su búsqueda del tesoro. Para gestionar esta secuencia en su programa de Java, utilizará una `LinkedList`. En este ejemplo, usted va a:
* Declarar una lista enlazada.
* Añadir, actualizar, acceder y eliminar elementos.

Comencemos por declarar e inicializar una lista enlazada para contener nuestras pistas.

Usted tiene los siguientes datos:
* **Pistas**: una lista de cadenas de texto (`strings`) que representan cada paso de la búsqueda del tesoro.

### Instrucciones

Necesita algunos elementos de Java para configurar la lista enlazada:
1. Importe `java.util.LinkedList` para poder utilizar la clase `LinkedList`.
2. Cree un nuevo objeto `LinkedList` llamado `clues` para contener los pasos de la búsqueda del tesoro.
3. Para declarar e inicializar la `LinkedList`, inserte el siguiente código:
   
   ```java
   LinkedList<String> clues = new LinkedList<>();
   ```

4. Seleccione Ejecutar (Run) para ver la salida de datos.
5. Examine la salida
   
   ```java
   import java.util.LinkedList;

   public class TreasureHunt {
      public static void main(String[] args) {
         // Create a LinkedList to hold the clues
         LinkedList<String> clues = new LinkedList<>();
      }
   }
   ```

Cuando ejecuta el código, se imprime una lista vacía. Esto se debe a que aún no hemos añadido ninguna pista. Hagámoslo ahora.

Añadir elementos a una `LinkedList` es como anotar cada nueva pista en un bloc de notas. El método `add()` es como un asistente incorporado que facilita la inserción de nuevos elementos en su lista. Cuando usted utiliza el método `add()`, la `LinkedList` de Java localiza la posición correcta en la secuencia y lo inserta por usted. Este método añade el nuevo elemento al final de la lista por defecto, convirtiéndolo en el siguiente paso de su secuencia.

### Instrucciones

Siga estos pasos en el bloque de código anterior:
1. Use el método `add()` para añadir sus propias pistas nuevas a la siguiente lista:
   * **"Check inside the mailbox"**
   * **"Go to the fountain in the park"**
   * **"Look for the Oak tree"**
2. Imprima la lista completa de pistas para confirmar que la nueva pista ha sido añadida.
   
   ```java
   import java.util.LinkedList;

   public class TreasureHunt {
      public static void main(String[] args) {
         // Create a LinkedList to hold the clues
         LinkedList<String> clues = new LinkedList<>();
         clues.add("Check inside the mailbox");
         clues.add("Go to the fountain in the park");
         clues.add("look for the oak tree");
         // Add more clues here...
         System.out.println(clues);
      }
   }
   ```

¿Pero qué sucede si se da cuenta de que una de las pistas necesita ser actualizada? Quizás quería decir **"gran árbol de roble"** (**"big oak tree"**) en lugar de **"árbol de roble"** (**"oak tree"**). ¡No hay problema! Puede actualizar cualquier pista en su lista. El método `set()` es un método incorporado que le permite reemplazar un elemento existente en una posición específica de la lista.

Cuando utiliza el método `set()`, le está diciendo a la LinkedList: "cambie la cadena de texto (`String`) en una posición particular por algo más específico". El método `set()` se encarga de localizar la posición exacta en la lista y actualizar el elemento con el nuevo valor que usted proporciona.

Exploremos la sintaxis del método `set()` con un ejemplo:

```java
clues.set(2, "Use the Yellow key");
```

Observe que el método `set()` toma dos argumentos: un entero (`integer`) y un valor para reemplazar el valor antiguo. El primer argumento representa el **índice** de la LinkedList cuyo valor se va a actualizar. El tipo del segundo argumento depende del tipo de dato que esté almacenando en la `LinkedList`; en este caso, es una cadena de texto (`String`).

Suponga que una de sus pistas no es lo suficientemente clara y desea hacerla más específica. Actualicémosla.

### Instrucciones

Siga estos pasos actualizando el bloque de código anterios:
1. Use el método `set()` para actualizar la tercera pista de su lista para que diga: `"Look behind the old oak tree."`
2. Imprima la lista actualizada para asegurarse de que el cambio se ha realizado.
   
   ```java
   import java.util.LinkedList;

   public class TreasureHunt {
      public static void main(String[] args) {
         // Create a LinkedList to hold the clues
         LinkedList<String> clues = new LinkedList<>();
         clues.add("Check inside the mailbox");
         clues.add("Go to the fountain in the park");
         clues.add("look for the oak tree");
         // Add more clues here...
         System.out.println(clues);

         clues.set(2, "Look behind the old Oak tree");
         System.out.println("updated clues :  " + clues);
      }
   }
   ```

¡Gran trabajo! Está comenzando a poner en práctica sus nuevas habilidades. Vayamos un paso más allá. Exploremos cómo recuperar pistas específicas de su lista de búsqueda del tesoro utilizando el método `get()`. Esta función incorporada le permite acceder a cualquier elemento en su `LinkedList` especificando su posición, lo que facilita la revisión o visualización de pistas particulares cuando lo necesite.

Digamos que quiere recordar dónde comienza la búsqueda del tesoro. Puede usar el método `get()` para obtener la primera pista de su lista. En este fragmento de código, recuperamos la pista en el índice `0`, el primer elemento de su lista. Esta pista se almacena en la variable `firstClue` y luego se muestra en la consola.

```java
import java.util.LinkedList;

public class TreasureHunt {
   public static void main(String[] args) {
      // Create a LinkedList to hold the clues
      LinkedList<String> clues = new LinkedList<>();
      clues.add("Check inside the mailbox");
      clues.add("Go to the fountain in the park");
      clues.add("look for the oak tree");
      // Add more clues here...
      System.out.println(clues);

      clues.set(2, "Look behind the old Oak tree");
      System.out.println("updated clues :  " +clues);
      // Access the first clue
      String firstClue = clues.get(0);
      System.out.println("First clue: " + firstClue);
   }
}
```

Imagine que quiere verificar la segunda pista en su lista de búsqueda del tesoro para asegurarse de que todo esté en orden. Hagámoslo ahora.

### Instrucciones

Siga estos pasos en el bloque de código interactivo:
* **TODO 1**: Use el método `get()` para recuperar la segunda pista de su `LinkedList`.
* **TODO 2**: Almacene esta pista en una variable llamada `secondClue`.
* **TODO 3**: Imprima la pista en la consola para verificarla.

```java
import java.util.LinkedList;

public class TreasureHunt {
   public static void main(String[] args) {
      // Create a LinkedList to hold the clues
      LinkedList<String> clues = new LinkedList<>();
      clues.add("Check inside the mailbox");
      clues.add("Go to the fountain in the park");
      clues.add("Look behind the old Oak tree");
      // Add more clues here...
      System.out.println(clues);

      // Access the second clue
      // TODO 1: Use get method and fetch second clue
      // TODO 2: Store in a variable
      // TODO 3: Print the clue
      String secondClue = clues.get(1);
      System.out.println("Second clue: " + secondClue);
   }
}
```

> [!Note]
> El método `get()` es increíblemente útil cuando desea:
> * Recuperar cualquier elemento de una lista para verificar su valor o realizar ajustes.
> * Mostrar elementos uno por uno para una comprensión más fácil o para procesos paso a paso.
> * Asegurarse de que todos los elementos estén en el orden correcto, lo cual es importante para mantener secuencias lógicas en sus datos.

Finalmente, considere lo que sucede cuando desea eliminar un elemento. Digamos que una de las pistas es irrelevante, ¿o necesita terminar la búsqueda antes de tiempo? Eliminar elementos de una `LinkedList` es tan simple como añadirlos.

La clase `LinkedList` en Java proporciona muchas variantes del método "remove", como el método `remove()` que recupera y elimina el primer elemento de la lista. Para más detalles sobre otras variantes, puede consultar este enlace: `LinkedList` [(Java SE 21 & JDK 21) (oracle.com)](http://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html#method-summary)

Uno de dichos métodos es `removeLast()`, que automáticamente encuentra y elimina el elemento final de su lista. Es como tachar el último paso de su búsqueda del tesoro, asegurando que el viaje termine exactamente donde lo planeó. Probemos esto eliminando esta pista de la lista.

### Instrucciones

Siga los siguientes pasos para modificar el bloque de código mostrado a continuación:
1. Use el método `removeLast()` para eliminar el último elemento de su `LinkedList`.
2. Imprima la lista de pistas actualizada para verificar que la última pista ha sido eliminada.

   ```java
   import java.util.LinkedList;

   public class TreasureHunt {
      public static void main(String[] args) {
         // Create a LinkedList to hold the clues
         LinkedList<String> clues = new LinkedList<>();
         clues.add("Check inside the mailbox");
         clues.add("Go to the fountain in the park");
         clues.add("Look behind the old Oak tree");
         // Remove the last clue
         clues.removeLast();
         System.out.println(clues);
      }
   }
   ```

   El método `remove()` también se puede utilizar con un índice para otorgar un mayor control.

   ```java
   import java.util.LinkedList;

   public class TreasureHunt {
      public static void main(String[] args) {
         // Create a LinkedList to hold the clues
         LinkedList<String> clues = new LinkedList<>();
         clues.add("Check inside the mailbox");
         clues.add("Go to the fountain in the park");
         clues.add("Look behind the old Oak tree");
         // Remove the clue in position 1
         clues.remove(1);
         System.out.println(clues);
      }
   }
   ```

¡Bien hecho! Ha trabajado a través de un ejemplo práctico de implementación de una LinkedList. Usted declaró, inicializó, añadió, actualizó, accedió y eliminó elementos; ¡sus habilidades están creciendo rápidamente!

## Desafío: Organizar una Lista de Compras

¡Ahora es su turno! Imagine que está planeando ir de compras al supermercado. Tiene una lista de artículos que necesita comprar, pero mientras se prepara, se da cuenta de que algunos artículos ya no son necesarios, otros necesitan ser actualizados, y debe añadir algunos más. Su desafío es gestionar esta lista utilizando la clase `LinkedList` incorporada de Java.

Usted tiene los siguientes datos:
* **Items**: Milk, bread, eggs, butter, tomatoes.

La clase principal (`Main`) con una estructura de métodos predefinida, incluyendo el objeto `list` de la clase `LinkedList`, ya se proporciona. Por lo tanto, solo necesita escribir la lógica en los métodos relevantes según la tarea.

### Requisitos

Complete estos pasos en el siguiente de código:

1. **Añadir artículos**: Escriba la lógica dentro del método `addItems()`. Añada los siguientes artículos a su lista:
   * "Milk"
   * "Bread"
   * "Eggs"
   * "Butter"
   * "Tomatoes"
2. **Actualizar un artículo**: Se da cuenta de que necesita comprar "Whole wheat bread" (pan integral), no solo "Bread". Actualice este artículo en la lista utilizando el método `updateItem()`.
3. **Eliminar un artículo**: Ya no necesita "Butter" (mantequilla). Elimine este artículo de su lista.
4. **Añadir otro artículo**: Recuerda que también necesita "Cheese" (queso). Añada esto a la lista.
5. **Imprimir la lista final**: Imprima la lista final de artículos para asegurarse de que sea precisa y esté completa.
6. **Examine la salida** (*output*).

```java
import java.util.LinkedList;

public class Recipe {
   public static void main(String[] args) {
      LinkedList<String> recipeSteps = new LinkedList<>();
      //  1
           
      // 2
      
      // 3
            
      // 4
      
      // 5
   }
}
```

### Punto de Reflexión

La siguiente salida (*output*) refleja el resultado deseado para el desafío.

```
Final Grocery List: [Milk, Whole Wheat Bread, Eggs, Tomatoes, Cheese]
```

Tómese un momento para reflexionar sobre el desafío que ha completado haciéndose estas preguntas:
* ¿En qué áreas tuve dificultades y por qué?
* ¿Cómo solucioné los errores (si los hubo)?
* ¿Qué lecciones aplicaré en el futuro?

Si enfrenta problemas al decidir qué métodos de `LinkedList` utilizar mientras completa el desafío, puede encontrar una lista de todos los métodos relevantes con una descripción aquí: `LinkedList` [(Java SE 21 & JDK 21) (oracle.com)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html#method-summary)

En el siguiente [link](src) se encuentra la solución. Puede revisar la solución después de que haya intentado el desafío.

> [!Tip]
> **Buenas practicas de programación**
> 
> Si no obtuvo la salida (*output*) deseada, tómese un tiempo para depurar su código. Los errores le ocurren a todo el mundo, incluso a los mejores desarrolladores de software. Resolverlos es parte del trabajo.
> 
> Antes de codificar, asegúrese de tener una comprensión sólida de cómo funcionan las **listas enlazadas**, ya sean simples o doblemente enlazadas. Conozca el comportamiento de los punteros `next` y `prev` y cuándo usar cada tipo de lista según sus requisitos.
> 
> **Manejo de Errores y Comprobaciones de Nulos**
> 
> Siempre verifique escenarios especiales como una **lista vacía**, un **único nodo**, o el haber llegado al **final de la lista**. Por ejemplo, al recorrer o modificar nodos, compruebe si son nulos para evitar errores de tipo `NullPointerException`.

## Conclusión

¡Bien hecho! Ha aprendido a crear, añadir, actualizar, acceder y eliminar elementos en una lista dinámica; habilidades cruciales para muchos escenarios de programación del mundo real. Ya sea organizando una búsqueda del tesoro, gestionando una lista de compras o manejando una secuencia de tareas, `LinkedList` ofrece una forma potente de mantener sus datos flexibles y adaptables. ¡Siga practicando y encontrará innumerables maneras de aplicar estas técnicas en sus proyectos!

A medida que construye su conjunto de herramientas de programación, considere cómo estas habilidades podrían aplicarse a estructuras de datos más complejas. Por ahora, solo ha utilizado esta estructura como una `LinkedList` simple, que le permite moverse en una dirección. Pero, ¿qué pasaría si necesitara recorrerla hacia adelante y hacia atrás, como al implementar el historial de navegación "anterior" y "siguiente" de un navegador web o al gestionar una funcionalidad de "deshacer/rehacer" en una aplicación?.
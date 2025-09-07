# Implementación de una lista doblemente enlazada


## Introducción

Imagine que está construyendo una aplicación de cocina donde los usuarios pueden crear y gestionar sus recetas. Cada receta se compone de una lista de ingredientes o pasos que deben seguirse. Pero, ¿qué pasaría si los usuarios quisieran poder añadir nuevos ingredientes o pasos en cualquier punto de la receta, eliminar elementos que no necesitan, y reorganizar la lista a su conveniencia?

Para que esto funcione, se necesita una forma de insertar, eliminar y reorganizar fácilmente estos pasos o ingredientes de la receta. La herramienta perfecta para esta tarea es la clase `LinkedList` de Java, la cual, como usted sabe, es internamente una lista doblemente enlazada.

En esta lectura, usted aprenderá a utilizar la clase nativa `LinkedList` de Java para implementar y manipular listas doblemente enlazadas de manera efectiva. Usted obtendrá experiencia práctica en la declaración e inicialización de listas enlazadas, la realización de operaciones clave como añadir, insertar y eliminar elementos, y el aprovechamiento de las capacidades de recorrido bidireccional de una lista doblemente enlazada a través de ejercicios prácticos de codificación.

## La clase nativa `LinkedList` para la gestión de recetas

Al igual que en la gestión de una lista de tareas, una receta involucra pasos o ingredientes que se deben mantener en orden. A veces, podría ser necesario cambiar el orden, o añadir o eliminar pasos basándose en nueva información o preferencias.

La clase `LinkedList` de Java facilita la gestión de estas listas dinámicas. Permite añadir nuevos pasos donde sea que se necesiten, eliminar pasos innecesarios, e incluso reorganizar el orden, todo mientras gestiona eficientemente las conexiones entre cada elemento de la lista.

Veamos cómo se puede utilizar esta clase para construir y gestionar una lista de recetas.

## Declaración e inicialización de una `LinkedList`

Creemos una `LinkedList` para representar los pasos o ingredientes de una receta. En este ejemplo, se utilizará la `LinkedList` para almacenar cada paso como un `String`. También se verá cómo utilizar el método `add()` para añadir pasos a la lista.

```java
import java.util.LinkedList;
public class Recipe {
    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        // Adding steps to the recipe
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar.");
        recipeSteps.add("Add eggs and milk.");
        System.out.println("Recipe Steps: " + recipeSteps);
    }
}
```

En este ejemplo, se ha creado una `LinkedList` para contener los pasos de una receta. Cada paso es un `String` que describe lo que se necesita hacer.

## Añadir un elemento al principio o al final

Suponga que un usuario se da cuenta de que olvidó añadir un paso importante al principio, como "reunir todos los ingredientes", o que desea añadir un paso final como "servir y disfrutar". En el siguiente código, se explorará el uso del método `addFirst()` para insertar un paso al inicio de la lista y el método `addLast()` para añadir un paso al final. Estos métodos permiten actualizar su `LinkedList` fácilmente según sea necesario.

```java
import java.util.LinkedList;

public class Recipe {

    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        // Adding steps to the recipe
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar.");
        recipeSteps.add("Add eggs and milk.");
        // Adding a step at the beginning
        recipeSteps.addFirst("Gather all ingredients.");
        // Adding a step at the end
        recipeSteps.addLast("Serve and enjoy.");
        System.out.println("Updated Recipe Steps: " + recipeSteps);
    }
}
```

En este ejemplo, el método `addFirst` añade un nuevo elemento, "Gather all ingredients." (Reunir todos los ingredientes), al inicio de la lista. El método addLast añade un nuevo elemento, "Serve and enjoy." (Servir y disfrutar), al final de la lista.

## Añadir un elemento en una posición intermedia

Si un usuario necesita insertar un nuevo paso en una posición intermedia de la receta, como "Whisk the eggs before adding" (Batir los huevos antes de añadirlos), puede utilizar el método `add()` con un índice. El método `add(índice, elemento)` permite colocar un elemento en una posición específica de la lista. El siguiente código lo utiliza para insertar el paso de batir los huevos en el índice 2:

```java
import java.util.LinkedList;

public class Recipe {

    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        // Adding steps to the recipe
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar.");
        recipeSteps.add("Add eggs and milk.");
        // Adding a step at the beginning
        recipeSteps.addFirst("Gather all ingredients.");
        // Adding a step at the end
        recipeSteps.addLast("Serve and enjoy.");
        System.out.println("Updated Recipe Steps: " + recipeSteps);
        // Adding a step at a specific position (index 2)
        recipeSteps.add(2, "Whisk the eggs before adding.");
        System.out.println("Recipe Steps after adding in the middle: " + recipeSteps);
    }
}
```

Adicionalmente, a continuación se presentan un par de puntos esenciales a tener en cuenta:

1. Sí, una `LinkedList` puede contener cualquier tipo de dato, incluyendo enteros. Sin embargo, el método `add(índice, elemento)` puede diferenciar entre el índice y el dato porque siempre espera que el primer argumento sea un entero (el índice) y el segundo argumento sea el dato.
2. Si un usuario no conoce el índice exacto para insertar un elemento, puede buscar entradas de datos conocidas utilizando el método `indexOf()` para encontrar la posición, o el método `contains()` para verificar si un elemento ya existe en la lista.

Al utilizar estos métodos, se puede gestionar y actualizar eficazmente la `LinkedList` incluso cuando no se conoce el índice exacto.

## Eliminar un elemento

Se puede eliminar un paso no deseado de la receta, ya sea que esté al principio, en una posición intermedia o al final.

### Eliminar el primer elemento

Utilizando una función nativa, se puede eliminar el primer paso (nodo o elemento) de la lista. Es como tacharlo de su lista de tareas pendientes. Después de eliminar el paso (nodo), tómese un momento para observar lo que queda. Para ver la receta actualizada, se puede imprimir la lista de pasos, la cual ahora muestra las instrucciones restantes después de que la primera ha sido eliminada.

```java
import java.util.LinkedList;

public class Recipe {

    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        // Adding steps to the recipe
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar.");
        recipeSteps.add("Add eggs and milk.");
        // Adding a step at the beginning
        recipeSteps.addFirst("Gather all ingredients.");
        // Adding a step at the end
        recipeSteps.addLast("Serve and enjoy.");
        System.out.println("Updated Recipe Steps: " + recipeSteps);
        // Adding a step at a specific position (index 2)
        recipeSteps.add(2, "Whisk the eggs before adding.");
        System.out.println("Recipe Steps after adding in the middle: " + recipeSteps);

        // Removing the first step
        recipeSteps.removeFirst();
        System.out.println("Recipe Steps after removing first element: " + recipeSteps);
    }
}
```

En este ejemplo, se elimina el primer elemento de una lista llamada recipeSteps utilizando el método `removeFirst()`, una función nativa de Java. Después de eliminar el primer elemento, se imprime la lista actualizada, mostrando los pasos restantes de la receta.

### Eliminar desde el final

Imagine que está siguiendo una receta y se da cuenta de que el último paso ya no es necesario; quizás ya lo ha completado o es innecesario. Para mantener todo en orden, se desea eliminar el último paso, dejando únicamente los pasos que aún quedan por hacer.

```java
import java.util.LinkedList;

public class Recipe {

    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        // Adding steps to the recipe
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar.");
        recipeSteps.add("Add eggs and milk.");
        // Adding a step at the beginning
        recipeSteps.addFirst("Gather all ingredients.");
        // Adding a step at the end
        recipeSteps.addLast("Serve and enjoy.");
        System.out.println("Updated Recipe Steps: " + recipeSteps);
        // Adding a step at a specific position (index 2)
        recipeSteps.add(2, "Whisk the eggs before adding.");
        System.out.println("Recipe Steps after adding in the middle: " + recipeSteps);

        // Removing the first step
        recipeSteps.removeFirst();
        System.out.println("Recipe Steps after removing first element: " + recipeSteps);

        // Removing the last step
        recipeSteps.removeLast();
        System.out.println("Recipe Steps after removing the last step: " + recipeSteps);
    }
}
```

En este ejemplo, se puede utilizar el método `removeLast()`, un método nativo de la clase `LinkedList` en Java, para eliminar el último elemento de una lista llamada `recipeSteps`. Esta función nativa de Java elimina eficientemente el paso final de la lista. Después de eliminar este paso, el código imprime la lista actualizada de `recipeSteps`, mostrando lo que queda por hacer en la receta. La salida refleja el estado actual de la lista, ahora sin el último paso.

### Eliminar un elemento de una posición intermedia

Imagine que está siguiendo una receta y se da cuenta de que un paso específico en una posición intermedia no es necesario. Quizás ya lo ha realizado, o simplemente ya no se necesita. Para que su receta siga siendo fácil de seguir, se desea eliminar ese paso en particular, dejando únicamente los pasos que aún necesita realizar.

```java
import java.util.LinkedList;

public class Recipe {

    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        // Adding steps to the recipe
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar.");
        recipeSteps.add("Add eggs and milk.");
        // Adding a step at the beginning
        recipeSteps.addFirst("Gather all ingredients.");
        // Adding a step at the end
        recipeSteps.addLast("Serve and enjoy.");
        System.out.println("Updated Recipe Steps: " + recipeSteps);
        // Adding a step at a specific position (index 2)
        recipeSteps.add(2, "Whisk the eggs before adding.");
        System.out.println("Recipe Steps after adding in the middle: " + recipeSteps);

        // Removing the first step
        recipeSteps.removeFirst();
        System.out.println("Recipe Steps after removing first element: " + recipeSteps);

        // Removing the last step
        recipeSteps.removeLast();
        System.out.println("Recipe Steps after removing the last step: " + recipeSteps);
        
        // Removing a step at a specific position (index 1)
        recipeSteps.remove(1);
        System.out.println("Recipe Steps after removing a step from the middle: " + recipeSteps);
    }
}
```

En este ejemplo, se puede utilizar el método `remove()`, un método nativo de la clase `LinkedList` en Java, para eliminar un paso en una posición específica; en este caso, el paso en el índice 1. Este método elimina eficientemente el elemento ubicado en ese índice de la lista recipeSteps.

Cuando se elimina un elemento de una `LinkedList`, los índices de los elementos restantes se desplazan. Por ejemplo, si se elimina el segundo paso (índice 1), el elemento que originalmente estaba en el índice 2 se moverá al índice 1. Tenga esto en cuenta, ya que la indexación de la lista cambia con cada eliminación.

Después de eliminar el paso, el código imprime la lista actualizada, mostrando los pasos restantes con el paso intermedio ahora eliminado.

> [!Tip]
> Recuerde:
> 
> * **`removeFirst()`** elimina el primer paso de la receta.
> * **`removeLast()`** elimina el último paso.
> * **`remove(int index)`** elimina un paso desde cualquier posición específica, ayudándole a gestionar el flujo de la receta a su conveniencia.

## Recorrido: Usando `ListIterator`

`ListIterator` de Java es una interfaz del paquete `java.util`, diseñada específicamente para recorrer implementaciones de listas, incluyendo `LinkedList`. Dado que es parte del `Java Collections Framework`, se necesita importarla por separado utilizando import `java.util.ListIterator`; al usarla en su código.

Lo que hace a `ListIterator` especialmente útil en el contexto de una lista doblemente enlazada es su capacidad para recorrer la lista hacia adelante y hacia atrás, otorgando un control completo sobre la navegación de la lista.

Veamos cómo se puede utilizar `ListIterator` para recorrer los pasos de la receta y realizar ajustes según sea necesario.

Imagine que tiene una receta escrita y desea revisar cuidadosamente los pasos. Primero, decide leer la receta de principio a fin, asegurándose de que todo esté en orden. Luego, para una doble verificación, retrocede y revisa los pasos en orden inverso, asegurándose de no haber omitido nada.

Antes de profundizar en el código, hablemos sobre `ListIterator`. Al trabajar con una `LinkedList`, `ListIterator` es una herramienta poderosa que permite recorrer la lista en direcciones tanto hacia adelante como hacia atrás. Para crear un `ListIterator`, se utiliza el método `listIterator()` sobre su lista, el cual retorna un objeto iterador.

El `ListIterator` proporciona varios métodos útiles:

* **`next()`**: Mueve el iterador al siguiente elemento en la lista y retorna ese elemento. El `ListIterator` mantiene un registro interno de su posición actual, por lo que cada llamada a `next()` lo mueve automáticamente un paso hacia adelante. Dado que cambia la posición del iterador, es esencial asegurar que un elemento 'siguiente' esté disponible.
* **`hasNext()`**: Verifica si hay un elemento adelante en la lista, permitiéndole moverse hacia adelante de forma segura. Antes de usar el método `next()`, se debe llamar a `hasNext()`. Este método retorna `true` si hay más elementos por recorrer, y `false` si se ha llegado al final de la lista.
* **`previous()`**: Mueve el iterador al elemento previo y retorna ese elemento. El `ListIterator` mantiene un registro interno de su posición actual, por lo que cada llamada a `previous(`) lo mueve automáticamente un paso hacia atrás. Dado que cambia la posición del iterador, es esencial asegurar que un elemento 'previo' esté disponible.
* **`hasPrevious()`**: Verifica si hay un elemento detrás de la posición actual, habilitando el recorrido hacia atrás. Si `hasPrevious()` retorna `true`, se puede usar de forma segura el método `previous()` para mover el iterador hacia atrás y acceder al elemento previo.

Estos métodos aseguran que no se intente mover accidentalmente más allá de los límites de la lista.

En el siguiente código, se verá cómo se utilizan estos métodos para recorrer la `LinkedList` en ambas direcciones.

```java
import java.util.LinkedList;
import java.util.ListIterator;

public class Recipe {
    public static void main(String[] args) {
        // Using ListIterator to traverse the list
        ListIterator<String> iterator = recipeSteps.listIterator();

        // Forward traversal
        System.out.println("Traversing forward through the recipe:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward traversal
        System.out.println("\nTraversing backward through the recipe:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
```

En este ejemplo, se utiliza un `ListIterator` para recorrer la lista `recipeSteps` tanto hacia adelante como hacia atrás.

* **Recorrido hacia adelante**: El iterador se utiliza primero para moverse a través de la lista desde el principio hasta el final. El método `hasNext()` verifica si hay más elementos, y `next()` recupera el siguiente paso, imprimiendo cada uno en secuencia.
* **Recorrido hacia atrás**: Después de llegar al final de la lista, el iterador la recorre en orden inverso. El método `hasPrevious()` verifica si hay elementos previos, y `previous()` recupera el paso precedente, permitiendo que el código imprima cada paso en orden inverso.

Este enfoque proporciona una forma exhaustiva de revisar todos los pasos de la receta, tanto hacia adelante como hacia atrás.

Sin embargo, el recorrido con `ListIterator` es flexible, permitiendo detenerse en cualquier punto basándose en criterios específicos. Por ejemplo, se puede detener el recorrido cuando se encuentra un paso en particular (un valor de dato), verificando el valor del elemento mediante `.next()` o `.previous()` dentro del bucle.

Los métodos `next()` y `previous()` permiten moverse hacia adelante o hacia atrás de forma incremental. Si se desea detener el recorrido basándose en una condición, como encontrar un String en particular, se puede incluir una sentencia if dentro del bucle:

```java
while (iterator.hasNext()) {
    String step = iterator.next();
    if (step.equals("Mix flour and sugar.")) {
        break;  // Stop traversal when a specific step is found
    }
}
```

El `ListIterator` proporciona más control con métodos como:
* `.nextIndex()` y `.previousIndex()` para obtener la posición actual en la lista.
* `.remove()` para eliminar elementos durante el recorrido.

Estos métodos y verificaciones permiten personalizar el recorrido, haciendo práctico el navegar solo una parte de la lista o detenerse cuando se cumple una condición.

Para familiarizarse con estos métodos en detalle, puede consultar este enlace: [ListIterator (Java SE 21 & JDK 21) (oracle.com)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ListIterator.html)

## Desafío: Gestor de tareas para actividades diarias

¡Ahora es su turno! Usted está desarrollando una funcionalidad de gestión de tareas para una aplicación de productividad donde los usuarios pueden gestionar dinámicamente sus tareas diarias. Los usuarios necesitan realizar las siguientes tareas.

### Requisitos

Complete los siguientes pasos:

1. Añadir una nueva tarea al inicio del día.
2. Añadir una tarea olvidada anteriormente en mitad del día.
3. Eliminar la última tarea del día.
4. Recuperar las tareas utilizando el mecanismo de recorrido.

La lista de tareas inicial es:

* "Revisar correos electrónicos." ("Check emails.")
* "Asistir a una reunión de equipo." ("Attend a team meeting.")
* "Completar el informe del proyecto." ("Complete project report.")

### Pasos para la implementación

* Inicializar una `LinkedList` con las tareas iniciales.
* Añadir una nueva tarea al principio de la lista.
* Insertar una tarea olvidada en alguna parte intermedia de la lista.
* Eliminar la última tarea de la lista.
* Recorrer la lista hacia adelante y hacia atrás, utilizando el `ListIterator` proporcionado por la `LinkedList` para demostrar la naturaleza doblemente enlazada.

### Codigo de inicio

```java
import java.util.LinkedList;
import java.util.ListIterator;

public class TaskManager {
    public static void main(String[] args) {
        // Step 1: Initialize the LinkedList with the initial tasks
        LinkedList<String> tasks = new LinkedList<>();
        // complete the challenge
    }
}
```

### Salida esperada

El siguiente es el resultado deseado para el desafío.

```
Initial Tasks:
Review today's schedule 
Check emails
Attend team meeting 
Complete project report
Tasks after adding in the middle:
Review today's schedule
Check emails
Prepare presentation slides
Attend team meeting
Complete project report
Tasks after removing the last task:
Review today's schedule
Check emails
Prepare presentation slides
Attend team meeting
Final task list (forward):
Review today's schedule
Check emails
Prepare presentation slides
Attend team meeting
Final task list (backward):
Attend team meeting
Prepare presentation slides
Check emails
Review today's schedule
```

## Conclusión

En esta lectura, usted ha aprendido que con la clase `LinkedList` de Java, se puede construir un sistema de gestión de recetas flexible y dinámico que permite a los usuarios añadir, eliminar o reorganizar sus pasos fácilmente. Esta clase gestiona todas las complejidades subyacentes de la administración de una lista doblemente enlazada, permitiéndole a usted centrarse en ofrecer una excelente experiencia de usuario.

Ya sea añadiendo un paso olvidado, eliminando uno innecesario o reorganizando el orden, la clase `LinkedList` hace que este proceso sea simple y eficiente.

> [!IMPORTANT]
> Este documento es una adaptación al español de la actividad **Implementing a doubly linked list** del curso **Data Structures and Algorithms** ([link](https://www.coursera.org/learn/developer-data-structures-and-algorithms?specialization=amazon-junior-software-developer)).

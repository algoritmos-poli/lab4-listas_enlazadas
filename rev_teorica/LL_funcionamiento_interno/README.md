# Listas Enlazadas – El Funcionamiento Interno

# Introducción

A menudo, las aplicaciones funcionan de manera fluida para los usuarios, con la programación subyacente oculta a su vista. Pero, ¿qué ocurre realmente cuando los programadores utilizan listas enlazadas en su código? 

En esta lectura, obtendrá una comprensión profunda del funcionamiento interno de una lista enlazada. Mediante un ejemplo práctico para ilustrar el concepto, aprenderá cómo las listas enlazadas se estructuran y se gestionan.

# Cómo Construir una Lista Enlazada: Una Lista de Espera Dinámica

Previamente, se visualizaron las listas enlazadas como un viaje en tren, donde cada estación representa un nodo enlazado al siguiente en la secuencia. Ahora, para ilustrar cómo se construyen las listas enlazadas en Java, consideremos un escenario diferente: el desarrollo de una aplicación para gestionar la lista de espera de un restaurante concurrido.

> [!Note]
> Una lista enlazada es una estructura de datos que permite almacenar una secuencia de elementos denominados nodos. Cada nodo contiene dos piezas de información esenciales: el dato en sí mismo y una referencia (o enlace) al siguiente nodo de la secuencia. Esta configuración forma una estructura similar a una cadena, donde cada nodo "sabe" cómo encontrar al que le sigue.

La lista de espera de un restaurante cambia constantemente: se pueden añadir clientes a la lista o se puede actualizar el tamaño de su grupo a medida que se unen más personas. Imagine al gerente del restaurante comenzando cada día con una lista de espera vacía, añadiendo gradualmente clientes a medida que hacen sus reservaciones. La aplicación utilizaría una lista enlazada para gestionar esta lista en constante cambio de manera eficiente.

## Definiendo el Nodo

El primer paso para construir una lista enlazada es definir la apariencia de un único nodo (node) en el programa. En este ejemplo, cada cliente en la lista de espera (*waitlist*) está representado por un nodo, y la lista enlazada mantiene el orden en que los clientes serán sentados.

```java
class Node { 
    String name; // The customer's name
    String details; // Additional details (e.g., number of people in the party)
    Node next; // Reference to the next customer in line
    // Constructor to create a new node (customer)
    Node(String name, String details) {
        this.name = name;
        this.details = details;
        this.next = null; // Initially, there's no next customer
    }
}
```

## Creando la lista enlazada

Con el bloque de construcción básico (el **nodo**) ya definido, el siguiente paso es construir la lista enlazada para gestionar la secuencia de clientes, a la cual llamaremos `waitlist` (lista de espera). La **cabeza** (`head`) de la lista sirve como punto de entrada, apuntando inicialmente a `null` cuando la lista está vacía. A medida que se añaden clientes, la cabeza apunta al primer nodo, y cada nodo subsecuente se enlaza al siguiente, formando así la lista completa.

```java
Node head; // The first customer on the waitlist
// Constructor to initialize an empty linked list
LinkedList() {
    this.head = null; // Initially, the list is empty
}
```

Inicialice el objeto `LinkedList` dentro del método `main` de la siguiente manera:

```java
LinkedList waitlist = new LinkedList();
```

### Gestionando las Listas Enlazadas: Operaciones Básicas

Para ser efectivas, las listas enlazadas deben ser gestionadas activamente. Varias operaciones fundamentales son esenciales para mantener la naturaleza dinámica de esta estructura de datos, incluyendo la adición de nuevos nodos, la eliminación de nodos existentes y la actualización de los datos dentro de los nodos.

Veamos cada operación para entender cómo podría funcionar la aplicación de la lista de espera del restaurante.

#### 1. Añadiendo al Primer Cliente

Al inicio del día, la cabeza (`head`) — el punto de partida de la lista enlazada — se establece en `null` porque no hay nada a lo que apuntar, ¡al menos no todavía!

Ahora, suponga que se añade a "Alice" como la primera cliente. En este caso, ella se convierte en la cabeza de la lista de espera. La referencia de la cabeza, que previamente era `null`, ahora apunta al nodo de Alice.

```java
// Method to add the first customer to the waitlist
void addFirstCustomer(String name, String details) {
    // The first customer becomes the head of the list
    // name = "Alice"
    head = new Node(name, details);
}
```

Dado que Alice es la única cliente en este momento, la referencia `next` (siguiente) de su nodo permanece como `null`, indicando que nadie más está esperando detrás de ella, ¡aún!

#### 2. Añadiendo Más Clientes

A medida que lleguen más clientes, deberán ser añadidos a la lista, asegurándose de que cada nueva reservación se integre con las que ya existen. Este paso es clave para mantener el orden correcto en la lista de espera, de modo que todos sean atendidos en el orden en que llegaron.

```java
// Method to add a new customer to the end of the waitlist
void addCustomer(String name, String details) {
    Node newNode = new Node(name, details);
    if (head == null) {
        // If the list is empty, the new customer becomes the head
        head = newNode;
    else {
        Node current = head;
        // Traverse to the end of the list
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; // Add the new customer at the end
    }
}
```

Ahora, ¿qué pasaría si Bob y luego Smitha llaman para reservar después de Alice? La lista enlazada debe hacerles espacio agregándolos al final de la lista existente.

```java
waitlist.addCustomer("Bob", "Party of 3");
waitlist.addCustomer("Smitha", "Party of 4");
```

> [!Important]
> Una lista enlazada permite insertar elementos en cualquier posición especificada, como al **principio** de la lista, al **final** de la lista (como se mostró anteriormente), o **después o antes** de cualquier nodo en particular. Estas operaciones se discutirán más adelante en esta lección.

La lista enlazada se actualizará para incluir las dos nuevas entradas/nodos en el orden correcto. De esta manera, "Bob" y "Smitha" son añadidos después de "Alice", manteniendo las reservaciones en el orden en que fueron realizadas.

```
Alice (Party of 2) -> Bob (Party of 3) -> Smitha (Party of 4) -> null
```

> [!Note]
> Este ejemplo demuestra una **lista enlazada simple** (singly linked list), donde cada nodo apunta únicamente al siguiente nodo en la secuencia. A diferencia de una **lista doblemente enlazada** (doubly linked list), que permite el recorrido en ambas direcciones, una lista enlazada simple es más sencilla, con nodos enlazados en una sola dirección desde la cabeza hasta el final. Esta estructura es eficiente para escenarios donde principalmente se necesita avanzar a través de la lista, como en la gestión de una cola dinámica de clientes.

#### 3. Eliminando un Cliente

Los planes cambian, así que supongamos que un cliente decide retirarse de la lista de espera. Por lo tanto, es necesario eliminarlo de dicha lista. En términos de programación, esto significa eliminar un nodo de la lista enlazada.

```java
// Method to remove a specific customer from the waitlist
void removeCustomer(String customerName) {
    if (head == null) return; // If the waitlist is empty, there's nothing to remove
    // If the customer to remove is at the head of the list
    if (head.name.equals(customerName)) {
        head = head.next; // Move the head to the next customer
        return;
    }
    Node current = head;
    while (current.next != null && !current.next.name.equals(customerName)) {
        current = current.next;
    }
    if (current.next != null) {
        current.next = current.next.next; // Bypass the node to remove the customer
    }
}
```

Suponga que la lista de espera es actualmente la siguiente:

```
Alice → Sam → Michael → Jenny → Bob → Chris → Bruce
```

El método mencionado primero verifica si la lista de espera está vacía. Si lo está, no hay nada que eliminar.

Pero en este caso, "**Alice**" está en la **cabeza** (`head`) de la lista — es la primera entrada — y quiere retirarse. Entonces, simplemente se mueve la cabeza al siguiente nodo usando `head = head.next;`, eliminando efectivamente a "**Alice**" de la lista.

Ahora, la lista actualizada es la siguiente:

```
Sam → Michael → Jenny → Bob → Chris → Bruce
```

Pero, ¿qué sucede si el cliente se encuentra más adelante en la lista, como "**Bob**"? El método entonces recorrerá la lista para encontrar a "**Bob**" usando el bucle `while`. Una vez encontrado, actualiza los punteros para "saltarse" este nodo usando `current.next = current.next.next;`. Aquí, `current` se refiere a "**Jenny**", y por lo tanto, `current.next` se refiere a "**Bob**". Entonces, la instrucción cambia la referencia "next" de "**Jenny**" y la establece en `current.next` (**Bob**) `.next` (**Chris**).

```
current.next = current.next.next;

 ↓                      ↓     ↓

(Jenny)                (Bob) (Chris)
```

```java
waitlist.removeCustomer("Bob");
```

La lista de espera actualizada (resultado) mostrará que Bob ha sido eliminado, y que ahora solo "**Alice**" y "**Smitha**" permanecen en orden.

```
Alice (Party of 2) -> Smitha (Party of 4) -> null
```

#### 4. Actualizando los Detalles de un Cliente


El restaurante también permite a sus clientes actualizar sus reservaciones. Por ejemplo, suponga que "**Smitha**" hizo originalmente una reservación para dos personas, pero ahora quiere actualizarla a cuatro. En términos de la lista enlazada, esto equivale a actualizar los datos dentro de un nodo.

```java
// Method to update a customer's details
void updateCustomer(String customerName, String newDetails) {
    Node current = head;
    while (current != null) {
        if (current.name.equals(customerName)) {
            current.details = newDetails; // Update the customer’s details
            return;
        }
        current = current.next;
    }
}
```

> [!Note]
> El método `updateCustomer` recorre la lista para encontrar el nodo que contiene el nombre del cliente. Una vez que encuentra al cliente correcto, el método actualiza el campo de detalles en ese nodo con la nueva información.

Ahora, procedamos a actualizar la reservación de Smitha con sus nuevos detalles:

```java
waitlist.updateCustomer("Smitha", "Reservation for 4");
```

Ahora, el nodo de "**Smitha**" en la lista enlazada refleja la reservación actualizada. ¡Perfecto!

```
Alice (Party of 2) -> Smitha (Reservation for 4) -> null
```

## Desafío: Gestionando Reservaciones VIP

¡Ahora es tu turno! El restaurante ha introducido un servicio VIP mediante el cual ciertos clientes reciben prioridad. Tu desafío es modificar la lista enlazada para que los clientes VIP sean añadidos al **principio de la lista**, mientras que los clientes regulares continúen siendo añadidos al final.

Así es como están configuradas las clases:

**Clase `Main`**: Gestiona la lista de espera del restaurante añadiendo tanto clientes regulares como VIP. Los clientes regulares se añaden al final de la lista, mientras que los clientes VIP deben ser añadidos al principio. El método `printList` se utiliza para mostrar el orden final de la lista de espera (`waitlist`).

* **Clase `LinkedList` (incompleta)**: Maneja las operaciones para añadir y gestionar clientes en la lista de espera. La clase contiene métodos para añadir clientes regulares al final de la lista (`addCustomer`) y clientes VIP al principio (`addVIPCustomer`).

### Requisitos

1. Crear un nuevo **nodo** para representar al cliente VIP.
2. Apuntar este nuevo nodo a la **cabeza** (`head`) actual de la lista, enlazándolo así a la lista existente.
3. Actualizar la cabeza al nuevo nodo, estableciéndolo como la nueva cabeza de la lista, lo que efectivamente coloca al cliente VIP al principio de la misma. A continuación, se presenta el inicio de este método.
   
   ```java
   // Method to add a VIP customer at the beginning of the list
   void addVIPCustomer(String name, String details) {
      //Step 1: Create the new node the head
        
      //Step 2: Point it to the current head of the list.
        
     // Step 3: Update the Head to the New Node
        
   }
   ```

#### Punto de Reflexión

A continuación, se muestra la salida (output) deseada para el desafío.

```
VIP Dave (Party of 4) -> VIP Charlie (Party of 1) -> Alice (Party of 2) -> Bob (Party of 3) -> Eve (Party of 2) -> null
```

> [!Tip]
> **Consejos para la Solución de Problemas**
> 
> Si no obtuvo la salida deseada, considere los siguientes pasos para solucionar problemas en su código:
> 1. **Revise la lógica de adición de nodos**: Asegúrese de que la lógica para añadir clientes VIP esté correctamente implementada. El nuevo nodo VIP debe ser enlazado a la cabeza actual de la lista, y la cabeza debe entonces ser actualizada a este nuevo nodo.
> 2. **Verifique el orden de las operaciones**: Verifique que los clientes regulares sigan siendo añadidos al final de la lista y que las referencias `next` estén correctamente actualizadas sin sobrescribir enlaces previos. Asegúrese de que el orden de inserción se mantenga según lo previsto.
> 3. **Confirme la actualización del nodo cabeza**: Asegúrese de que la cabeza de la lista sea correctamente actualizada cuando se añade un cliente VIP. Si la cabeza no es actualizada apropiadamente, el nuevo nodo VIP no aparecerá al principio de la lista.

Tómese un momento para reflexionar sobre el desafío que acaba de completar, considerando estas preguntas:
* ¿En qué áreas tuve dificultades y por qué?
* ¿Cómo solucioné los errores (si los hubo)?
* ¿Qué lecciones aplicaré en el futuro?

Revise el siguiente [link](src/) para revisar la solución después de que haya intentado el desafío.

## Conclusión

En esta lectura, ha explorado cómo una **lista enlazada** (***linked list***) sirve como una estructura de datos flexible y potente, ideal para gestionar listas dinámicas como la de espera de un restaurante. Al comprender e implementar las operaciones principales — añadir, eliminar y actualizar nodos —, ha visto cómo las listas enlazadas gestionan eficientemente secuencias en constante cambio.

Ya sea que esté gestionando tareas, organizando contactos o tratando con cualquier conjunto de datos en evolución, las listas enlazadas ofrecen una solución robusta para mantener todo en orden sin la necesidad de una reorganización constante.

> [!IMPORTANT]
> Este ejemplo es una adaptación al español de la actividad **Linked list – behind the scenes** del curso **Data Structures and Algorithms** ([link](https://www.coursera.org/learn/developer-data-structures-and-algorithms?specialization=amazon-junior-software-developer)).

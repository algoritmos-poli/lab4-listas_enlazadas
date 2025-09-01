# Solución: Implementación de una Lista Enlazada

## Pasos para Implementar la Solución:

**Paso 1: Declarar e Inicializar la `LinkedList`**

Primero, cree una `LinkedList` para almacenar los artículos de la compra. Esto se hace declarando e inicializando un objeto `LinkedList<String>` llamado `groceryList`.

```java
LinkedList<String> groceryList = new LinkedList<>();
```

**Paso 2: Añadir los Artículos Iniciales a la Lista**

Añada cinco artículos a la lista utilizando el método `add()`. Estos artículos incluyen "Milk," "Bread," "Eggs," "Butter," y "Tomatoes."

**Paso 3: Actualizar el Segundo Artículo**

A continuación, se da cuenta de que "Bread" debe ser actualizado a "Whole Wheat Bread". Utilice el método `set()` para actualizar el segundo artículo de la lista (índice `1`).

**Paso 4: Eliminar un Artículo (Butter)**

Después de revisar la lista, decide que "Butter" ya no es necesario. Utilice el método `remove()` para eliminar "Butter" de la lista.

**Paso 5: Añadir Otro Artículo (Cheese)**

Recuerda que necesita comprar "Cheese". Usando el método `add()` nuevamente, añada "Cheese" a la lista.

**Paso 6: Imprimir la Lista Final**

Finalmente, imprima la lista completa para verificar que todos los cambios se han realizado correctamente. Esto asegura que la lista de compras final sea precisa y esté completa.


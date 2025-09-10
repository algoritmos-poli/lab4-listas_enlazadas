# Laboratorio 4 - Estructuras de datos

## Introducción

La gestión eficiente de la información de los estudiantes y sus calendarios de exámenes es crucial para las instituciones educativas, sin importar su tamaño. La aplicación **Gestor de Exámenes de Estudiantes** está diseñada para simplificar este proceso, ofreciendo una forma intuitiva y amigable para gestionar los datos de los estudiantes y sus calendarios de exámenes asociados.

El sistema se enfoca en funcionalidades clave tales como agregar estudiantes, registrar sus exámenes y navegar por sus calendarios de exámenes. Esta aplicación es particularmente útil en entornos educativos más pequeños donde podrían no existir sistemas automatizados.

## Objetivo

> Crear un programa que gestione la información de los estudiantes implementando las siguientes funcionalidades:
> * Permitir a los usuarios agregar nuevos estudiantes y asociarlos con sus respectivos calendarios de exámenes.
> * Habilitar a los usuarios para agregar exámenes al calendario de un estudiante, especificando detalles como fecha y lugar.
> * Proporcionar la capacidad de ver, navegar y gestionar la secuencia de exámenes en el calendario de un estudiante, incluyendo la visualización de los exámenes siguiente y anterior.

## Requisitos

* Utilizar `ArrayLists` para gestionar la cantidad de estudiantes.
* Implementar `LinkedList` para gestionar y navegar a través de los calendarios de exámenes de los estudiantes.
* Proporcionar retroalimentación y salidas de prueba en cada paso.

Se le proporciona el siguiente código de inicio:
* **Clase `Main`**: Esta clase maneja la entrada del usuario y contiene el código para cada opción: agregar, siguiente y anterior. Es responsable de gestionar cómo los usuarios interactúan con el sistema. La funcionalidad para ver el calendario de exámenes completo ya ha sido implementada.
* **Clase `ExamSchedule`**: Esta clase incluye todos los métodos requeridos para implementar la funcionalidad relacionada con el calendario de exámenes, tales como ver el siguiente, el anterior y el calendario completo (`AllExamSchedule`).
* **Clase `Student`**: Esta clase contiene los detalles de cada estudiante, como el nombre, e incluye un objeto de lista enlazada (`linked list`) para el calendario de exámenes, el cual es gestionado por la clase `ExamSchedule`.

## Tarea 1: Agregar nuevo estudiante

Imagine que un nuevo estudiante, ansioso por comenzar su trayectoria académica, entra a la oficina de administración. Es necesario agregarlo al sistema, con todos sus detalles meticulosamente registrados. Su primera tarea es asegurar que el sistema pueda manejar el ingreso de nuevos estudiantes sin inconvenientes.

Usted comenzará guiando al sistema para agregar a este nuevo estudiante. Primero, solicite al usuario que ingrese el nombre del estudiante. A continuación, cree un nuevo objeto `Student` utilizando el nombre ingresado. Una vez que el objeto del estudiante sea creado, debe ser añadido a la lista de estudiantes del sistema. Finalmente, confirme que se ha agregado exitosamente mostrando un mensaje al usuario, asegurando que el proceso sea claro y completo.

### 🖥️ ¡Es hora de programar!

- [ ] **TODO 1**: Implementar un método para agregar un nuevo estudiante al `ArrayList`.

  **Pasos para la implementación**:

  * Crear un nuevo objeto `Student` utilizando el nombre ingresado.
  * Añadir el objeto `Student` recién creado a la lista de estudiantes.
  
  Mostrar un mensaje de confirmación al usuario indicando que el estudiante ha sido agregado exitosamente.

  ```java
  class StudentInfoSystem {
     static boolean addStudent(Student student) {
        // TODO 1: Implement a method to add a new student to the ArrayList
        System.out.println("Student added: " + student.getName());
        return true;
     }
  }  
  ```

  Ahora que ha implementado la adición de los detalles de un nuevo estudiante, ejecute su código en su IDE. ¿Obtuvo la siguiente salida esperada?

  **Salida esperada**

  ```
  Options:
  1. Add Student
  2. Add Exam
  3. View Next Exam
  4. View Previous Exam
  5. View Student Schedule
  6. Exit
  Enter your choice:
  1
  Enter student name:
  Alice
  Student added: Alice
  ```
  
> [!Note]
> Consulte el material de clase sobre `ArrayList` si necesita refrescar sus conocimientos.

## Tarea 2: Agregar el calendario de exámenes para un estudiante

Imagine que un estudiante que acaba de inscribir sus cursos ahora necesita organizar su calendario de exámenes. Su siguiente tarea es asegurar que el calendario de exámenes de cada estudiante se agregue con precisión al sistema.

Usted comenzará seleccionando al estudiante al que desea agregar el calendario de exámenes. Una vez seleccionado el estudiante, usted ingresará los detalles de sus exámenes, incluyendo las fechas, horas y asignaturas. Después de ingresar esta información, el sistema almacenará de forma segura el calendario de exámenes, permitiendo a los estudiantes ver y gestionar fácilmente sus próximos exámenes. Su tarea es garantizar que este proceso sea fluido y eficiente, asegurando que cada examen se registre sin errores.  

### 🖥️ ¡Es hora de programar!

- [ ] **TODO 2**: Implementar la lógica para agregar un examen al final de la lista enlazada.

  **Instrucciones para la implementación**:

  * Cree un nuevo objeto `ExamNode` y verifique si la cabeza (`head`) está vacía. Si es así, asigne el nuevo nodo tanto a la cabeza como al nodo actual.
  * De lo contrario, recorra la lista enlazada para encontrar el último nodo.
  * Avance al siguiente nodo hasta encontrar el último.
  * Enlace la referencia `next` del último nodo al nuevo nodo.
  * Enlace la referencia `previous` del nuevo nodo al último nodo.
  
  ```java
  public class ExamSchedule{
     public void addExam(String examDetails) {
        // TODO 2: Implement logic to add an exam to the end of the linked list
     }
  }
  ```
  
  Ahora que ha implementado la lógica para agregar un examen al calendario, ejecute su código en su IDE. Revise la salida. ¿Obtuvo los resultados esperados?

  **Salida esperada**
  
  ```
  Options:
  1. Add Student
  2. Add Exam
  3. View Next Exam
  4. View Previous Exam
  5. View Student Schedule
  6. Exit
  Enter your choice:
  2
  Enter student name:
  Alice
  Enter exam date (e.g., 2023-10-15):
  2024-12-12
  Enter exam location (e.g., Room 101):
  Room 122
  Exam added: 2024-12-12 - Room 122
  ```

## Tarea 3: Navegar al siguiente examen del calendario

Imagine un escenario en el que un estudiante desea conocer la información de su próximo examen. El estudiante se acerca al mostrador de administración y usted necesita proporcionarle los detalles de forma rápida y precisa. Su tarea es navegar al siguiente examen en su calendario.

Para ver el siguiente examen en el calendario de un estudiante, se utiliza el método `viewNextExam` de la clase `ExamSchedule`. Este método permite a los usuarios navegar a través de los exámenes listados en el calendario de un estudiante, un examen a la vez.

### 🖥️ ¡Es hora de programar!

- [ ] **TODO 3**: Implementar la lógica para avanzar al siguiente examen en la lista y mostrarlo.

  **Instrucciones para la implementación**:

  * Verifique si la referencia `current` es `null` (no hay exámenes disponibles).
  * Imprima los detalles del examen actual.
  * Mueva el puntero `current` al siguiente examen, si está disponible.
  * Si no hay un siguiente examen, imprima un mensaje que indique el final de la lista.
  
  ```java
  public void viewNextExam() {
     if (current == null) {
        System.out.println("No exams available.");
     } 
     else {
        // TODO 3: Implement the logic to move to the next exam in the list and displays it
     }
  }
  ```
  
  Ahora que ha implementado la lógica para navegar al siguiente examen en el calendario, ejecute su código en su IDE. Revise la salida. ¿Obtuvo los resultados esperados?

  **Salida esperada**

  ```
  Options:
  1. Add Student
  2. Add Exam
  3. View Next Exam
  4. View Previous Exam
  5. View Student Schedule
  6. Exit
  Enter your choice:
  3
  Enter student name:
  Alice
  Next Exam: 2024-12-12 - Room 122

  Options:
  1. Add Student
  2. Add Exam
  3. View Next Exam
  4. View Previous Exam
  5. View Student Schedule
  6. Exit
  Enter your choice:
  3
  Enter student name:
  Alice
  Next Exam: 2024-12-16 - Room 123
  You have reached the last exam.
  ```

## Tarea 4: Navegar a un examen anterior del calendario

Un estudiante está revisando su desempeño pasado y necesita consultar sus exámenes anteriores. Su tarea es navegar al examen anterior en su calendario. Esto asegura que los datos históricos puedan ser accedidos y revisados fácilmente.

Para ver el examen anterior en el calendario de un estudiante, se utiliza el método `viewPreviousExam` de la clase `ExamSchedule`. Este método permite a los usuarios retroceder a través de la lista de exámenes en el calendario de un estudiante, examinando un examen a la vez.

### 🖥️ ¡Es hora de programar!

- [ ] **TODO 4**: Implementar la lógica para retroceder al examen anterior en la lista y mostrarlo.

  **Instrucciones para la implementación**:
  
  * Verifique si la referencia current es nula (no hay exámenes disponibles).
  * Imprima los detalles del examen actual.
  * Mueva el puntero current al examen anterior, si está disponible.
  * Si no hay un examen anterior, imprima un mensaje que indique el inicio de la lista.


  ```java
  public void viewPreviousExam() {
     if (current == null) {
        System.out.println("No exams available.");
     } 
     else {
        // TODO 4: Implement logic to move to the previous exam in the list and display it
     }
  }
  ```
  
  ¡Excelente! Ahora, implemente la lógica en el método previousExam de la clase ExamSchedule. ¿Obtuvo la siguiente salida esperada?

  **Salida esperada**

  ```
  Options:
  1. Add Student
  2. Add Exam
  3. View Next Exam
  4. View Previous Exam
  5. View Student Schedule
  6. Exit
  Enter your choice:
  4
  Enter student name:
  Alice
  Previous Exam: 2024-12-12 - Room 122
  ```

> [!Note]
> Si lo ve necesario, consulte la Lección sobre listas enlazadas para refrescar sus conocimientos.

## Tarea 5: Probar y confirmar la funcionalidad del proyecto

La institución educativa está a punto de realizar una auditoría importante de sus registros estudiantiles. Necesitan asegurarse de que todas las funcionalidades (agregar, ver y navegar) funcionen perfectamente para evitar discrepancias durante la auditoría.

Su tarea es compilar, ejecutar y probar exhaustivamente todo el sistema de información estudiantil. Asegúrese de que todas las características sean operacionales y produzcan los resultados esperados.
1. **Compile el código**: Asegúrese de que su programa compile sin errores. Este es el primer paso para verificar que su sintaxis y lógica básica son correctas.
2. **Ejecute el programa**: Inicie la aplicación e interactúe con ella a través de la interfaz de usuario. Lea atentamente el menú y las indicaciones de entrada de datos antes de ingresar información.
3. **Pruebe las funcionalidades**: Agregar, ver examen, y navegar al siguiente y al anterior. Asegúrese de que todas las acciones funcionen correctamente.
4. **Verifique la salida**: Compare todas las salidas con los resultados esperados proporcionados en cada tarea.

La salida final variará según las entradas del usuario; sin embargo, debe ser muy similar a la salida de ejemplo proporcionada.

**Salida final esperada**:

```
Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice:
1
Enter student name:
Alice
Student added: Alice

Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice:
2
Enter student name:
Alice
Enter exam date (e.g., 2023-10-15):
2024-12-12
Enter exam location (e.g., Room 101):
Room 122
Exam added: 2024-12-12 - Room 122

Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice:
2
Enter student name:
Alice
Enter exam date (e.g., 2023-10-15):
2024-12-16
Enter exam location (e.g., Room 101):
Room 123
Exam added: 2024-12-16 - Room 123

Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice:
3
Enter student name:
Alice
Next Exam: 2024-12-12 - Room 122

Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice:
3
Enter student name:
Alice
Next Exam: 2024-12-16 - Room 123
You have reached the last exam.

Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice:
3
Enter student name:
Alice
Next Exam: 2024-12-16 - Room 123
You have reached the last exam.

Options:
1. Add Student
2. Add Exam
3. View Next Exam
4. View Previous Exam
5. View Student Schedule
6. Exit
Enter your choice:
4
Enter student name:
Alice
Previous Exam: 2024-12-12 - Room 122
```

## Entrega y sustentación del laboratorio

Una vez que haya probado y confirmado la funcionalidad de su proyecto, si está satisfecho con sus resultados, ¡ya puede entregar su tarea para recibir calificación y retroalimentación! 

Para entregar su tarea, agregue cada uno de los archivos fuentes con la solución codificada de acuerdo a las instrucciones indicadas en el laboratorio.

## Conclusión

A través de este laboratorio, usted ha desarrollado habilidades esenciales en la gestión y manipulación de registros estudiantiles, la navegación a través de estructuras de datos y la implementación de funcionalidades críticas como ver y navegar por calendarios de exámenes. Estas tareas son vitales para garantizar la precisión y eficiencia de los procesos administrativos de una institución educativa.

En aplicaciones del mundo real, sistemas como el que ha construido son parte integral de instituciones educativas, empresas y otras organizaciones que necesitan gestionar y mantener registros precisos. La capacidad de agregar y navegar es crucial para mantener la integridad de los datos y proporcionar un acceso fiable a la información.

> [!IMPORTANT]
> Este laboratorio es una adaptación al español de la practica **Graded Lab: Data Structures** del curso **Data Structures and Algorithms** ([link](https://www.coursera.org/learn/developer-data-structures-and-algorithms?specialization=amazon-junior-software-developer)).
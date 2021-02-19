# Java Orientado a Objetos

## Notas Java Orientado a Objetos

Los **paradigmas de programación** son una teoría que nos suministra una base y modelo estandarizado para resolver problemas con nuestro código.

La **Programación Orientada a Objetos** (POO) nos ayuda a analizar y entender todos estos problemas para resolverlos de la forma más sostenible en el futuro. Java surgió con este paradigma y es uno de los lenguajes que define en gran manera el rumbo que sigue la POO.

Este paradigma se compone de 4 elementos (que analizaremos a fondo más adelante):

- Clases
- Propiedades
- Métodos
- Objetos

Además, se basa en los siguientes 4 pilares:

- Encapsulamiento
- Abstracción
- Herencia
- Polimorfismo

### ¿Qué es un Objeto?

Los **Objetos** son todas las cosas físicas o conceptuales que tienen propiedades y comportamientos. Por ejemplo: usuario, sesión, auto, etc.

Las **Propiedades** o atributos son las características de nuestros objetos. Estos atributos siempre serán sustantivos y pueden tener diferentes valores que harán referencia a nombres, tamaños, formas y estados.

Por ejemplo: el color del auto es verde o rojo (`color` es el atributo, `verde` y `rojo` son posibles valores para este atributo).

Los **Comportamientos** o métodos serán todas las operaciones de nuestros objetos que solemos llamar usando verbos o sustantivos y verbos. Por ejemplo: los métodos del objeto sesión pueden ser `login()`, `logout()`, `makeReport()`, etc.

### Abstracción: ¿Qué es una Clase?

La **Abstracción** se trata de analizar objetos de forma independiente, sus propiedades, características y comportamientos, para *abstraer* su composición y generar un modelo, lo que traducimos a código como clases.

Las **Clases** son los modelos sobre los cuales construimos nuestros objetos, es decir, las clases son los “moldes” que nos permiten generar objetos. Cada clase debe tener identidad (con un nombre de clase único usando Upper Camel Case), estado (con sus atributos) y comportamiento (con sus métodos y operaciones).

Por ejemplo:

```text
El ejemplo de clase más típico en Internet:

Nombre de la clase: Person
Atributos: Name, Age
Operaciones: Walk()
```

#### DIAGRAMA DE CLASES

Para entender qué es un diagrama de clases, lo primero que se debe tener claro es **qué es una clase**, pues bien, una clase es un elemento importante dentro del contexto de un sistema, que puede tener información o datos valiosos y realizar acciones que sean necesarias dentro del funcionamiento del sistema.

**Por ejemplo**, en un software para un supermercado, seguramente los elementos más importantes sobre los cuales sea significativo mantener información son los productos, los clientes, las ventas y los pedidos, en este caso se han encontrado las clases **PRODUCTO, CLIENTE, VENTA y
PEDIDO.**

Estas clases a su vez tienen **atributos** (datos) y **métodos** (funciones), por ejemplo, la clase **PRODUCTO** tiene como uno de sus atributos, el atributo *precio* y uno de sus métodos puede ser *incrementarPrecio*. De esta forma, a través de los atributos se puede acceder a la información de la clase y a través de los métodos se pueden ejecutar acciones sobre la clase. Estas clases se unen a otras clases a través de relaciones y así se conforma el diagrama de clases.

Toda clases se compone de **3 elementos importantes** así: **Nombre de la clase**, **Atributos** o propiedades también denominados miembros de la clase y los **métodos (operaciones)** o
acciones propias de la clase. *(Estas acciones se identifican con verbos en infinitivo)*.

![diagrama de clases](img/EjemploDeClases.jpg)

**Atributos**:

Los atributos o características de una Clase pueden ser de tres tipos, definen la visibilidad:

- **Public (+)** : Indica que el atributo será visible tanto dentro como fuera de la clase, es decir, es accesible desde todos lados.
- **Private (-)** : Indica que el atributo sólo será accesible desde dentro de la clase (sólo sus métodos lo pueden acceder).
- **Protected (#)** : Indica que el atributo no será accesible desde fuera de la clase, pero si podrá ser accedido por métodos de la clase además de las subclases que se deriven (herencia).
- **Sin modificador de acceso ( )** : Indica que el atributo será accesible desde cualquier clase que se encuentre en el mismo paquete de la clase que contiene al atributo sin modificador de acceso.

**Métodos**:

Los métodos u operaciones de una clase son la forma en cómo ésta interactúa con su entorno, éstos pueden tener las características:

- **Public (+)** : Indica que el método será visible tanto dentro como fuera de la clase, es decir, es accesible desde todos lados.
- **Private (-)** : Indica que el método sólo será accesible desde dentro de la clase (sólo otros métodos de la clase lo pueden acceder).
- **Protected (#)** : Indica que el método no será accesible desde fuera de la clase, pero si podrá ser accedido por métodos de la clase además de métodos de las subclases que se deriven (herencia).
- **Sin modificador de acceso ( )** : Indica que el método será
accesible desde cualquier clase que se encuentre en el mismo
paquete de la clase que contiene al método sin modificador de
acceso.

### Modularidad

La **Modularidad** consiste en dividir nuestro programa en diferentes módulos de forma que puedan unirse o separarse sin romperse entre ellos o perder alguna funcionalidad.

La Modularidad en Programación Orientada a Objetos nos ayuda a:

- Reutilizar código.
- Evitar colapsos.
- Que nuestro código sea mantenible.
- Mejorar la legibilidad.
- Resolución rápida de problemas.

![modularidad](img/modularidad.jpg)

### Creando nuestra primera Clase

Nuestro proyecto es construir un sistema que nos permita listar y agendar nuestras citas médicas, por lo que debemos crear algunas clases para cada integrante del sistema: doctores, pacientes, entre otras.

Así vamos a crear nuestra primer clase con sus métodos y atributos:

```Java
// Clases:
public class Doctor {
  // Atributos:
  int id;
  String name;
  String speciality;

  // Comportamientos (métodos):
  public void showName() {
    // Instrucciones...
  }
}
```

Declarar un Objeto:

```Java
// Tipo de Objeto ---- Nombre del Objeto
Doctor myDoctor;

// Otro objeto del mismo tipo Doctor:
Doctor anotherDoctor;

```

Instanciar un Objeto:

```java
// Nombre del Objeto ---- Clase base para crear algún tipo de objetos
myDoctor = new Doctor();

// Otro objeto
anotherDoctor = new Doctor();

```

Declarar e instanciar un objeto en la misma línea:

```java
// Declarar el objeto ---- Instanciar el objeto
Doctor myDoctor = new Doctor();
```

Utilizar el objeto:

```java
// Declarar el objeto ---- Instanciar el objeto
Doctor myDoctor = new Doctor();
myDoctor.name = "Diego";
myDoctor.showName();
```

### Método constructor

El **Método Constructor** es el primer método que se ejecuta por defecto cuando creamos una clase, nos permite crear nuevas instancias de una clase. Lo invocamos con la palabra reservada new seguida del nombre con el que inicializamos la clase y paréntesis.

El método constructor:

- **Crea** nuevas **instancias** de una clase.
- Tiene el **mismo nombre** que la clase que inicializa.
- Usa la palabra reservada **new** para invocarlo.

Usa **cero o más argumentos** contenidos dentro de los paréntesis que siguen al nombre.

```java
// nombreDeLaInstancia = new MétodoConstructor();
myDoctor = new Doctor();
```

El compilador de Java crea un método constructor en caso de que no definamos uno, pero de todas formas es muy buena idea programarlo nosotros, ya que nos permite definir y/o configurar el comportamiento de nuestros objetos usando argumentos.

```java
public class Doctor {
  // Atributos...

  // Método Constructor:
  Doctor(/* parámetros */) {
    // Instrucciones que se ejecutan al crear/instanciar
    // un nuevo objeto con la clase Doctor...
  }
}
```

El método constructor no debe regresar ningún valor (no necesitamos un return). Más adelante estudiaremos un poco más a fondo cómo funcionan la sobrecarga de métodos y sobrecarga de constructores.

Cuando es por **valor**, la información de la variable se **almacena** en una **dirección de memoria diferente al recibirla en la función**, por lo tanto si el valor de esa variable **cambia** !no!! afecta la variable original, solo se modifica dentro del contexto de la función.

Cuando es por **referencia**, la variable que se recibe como parámetro en la función apunta exactamente a la **misma dirección de memoria** que la variable original por lo que si dentro de la función se modifica su valor también se modifica la variable original.

![pass by reference -  value](img/passbyreference-value.gif)

### Static: Variables y Métodos Estáticos

Los métodos y variables estáticos nos ayudan a ejecutar o conseguir algún código desde clases no han sido instanciadas, ya que sus valores se guardan en la memoria de nuestro programa, no en diferentes objetos instanciados a través de una clase.

Los métodos estáticos:

- Se pueden usar en toda la clase.
- Está definido por la palabra reservada **static**.
- Pueden ser **accesados indicando el nombre de la clase**, la notación punto y el nombre del método.
- Se invoca en una clase que **no tiene instancias de la clase**.

Las variables estáticas mantienen su valor durante todo el ciclo de vida de nuestro programa, por lo tanto, podemos alterar los valores de una variable estática desde una clase y consumir su valor alterado desde otra sin necesidad de conectar ambas clases.

También podemos importar los métodos estáticos de una clase para usarlos sin necesidad de escribir el nombre de la clase:

```java
public class Calculadora {
  public static int suma(int a, int b) {
    return a + b;
  }
}
```

```java
import static java.lang.Math.*

public class Principal {
  public static void (String[] args) {
    int number = suma(3, 5);
    System.out.println(number + PI);
  }
}
```

### Creando elementos estáticos

En muchos casos nuestro código necesita ejecutar métodos que no necesariamente deben pertenecer a un objeto o instancia en concreto, ya que pueden ser muy generales (así como `Math.Random`) o los valores que almacenamos deben ser los mismos, sin importar si los consumimos desde una o más clases.

En todos estos casos vale la pena usar variables y métodos estáticos.

### Final: Variables Constantes

Para declarar una constante en java podemos utilizar la palabra reservada **final**. Casi siempre esta palabra
reservada va a estar de la mano con **static**, no es una regla, pero suele ser así.

En el código se vería así:

```java
public class Calculadora {
    public static final double PI = 3.1415926;
}
```

**Final** hace a esa variable constante, lo que significa que esa variable no podrá ser resignada nunca.

### Variable vs. Objeto: Un vistazo a la memoria

Otra diferencia entre las variables y los objetos es su situación en memoria, en donde viven las variables primitivas y en donde viven los objetos:

```java
int 1 = 0;
Doctor myDoctor = new Doctor();
Doctor myDoctor2 = new Doctor();
```

Normalmente cuando reasignamos el valor de 'i' a otra variable sabemos que automáticamente 'i' va a poseer el valor de esa nueva variable que ahora esta tomando, pero en el caso de los objetos es totalmente distinto, esto es por la ubicación que tiene cada elemento.

![heap and stack](img/heapAndStack.png)

**Un objeto es una referencia a un espacio en memoria**. Cuando creamos objetos, Java los guarda en la memoria y nos devuelve coordenadas con las que podremos acceder a la información que almacenamos.

Existen dos tipos de memoria: **Stack** y **Heap**.

La memoria **Stack** es mucho más rápida y nos permite almacenar nuestra información de forma “ordenada”. Aquí se guardan las variables y sus valores de tipos de datos primitivos (booleanos, números, strings, entre otros).

Los objetos también usan la memoria Stack, pero no para guardar su información, sino para guardar las coordenadas a la verdadera ubicación del objeto en la memoria **Heap**, una memoria que nos permite guardar grandes cantidades de información, pero con un poco menos de velocidad.

### Sobrecarga de métodos y constructores

A veces necesitamos que dos o más métodos de una misma clase tengan el mismo nombre, pero con diferentes argumentos o distintos tipos de argumentos/valores de retorno.

Afortunadamente, Java nos permite ejecutar código y métodos diferentes dependiendo de los argumentos que reciba nuestra clase.

```java
public class Calculadora {
  // Los dos parámetros y el valor de retorno son de tipo int
  public int suma(int a, int b) {
    return a + b;
  }

  // Los dos parámetros y el valor de retorno son de tipo float
  public float suma(float a, float b) {
    return a + b;
  }

  // Un parámetro es de tipo int, mientras que el otro parámetro
  // y el valor de retorno son de tipo float
  public float suma(int a, float b) {
    return a + b;
  }
}
```

El uso más común de la sobrecarga de métodos es la sobrecarga de constructores para instanciar objetos de formas distintas dependiendo de la cantidad de argumentos que enviamos.

```java
public class Doctor {
  static int id = 0;
  String name;
  String speciality;

  public Doctor() {
    this.name = "Nombre por defecto";
    this.speciality = "Especialidad por defecto";
  }

  public Doctor(String name, String speciality) {
    this.name = name;
    this.speciality = speciality;
  }
} 
```

### Encapsulamiento: Modificadores de acceso

Los **Modificadores de Acceso** nos ayudan a limitar desde dónde podemos leer o modificar atributos especiales de nuestras clases. Podemos definir qué variables se pueden leer/editar por fuera de las clases donde fueron creadas. Esto lo conocemos como **Encapsulamiento**.

![encapsulamiento](img/encapsulamiento.jpg)

![modificadores de acceso](img/modificadoresAcceso.jpg)

### Getters y Setters

Los **Getters** y **Setters** nos permiten leer y escribir (respectivamente) los valores de nuestras variables privadas desde fuera de la clase donde fueron creadas. Con los Getters obtenemos los datos de las variables y con los Setters asignamos o cambiamos su valor.

![getters and setters](img/gettersAndSetters.png)

También puedes usar los atajos de tu IDE favorito para generar los métodos getters y setters de todas o algunas de tus variables.

```java
public class Patient {
  private String name;

  public String getName() {
    return "Patient name is " + this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}
```

### Variable vs. Objeto

Las **Variables** son entidades elementales muy sencillas, pueden ser números, caracteres, booleanos, entre otras. Los **Objetos** son entidades complejas que pueden estar formadas por la agrupación de diferentes variables y métodos.

Los **Objetos Primitivos** o **Clases Wrapper** son variables primitivas que trabajan con algún tipo de dato y también tienen las características de los objetos.

Por ejemplo: `Byte, Short, Integer, Long, Float, Double, Character, Boolean o String`.

### Clases Anidadas

Las **Clases Anidadas** o **Clases Helper** son clases dentro de otras clases que agrupamos por su lógica y/o características en común.

![clases anidadas](img/clasesAnidadas.png)

Podemos encontrar clases estáticas anidadas, clases internas que son locales a un método o clases internas anónimas. Las clases anidadas pueden llamar a cualquier tipo de elemento o método de nuestras clases.

Las **Clases Estáticas** no necesitan ser instanciadas para poder ser llamadas y ejecutadas, aunque debes recordar que solo permiten llamar a los métodos estáticos de sus clases padre.

![clases anidadas 1](img/clasesAnidadas1.png)

```java
public class Enclosing {
  private static int x = 1;

  public static class StaticNested {
    private void run() {
      //Implementation
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Enclosing.StaticNested nested = new Enclosing.StaticNested();
    nested.run();
  }
}
```

### Clases Internas y Locales a un método

![clases internas](img/clasesInternas.png)

Se pueden encontrar como clases anidadas no estáticas

#### Clases Internas

```java
public class Outer {
  public class Inner {

  }
}

public class Main {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
  }
}
```

Necesitamos crear dos objetos para tener acceso hasta la clase Inner, pero con las clases anidadas estáticas no es necesario esto.

Este tipo de clases (no estáticas) no son tan comunes.

#### Clases Locales a un Método

```java
public class Enclosing {
  void run() {
    class Local {
      void run() {

      }
    }

    Local local = new Local();
    local.run();
  }
}

public class Main {
  public static void main(String[] args) {
    Enclosing enclosing = new Enclosing();
    enclosing.run();
  }
}
```

La principal diferencia entre las clases locales a un método y las clases inner comunes es el scope que en este caso el scope de esta clase esta definido para el método run().

Esto puede ser un desperdicio de memoria ya que se están creando un objeto dentro de un método  y para llamar a ese método hay que crear otro objeto.

Es por eso que la mejor opción es utilizar las clases estáticas, porque estas clases van a ser mucho mas eficientes en términos de uso de memoria y cumplen la misma función.

**En resumen es mucho mejor y mas recomendable usar solamente las Clases Estáticas Anidadas.**
# Curso de Java SE Orientado a Objetos

## Programación orientada a objetos en Java

Los **paradigmas de programación** son una teoría que nos suministra una base y modelo estandarizado para resolver problemas con nuestro código.

La **Programación Orientada a Objetos (POO)** nos ayuda a analizar y entender todos estos problemas para resolverlos de la forma más sostenible en el futuro. Java surgió con este paradigma y es uno de los lenguajes que define en gran manera el rumbo que sigue la **POO**.

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

## Objetos
Los **Objetos** son todas las cosas físicas o conceptuales que tienen propiedades y comportamientos. Por ejemplo: ``usuario, sesión, auto, etc``.

Las **Propiedades** o **atributos** son las características de nuestros objetos. Estos atributos siempre serán sustantivos y pueden tener diferentes valores que harán referencia a nombres, tamaños, formas y estados.

Por ejemplo: el color del auto es verde o rojo (``color`` es el atributo, ``verde`` y ``rojo`` son posibles valores para este atributo).

Los Comportamientos o métodos serán todas las operaciones de nuestros objetos que solemos llamar usando verbos o sustantivos y verbos. Por ejemplo: los métodos del objeto sesión pueden ser ``login()``, ``logout()``, ``makeReport()``, etc.

## Abstracción 
La **Abstracción** se trata de analizar objetos de forma independiente, sus propiedades, características y comportamientos, para abstraer su composición y generar un modelo, lo que traducimos a código como clases.

Las Clases son los modelos sobre los cuales construimos nuestros objetos, es decir, las clases son los “moldes” que nos permiten generar objetos. Cada clase debe tener identidad (con un nombre de clase único usando **Upper Camel Case**), estado (con sus **atributos**) y comportamiento (con sus **métodos** y **operaciones**).

Por ejemplo:
``El ejemplo de clase más típico en Internet:``
<code>Nombre de la clase: Person
Atributos: Name, Age
Operaciones: Walk()</code>


## Modularidad
La **Modularidad** consiste en dividir nuestro programa en diferentes módulos de forma que puedan unirse o separarse sin romperse entre ellos o perder alguna funcionalidad.

La **Modularidad** en **Programación Orientada a Objetos** nos ayuda a:

- Reutilizar código.
- Evitar colapsos.
- Que nuestro código sea mantenible.
- Mejorar la legibilidad.
- Resolución rápida de problemas.

## Creando la primera Clase (Doctor)

<pre>
    <code>// Clases:
public class Doctor {
  // Atributos:
  int id;
  String name;
  String speciality;

  // Comportamientos (métodos):
  public void showName() {
    // Instrucciones...
  }
}</code>
</pre>

### Demo:
![Clase_Doctor](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626133623/Academia-Java.-CDMX/JavaSE-POO/clases_q6obzr.png)

## Constructor
El Método Constructor es el primer método que se ejecuta por defecto cuando creamos una clase, nos permite crear nuevas instancias de una clase. Lo invocamos con la palabra reservada ``new`` seguida del nombre con el que inicializamos la clase y paréntesis.

<pre>
    <code>// nombreDeLaInstancia = new MétodoConstructor();
myDoctor = new Doctor();</code>
</pre>

El compilador de Java crea un método constructor en caso de que no definamos uno, pero de todas formas es muy buena idea programarlo nosotros, ya que nos permite definir y/o configurar el comportamiento de nuestros objetos usando argumentos.

<pre>
    <code>public class Doctor {
  // Atributos...

  // Método Constructor:
  Doctor(/* parámetros */) {
    // Instrucciones que se ejecutan al crear/instanciar
    // un nuevo objeto con la clase Doctor...
  }
}</code>
</pre>

### Demo:
![Constructor](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626134448/Academia-Java.-CDMX/JavaSE-POO/Constructor_py4w0v.png)

## Static: Variables y Métodos Estáticos

Los métodos y variables ``estáticos`` nos ayudan a ejecutar o conseguir algún código desde clases no han sido instanciadas, ya que sus valores se guardan en la memoria de nuestro programa, no en diferentes objetos instanciados a través de una clase.

Las variables estáticas mantienen su valor durante todo el ciclo de vida de nuestro programa, por lo tanto, podemos alterar los valores de una variable estática desde una clase y consumir su valor alterado desde otra sin necesidad de conectar ambas clases.

También podemos importar los métodos ``estáticos`` de una clase para usarlos sin necesidad de escribir el nombre de la clase:

<pre>
<code>import static com.anncode.operaciones.Calculadora.*
import static java.lang.Math.*

public class Principal {
  public static void (String[] args) {
    int number = suma(3, 5);
    System.out.println(number + PI);
  }
}</code>
</pre>

**Variable estática**
La variable id al ser estatica se puede modificar de distintas clases y de esta manera mantener un incremento y poder mutarla desde otra clase.
![Var_Estatica](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626149993/Academia-Java.-CDMX/JavaSE-POO/VarStatic_kt1kcb.png)

**Método Estático**
Mediante métodos estáticos podemos importarlo en la clase main y de esta manera hacer uso de estos métodos como si fueran parte de la misma clase main.

**Clase main**:
![Main_Static](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626151744/Academia-Java.-CDMX/JavaSE-POO/MainStatic_fgmqhb.png)

**Método static Ui**
![Metodo_Static](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626152069/Academia-Java.-CDMX/JavaSE-POO/metodosStatic_z9di2t.png)

### Demo:
![Ejecucion_static](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626152021/Academia-Java.-CDMX/JavaSE-POO/EjecucionStatic_joudls.png)

## Final variables constantes
Declaramos con la palabra reservada final una constante, la cual se utiliza cuando esta no será modifica y por convicción se escribe en mayúsculas.
<pre>
    <code>public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", 
    "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};</code>
</pre>

Seguidamente recorremos la colección de meses mediante un bucle for para mostrar los 3 primeros meses.

<pre>
   <conde>  
   //Lista de los 3 primeros meses
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". " + MONTHS[i]);
            }</conde> 
</pre>

### Demo
![Final](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626153790/Academia-Java.-CDMX/JavaSE-POO/final_g0jzo1.png)


## Sobrecarga de métodos y constructores

A veces necesitamos que dos o más métodos de una misma clase tengan el mismo nombre, pero con diferentes argumentos o distintos tipos de argumentos/valores de retorno.

<pre>
    <code>public class Calculadora {
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
}</code>
</pre>

El uso más común de la sobrecarga de métodos es la sobrecarga de constructores para instanciar objetos de formas distintas dependiendo de la cantidad de argumentos que enviamos.

<pre>
    <code>public class Doctor {
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
}</code>
</pre>

<pre>
    <code>//Clase main
    Doctor myDoctor = new Doctor("Eduardo Flores", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);</code>
</pre>>

## Demo:
![Sobrecarga](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626157399/Academia-Java.-CDMX/JavaSE-POO/Sobre_carga_h37ayg.png)

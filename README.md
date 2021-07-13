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
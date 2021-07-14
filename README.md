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

## Creando la primera Clase (model.Doctor)

<pre>
    <code>// Clases:
public class model.Doctor {
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
myDoctor = new model.Doctor();</code>
</pre>

El compilador de Java crea un método constructor en caso de que no definamos uno, pero de todas formas es muy buena idea programarlo nosotros, ya que nos permite definir y/o configurar el comportamiento de nuestros objetos usando argumentos.

<pre>
    <code>public class model.Doctor {
  // Atributos...

  // Método Constructor:
  model.Doctor(/* parámetros */) {
    // Instrucciones que se ejecutan al crear/instanciar
    // un nuevo objeto con la clase model.Doctor...
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
    <code>public class model.Doctor {
  static int id = 0;
  String name;
  String speciality;

  public model.Doctor() {
    this.name = "Nombre por defecto";
    this.speciality = "Especialidad por defecto";
  }

  public model.Doctor(String name, String speciality) {
    this.name = name;
    this.speciality = speciality;
  }
}</code>
</pre>

<pre>
    <code>//Clase main
    model.Doctor myDoctor = new model.Doctor("Eduardo Flores", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);</code>
</pre>>

### Demo:
![Sobrecarga](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626157399/Academia-Java.-CDMX/JavaSE-POO/Sobre_carga_h37ayg.png)

## Encapsulamiento: Modificadores de acceso
Los Modificadores de Acceso nos ayudan a limitar desde dónde podemos leer o modificar atributos especiales de nuestras clases. Podemos definir qué variables se pueden leer/editar por fuera de las clases donde fueron creadas. Esto lo conocemos como Encapsulamiento.

![Modificadores_Acesso](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626193159/Academia-Java.-CDMX/JavaSE-POO/Screen_Shot_2019-07-16_at_5.42.34_PM-05985be5-929e-4e87-8137-c1c5b16c96c2_ctpbj8.jpg)

## Getters y Setters

Los Getters y Setters nos permiten leer y escribir (respectivamente) los valores de nuestras variables privadas desde fuera de la clase donde fueron creadas. Con los Getters obtenemos los datos de las variables y con los Setters asignamos o cambiamos su valor.

<pre>
  <code>public class model.Patient {
  private String name;

  public String getName() {
    return "model.Patient name is " + this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}</code>

</pre>

### Demo
![encapsulamiento](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626194487/Academia-Java.-CDMX/JavaSE-POO/Encapsulamiento_t0dwni.png)

## Variables vs Objetos

Las **Variables** son entidades elementales muy sencillas, pueden ser ``números``, ``caracteres``, ``booleanos``, entre otras. Los **Objetos** son entidades complejas que pueden estar formadas por la agrupación de diferentes **variables** y **métodos**.

Los **Objetos Primitivos** o **Clases Wrapper** son **variables primitivas** que trabajan con algún tipo de dato y también tienen las características de los objetos.

Por ejemplo: ``Byte``, ``Short``, ``Integer``, ``Long``, ``Float``, ``Double``, ``Character``, ``Boolean`` o ``String``.

## Clases anidadas

Las **Clases Anidadas** o **Clases Helper** son clases dentro de otras clases que agrupamos por su lógica y/o características en común.

Podemos encontrar **clases estáticas anidadas**, **clases internas** que son locales a un método o clases internas anónimas. Las **clases anidadas** pueden llamar a cualquier tipo de elemento o método de nuestras clases.

Las **Clases Estáticas** no necesitan ser instanciadas para poder ser llamadas y ejecutadas, aunque debes recordar que solo permiten llamar a los métodos estáticos de sus clases padre.

### Demo:
![Clase_Anidada](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626202659/Academia-Java.-CDMX/JavaSE-POO/Clase_anidada_i4ykbw.png)

## Enumerations

Los **``enumerations** son tipos de datos muy especiales pues este, es el único en su tipo que sirve para declarar una colección de constantes, al ser así estaremos obligados a escribirlos con mayúsculas.

Usaremos `enum` cada vez que necesitemos representar un conjunto fijo de constantes. Por ejemplo los días de la semana.

Así podemos declarar un enumeration usando la palabra reservada ``enum``.

<pre>
  <code>public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}</code>
</pre>

Crear referencias de enumerations de la siguiente forma:
<pre>
  <code>Day day;
switch (day) {
	case MONDAY:
		System.out.println(“Mondays are good.”);
		break;
	case FRIDAY:
		System.out.println(“Fridays are nice”);
		break;
	case SATURDAY: case: SUNDAY:
		System.out.println(“Weekends are the best”);
		break;
	default:
		System.out.println(“Midweek are so-so”);
		break;

}</code>
</pre>

 Llamar un valor del enumeration así:

 <pre>
  <code>Day.MONDAY;
Day.FRIDAY;
Day.SATURDAY
</code>
 </pre>

 Los enumerations pueden tener atributos, métodos y constructores, como se muestra:

<pre>
  <code>public enum Day {
  MONDAY("Lunes");
  TUESDAY("Jueves");
  FRIDAY("Viernes");
  SATURDAY("Sábado");
  SUNDAY("Domingo");

  private String spanish;
  private Day(String s) {
    spanish = s;
  }

  private String getSpanish() {
    return spanish;
  }
}</code>
</pre>

Y para utilizarlo lo podemos hacer así:
<pre>
  <code>System.out.println(Day.MONDAY);
</code>
</pre>

Imprimirá: **MONDAY**

<pre>
  <code>System.out.println(Day.MONDAY.getSpanish());</code>
</pre>

Imprimirá: **Lunes**

## Herencia
**Don’t repeat yourself** (DRY) consiste en detectar cuando estamos repitiendo el mismo código una y otra vez para crear algún método o función que nos ayude a evitar estos repetidos.

Esta es una de las bases de la programación que siempre debemos tener en cuenta, ya que nos ayuda a reducir la dificultad de nuestro código para implementar cambios y/o mejoras en nuestra aplicación.

La Herencia consiste en crear nuevas clases a partir de otras clases, establecemos una relación padre e hijo entre nuestras clases. Es diferente a las clases anidadas, ya que, en vez de crear clases dentro de clases, le indicamos a nuestras subclases de qué superclase pueden heredar (``extends``) para reutilizar el código de algunos de sus métodos.

Recuerda que **nuestras clases no pueden heredar de más de una clase**.

<pre>
  <code>public class SuperClass {
  // ...
}</code>
</pre>

<pre>
  <code>public class SubClass extends SuperClass {
  // ...
}</code>
</pre>

## Super y This

``Super`` indica que una variable o método es de la clase padre, la superclase de cual heredan nuestras subclases, solo la usamos cuando aplicamos herencia.

Además, podemos llamar al constructor de la clase padre desde sus diferentes subclases usando ``super();`` y enviando los argumentos que sean necesarios.

Por otro lado, ``this`` nos permite especificar que nuestras variables están señalando a la misma clase donde estamos trabajando, ya sea una clase normal, anidada, subclase o superclase.

<pre>
  <code>public class model.User {
  int age = 1;

  public int getAge() {
    return this.age;
  }
}

public class model.Doctor extends model.User {
  String speciality = "Dentist";

  model.Doctor() {
    super.getAge(); // 1
    this.getSpeciality(); // Dentist
  }

  public int getSpeciality() {
    return this.speciality;
  }
} </code>
</pre>

## Polimorfismo: Sobreescritura de Métodos
El ``Polimorfismo`` es una característica de la programación orientada a objetos que consiste en sobrescribir algunos métodos de la clase de la cual heredan nuestras subclases para asignar comportamientos diferentes.

Además de los métodos de las superclases, también podemos redefinir el comportamiento de los métodos que “heredan” todos nuestros objetos, así como ``.toString``, ``hashCode``, ``finalize``, ``notify``, entre otros.

La sobreescritura de constructores consiste en usar los miembros heredados de una supreclase pero con argumentos diferentes.

Recuerda que no podemos sobrescribir los métodos marcados como final o static.

**Sobreescritura toString clase model.User**
<pre>
  <code>   @Override
    public String toString() {
        return "model.User{" +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }</code>
</pre>

**Sobreescritura toString clase model.Patient**
<pre>
  <code> @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " + getBlood() + "\n Height: " + getHeight() + "\n Blood" + blood;
    }</code>
</pre>

**Sobreescritura toString clase model.Doctor**
<pre>
  <code>@Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }</code>
</pre>

**Sobreescritura toString clase AvailableAppointmet**
 <pre>
  <code>@Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }</code>
 </pre>
### Demo

![Polimorfismo_toString](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626216150/Academia-Java.-CDMX/JavaSE-POO/Polimorfismo_gvmdec.png)

## Interfaces

Las **Interfaces** son un tipo de referencia similar a una clase con solo constantes y definiciones de métodos, son de gran ayuda para definir los comportamientos que son redundantes y queremos reutilizar un más de una clase, incluso cuando tenemos muchas clases y no todas pertenecen a la misma “familia”.

Las interfaces establecen la forma de las clases que la implementan, así como sus nombres de métodos, listas de argumentos y listas de retorno, pero NO sus bloques de código, eso es responsabilidad de cada clase.

**Composición de Interfaces en Clases:** abstraer todos los métodos/comportamientos de una clase para modularizarlos (comprimirlos, encapsularlos) en una interfaz y reutilizar su código en diferentes clases.

Las interfaces se crean utilizando la palabra reservada ``interface`` y se implementan en nuestras clases con ``implements``.

<pre>
  <code>public interface ISchedulabe {
  void schedule(Date date, String Time);
}

public class AppointmentDoctor implements ISchedulable {
  @Override
  public void schedule(Date date, String Time) {
    // ...
  }
}</code> 
</pre>

**Interface ISchedulable**
<pre>
  <code>package model;

import java.util.Date;

public interface ISchedulable {

    void schedule(Date date, String time);

}</code>
</pre>

**Implement Interface ISchedulable en AppointmentNurse**
<pre>
  <code>public class AppointmentNurse implements  ISchedulable{
    private  int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;
    private String time;
    }</code>
</pre>

**Implement Interface ISchedulable en AppointmentDoctor**
<pre>
  <code>package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable{
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;
}</code>
</pre>

## Collections
Otras **interfaces** que son muy importantes en Java son los llamados **Collections**

Los **Collections** nos van a servir para trabajar con colecciones de datos, específicamente y solamente con objetos, para esto recuerda que tenemos disponibles nuestras clases Wrapper que nos ayudan a convertir datos primitivos a objetos.

Los **collections** se diferencian de los arrays en que su tamaño no es fijo y por el contrario es dinámico.

Diagrama de su composición:
![Collections](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626231155/Academia-Java.-CDMX/JavaSE-POO/composicion._collection_cgeyv2.webp)

## Simulando autenticación de usuarios

<pre>
  <code>private static void  authUser(int userType){
        //UserType = 1 Doctor
        //UserType = 2 Patient

        //Datos de los Doctores
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Eduardo Flores", "eduardoFlores@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "karens@gmail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rociog@gmail.com"));

        //Datos de los pacientes
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Eduardo Ramirez", "eduRamirez@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez", "robertp@gmail.com"));
        patients.add(new Patient("Carlos Sanchez", "Carlos@gmail.com"));

        //Flag emailCorrect
        boolean emailCorrect = false;

        //Ejecutar hasta hacer match con algun email
        do {
            System.out.println("Insert Your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            
            //Si viene entonces es un doctor
            if (userType == 1){
                //Reccore la coleccion de datos
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario loggeado
                        doctorLogged = d;
                        //ShowDoctorMenu

                    }
                }
            }
            //Si es dos entonces es un paciente
            if (userType == 2){
                //Reccore la coleccion de datos
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario loggeado
                        patientLogged = p;
                        //ShowPatientMenu


                    }
                }
            }
        }while (!emailCorrect);//Si el email no es correcto ejecutar el bucle
    }</code>
</pre>

## Registro de citas 

**Doctor**
![Doctor](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626238047/Academia-Java.-CDMX/JavaSE-POO/Login_1_eut162.png)

**Login**
![Login_email](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626238047/Academia-Java.-CDMX/JavaSE-POO/Login_2_d54lhr.png)

**Selección del mes para la cita**
![mes_cita](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626238048/Academia-Java.-CDMX/JavaSE-POO/Login_3_l2ptih.png)

**Fecha de la cita**
![fecha](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626238048/Academia-Java.-CDMX/JavaSE-POO/Login_4_mrgkpk.png)

**Hora de la cita**
![hora_Cita](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626238050/Academia-Java.-CDMX/JavaSE-POO/Login_5_dsmxhr.png)

**Confirmar cita**
![asd](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1626238050/Academia-Java.-CDMX/JavaSE-POO/Login_5_dsmxhr.png)
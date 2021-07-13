public class Doctor {
    //Atributos clase doctor
    int id;
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    //Pasar el nombre
    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }




}

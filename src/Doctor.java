public class Doctor {
    //Atributos clase doctor
    static int id = 0;//Autoincrement
    String name;
    String speciality;
    String email;

    //Constructor, cada vez que se instancia aumentara el id en 1
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");

    }
    //Pasar el nombre
    Doctor(String name, String speciality){
        //System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //Imprimir variable Statica,
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }





}

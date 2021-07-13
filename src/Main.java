import static UI.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //Instancia clase Doctor
        Doctor myDoctor = new Doctor();
        //Nombre doctor
        myDoctor.name = "Eduardo Flores";
        //Ejecutar metodo
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorEd = new Doctor();
        System.out.println(Doctor.id);

        //Metodo estatico se utiliza como si fuera parte de esta clase debido al import
        showMenu();

    }


}

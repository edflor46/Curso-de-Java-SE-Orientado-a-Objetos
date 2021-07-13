import static UI.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //Metodo estatico se utiliza como si fuera parte de esta clase debido al import
        //showMenu();

        Doctor myDoctor = new Doctor("Eduardo Flores", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);


    }


}

import static UI.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //Metodo estatico se utiliza como si fuera parte de esta clase debido al import
        //showMenu();

        //Doctor
        Doctor myDoctor = new Doctor("Eduardo Flores", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        //Patient
        Patient patient = new Patient("Alejandara", "alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("123456789");




    }


}

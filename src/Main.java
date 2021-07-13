import java.util.Date;

import static UI.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //Metodo estatico se utiliza como si fuera parte de esta clase debido al import
        //showMenu();

        //Doctor
        Doctor myDoctor = new Doctor("Eduardo Flores", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "3 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "8 am");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        //Patient
        Patient patient = new Patient("Alejandara", "alejandra@gmail.com");
        patient.setWeight(54.6);
        //System.out.println(patient.getWeight());
        //patient.setPhoneNumber("123456789");




    }


}

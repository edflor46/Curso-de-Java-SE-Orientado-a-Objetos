import java.util.Date;

import static UI.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //Metodo estatico se utiliza como si fuera parte de esta clase debido al import
        //showMenu();

        //Doctor
        Doctor myDoctor = new Doctor("Eduardo Flores", "edflor@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "3 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "8 am");
        System.out.println(myDoctor);
        /*for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
         */

        System.out.println();
        System.out.println();

        //Patient
        Patient patient  = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient);






    }


}

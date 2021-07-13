import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos clase doctor
    static int id = 0;//Autoincrement
    private String name;
    private String speciality;
    private String email;


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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public  ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

//CLASS AvailableAppointment
    public  static  class AvailableAppointment{
        //Available appointment
        private  int id;
        private  Date date;
        private  String time;

        //Get y Set
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
    }
}

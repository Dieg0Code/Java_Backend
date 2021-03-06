package JavaOO.MyMedicalAppointments;

import JavaOO.MyMedicalAppointments.model.Doctor;
import JavaOO.MyMedicalAppointments.model.Patient;
import JavaOO.MyMedicalAppointments.model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Diego Obando", "Dostor@email.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Diego", "diego@email.com");
        user.showDataUser();

        User userPatient = new Patient("Pedro", "pedro@email.com");
        userPatient.showDataUser();
        /*
        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        /*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
        */
    }
}
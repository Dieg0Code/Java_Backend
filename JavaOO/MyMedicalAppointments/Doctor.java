package JavaOO.MyMedicalAppointments;

public class Doctor {
    // Atributos
    int id;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }
}

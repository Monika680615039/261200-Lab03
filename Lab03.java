public class Lab03 {


    public static void main(String[] args) {
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "123-456-7890");

        System.out.printf("Patient BMI: %.2f%n", patient.getBMI());

    }
}
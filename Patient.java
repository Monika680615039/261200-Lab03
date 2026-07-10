public class Patient {
    private int id;        // patient's ID
    private String name;   // patient's full name
    private int birthYear; // patient's year of birth (CE)
    private double height; // patient's height in centimeters
    private double weight; // patient's weight in kilograms
    private String bloodGroup; // patient's blood type
    private String phoneNumber; // patient's contact number


    // Constructor Chaining by passing data to the 7parameter constructor.
    public Patient(int id, String name, int birthYear, double height, double weight) {
        // Calls the other constructor in this class using this keyword.

        this(id, name, birthYear, height, weight, "Unknown", "Unknown");
    }

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        if (id > 0) { // Must be a positive integer
            this.id = id;
        } else {
            this.id = -1;
        }
        this.id = id;
        this.name = name;

        if (birthYear >= 1900 && birthYear <= 2026) { //Must be between 1900 and 2026,  otherwise default to 1900
            this.birthYear = birthYear;
        } else {
            this.birthYear = 1900;
        }
        if (height >= 30 && height <= 300) { //Must be between 30 and 300 , otherwise default to 150
            this.height = height;
        } else {
            this.height = 150;
        }
        if (weight >= 0.5 && weight <= 500) { // Must be between 0.5 and 500 , otherwise default to 30
            this.weight = weight;
        } else {
            this.weight = 30;
        }
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;


    }
    //Getter

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public int getId() {
        return this.id;
    }
    //The calculated BMI value as a double.

    public double getBMI() {
        // Convert height from cm to  m before calculation
        double heightInMeters = this.height / 100.0;

        // weight divided by height squared
        return this.weight / (heightInMeters * heightInMeters);
    }


    // Calculates the patient's age
    public int getAge(int currentYear) {
        if (currentYear - this.birthYear >= 0) {

            return currentYear - this.birthYear;
        } else {
            return -1;

        }
    }


    public String getDetails(int currentYear) {
        return "Patient Name: " + name + "\n" +
                "Patient Age: " + getAge(currentYear) + "\n" +
                "Patient Height (cm): " + height + "\n" +
                "Patient Weight (kg): " + weight;
    }
}










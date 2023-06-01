import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class HeartRates {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;

    //Constructor
    HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    //Setters and Getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNAme(String lastNAme) {
        this.lastName = lastNAme;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNAme() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Method to calculate age in years

    public int calculateAge(Period age) {
        return age.getYears();
    }



    // Method to calculate maximum heart rate
    public int calculateMaximumHeartRate() {
        AgeCalculator agCal = new AgeCalculator();
        Period age = agCal.calculateAge(dateOfBirth);
        int i = 220 - calculateAge(age);
        return i;
    }

    // Method to calculate and print target heart rate range
    public void calculateAndPrintTargetHeartRateRange() {
        int restingHeartRate = 70;
        int maximumHeartRate = calculateMaximumHeartRate();
        int averageHeartRate = maximumHeartRate - restingHeartRate;
        double lowerBoundary = 0.5;
        double upperBoundary = 0.85;

        double lowerBoundaryTargetHeartRate = averageHeartRate * lowerBoundary + restingHeartRate;
        double upperBoundaryTargetHeartRate = averageHeartRate * upperBoundary + restingHeartRate;

        System.out.println("\n\nThe Target Heart Rate Range is between " + lowerBoundaryTargetHeartRate + " and " + upperBoundaryTargetHeartRate);
    }



    // Override toString() method
    @Override
    public String toString() {
        AgeCalculator agCal = new AgeCalculator();
        Period age = agCal.calculateAge(dateOfBirth);
        int ageInt = calculateAge(age);
        return  "\nFirst Name : " + firstName +
                "\nLast Name : " + lastName +
                "\nAge :" + ageInt +
                "\nDate of Birth: " + dateOfBirth +
                "\nMaximum Heart Rate: " + calculateMaximumHeartRate();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user 1st and last name
        System.out.print("Please, enter your first name:\n");
        String firstName = scanner.nextLine();

        System.out.print("Please, enter your last name:\n");
        String lastName = scanner.nextLine();

        //Get date of birth in form of localDate
        AgeCalculator agCal = new AgeCalculator();
        LocalDate dateOfBirth = agCal.getBirthday();


        // Create HeartRates object
        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);

        // Calculate target heart rate and print the other information
        heartRates.calculateAndPrintTargetHeartRateRange();
        System.out.println("\n" + heartRates.toString());
    }
}

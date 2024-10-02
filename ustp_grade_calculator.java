import java.util.Scanner;

public class ustp_grade_calculator{  
    public static float gradeAverage(float gpa, float grade, int subjects, int units, Scanner scan){
        float totalGrade = 0;
        float totalUnits = 0;
        
        for (int i = 1; i <= subjects; i++) {
            // Grades for each subject
            System.out.print("Enter grade for subject " + i + ": ");
            grade = scan.nextFloat();

            // Units for each subject
            System.out.print("Enter units for subject " + i + ": ");
            units = scan.nextInt();
            
            totalGrade += grade * units; 
            totalUnits += units;
        }

        gpa = totalGrade / totalUnits;
        return gpa;
    }
    
    
    public static void Remarks(float gpa){
        // Grade Remarks
        System.out.print("Remarks: ");
        if (gpa >= 1 && gpa < 1.5){
            System.out.println("Excellent!");
        } else if (gpa >= 1.5 && gpa < 2){
            System.out.println("Very Good!");
        } else if (gpa >= 2 && gpa < 2.5){
            System.out.println("Above Average");
        } else if (gpa >= 2.5 && gpa < 3){
            System.out.println("Average");
        } else if (gpa >= 3 && gpa < 3.75){
            System.out.println("Conditional");
        } else if (gpa >= 3.75 && gpa <= 5){
            System.out.println("Failed");
        } else{
            System.out.println("Invalid!");
        }

        // Academic Standing
        System.out.print("Dean's List: ");
        if (gpa >= 1 && gpa <= 1.25){
            System.out.println("With Highest Merit");
        } else if (gpa >= 1.26 && gpa <= 1.5){
            System.out.println("With High Merit");
        } else if (gpa >= 1.51 && gpa <= 1.75){
            System.out.println("With Merit");
        } else {
            System.out.println("No Standing.");
        }
    }

    
    public static void main (String[] args){ 
        Scanner scan = new Scanner(System.in);

        float gpa = 0, grade = 0;
        int units = 0, subjects = 0;

        System.out.print("Enter number of subjects: ");
        subjects = scan.nextInt();

        gpa = gradeAverage(gpa, grade, subjects, units, scan);
        System.out.println("\nGPA: " + gpa);
        Remarks(gpa);

        scan.close();
    }
}

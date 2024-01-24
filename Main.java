
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("select your position:\n1.nurse  2.patient reception ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                JOptionPane.showMessageDialog(null,"nurse:");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"patient reception");
                break;
            default:
                JOptionPane.showMessageDialog(null,"invalid input");
        }
        Scanner input = new Scanner(System.in);
        NurseMenu nurse = new NurseMenu();

        boolean check = false;
        while (nurse.attempts < 3) {
            JOptionPane.showMessageDialog(null,"Enter nurse code: ");
            String inputNurseCode = input.next();
            JOptionPane.showMessageDialog(null,"Enter password: ");
            String inputPassword = input.next();

            check = nurse.Checkingnurse(inputNurseCode, inputPassword);
            nurse.attempts++;
            if (check) {
                JOptionPane.showMessageDialog(null,"correct");
                break;
            } else if (nurse.attempts < 3) {
                JOptionPane.showMessageDialog(null,"try again");
            }
        }

        if (nurse.attempts == 3) {
            JOptionPane.showMessageDialog(null,"You do not have permission to access the application.");
        }


        if (check) {
            JOptionPane.showMessageDialog(null,"select: \n1. Update Patient File\n2. Change Password");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Enter patient code: ");
                    String patientCode = scanner.next();
                    if (nurse.CheckingPatient(patientCode)) {
                        JOptionPane.showMessageDialog(null,"Patient code is correct");
                    } else {
                        JOptionPane.showMessageDialog(null,"Invalid input");
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Changing password:");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Invalid option");
            }
        } else if (nurse.attempts < 3) {
            JOptionPane.showMessageDialog(null,"Invalid, try again");
        } else {
            JOptionPane.showMessageDialog(null,"attempts reached");
        }
        scanner.close();
    }
}
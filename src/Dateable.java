import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner scannerAge = new Scanner(System.in);
        System.out.println("Welcome! This program should help you determine what age person you should date. \nTo start, please enter your age: ");
        int age = -1;
        while (age < 0) {
            System.out.println("Please enter a valid number.");
            try {
                age = Integer.parseInt(scannerAge.nextLine());
            }
            catch(NumberFormatException e) {
            }
        }
        int minDatingAge = ((age / 2) + 7);
        System.out.println("Alright! " + age + "-year olds should date someone who is at least " + minDatingAge + "-years old." + " \nThanks for using this program!");

    }
}

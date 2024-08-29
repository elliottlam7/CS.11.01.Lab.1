import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner scannerBook = new Scanner(System.in);
        System.out.println("Welcome! This program tells you how many pages you should read before giving up on a book. \nTo start, please enter your age: ");
        int age = -1;
        while (age < 0) {
            System.out.println("Please enter a valid number.");
            try {
                age = Integer.parseInt(scannerBook.nextLine());
            }
            catch(NumberFormatException e) {
            }
        }
        int minPagesRead = 100 - age;
        System.out.println("Alright! " + age + "-year olds should read at least " + minPagesRead + " pages before giving up on a book." + " \nThanks for using this program!");

    }
}

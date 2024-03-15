package lab4;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose an option to display the corresponding piece of information:");
        System.out.println("1.Capital of Bahrain");
        System.out.println("2.Population of Bahrain");
        System.out.println("3.Climate of Bahrain");
        System.out.println("4.GDP of Bahrain");
        System.out.println("5.Size of Bahrain (square km)");

        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("Your choice was 1. The capital of Bahrain is Manama.");
        } else if (choice == 2) {
            System.out.println("Your choice was 2. The population of Bahrain: 1,039,297.");
        } else if (choice == 3) {
            System.out.println(
                    "Your choice was 3. Bahrain has two seasons: an extremely hot summer and a relatively mild winter.");
        } else if (choice == 4) {
            System.out.println("Your choice was 4. Bahrain's GDP was 35.31 billion USD in 2017.");
        } else if (choice == 5) {
            System.out.println("Your choice was 5. Bahrain is 765.3 square km.");
        } else {
            System.out.println("You entered a wrong choice.");
        }
        in.close();
    }
}

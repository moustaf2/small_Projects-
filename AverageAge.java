import java.util.Scanner;

public class AverageAge {
    private String name;
    private float averageAge;

    // Constructor
    public AverageAge() {
    }

    public AverageAge(String name, int age) {
        this.name = name;
        this.averageAge = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageAge() {
        return averageAge;
    }

    public void calculateAverageAge(int count) {
        float sumOfAges = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter age " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            int age = scanner.nextInt();
            System.out.println("Age " + i + " is: " + age);
            sumOfAges += age;
        }

        this.averageAge = sumOfAges / count;
        System.out.println("Average age is: " + averageAge);
        scanner.close();
    }
}

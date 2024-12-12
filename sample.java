import java.util.Scanner;

class sample {
  public static void main(String[] args) {
    Scanner Hr = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = Hr.nextLine();
    int age =Hr.nextInt();
    double salary = Hr.nextDouble();
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}

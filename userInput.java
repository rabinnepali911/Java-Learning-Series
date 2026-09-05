import java.util.Scanner;

public class userInput {
    public static void main(String[] args)
    {
        System.out.println("This is the User Input part.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your rollNo: ");
        int rollNo = scan.nextInt();
        System.out.println("Enter you GPA: ");
        double gpa = scan.nextDouble();
        scan.nextLine(); // Consume leftover Enter
        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("The Student Detail:\n RollNo: "+rollNo + "\n Name: " + name +"\n GPA: " + gpa );
        scan.close();

    }
}

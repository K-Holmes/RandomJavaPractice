import java.util.Scanner;

public class PracticeWithJava {
    public static void main(String[] args) {
        //variables in strings
        System.out.println("Here is a text statement");
        int number = 5;
        System.out.println("Here is another text statement with a number: " + number);

        //basic scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Please give me a value; string, int, double, whatever");
        String userInput = obj.next();
        System.out.println("Your input was: " + userInput);

        //multiplication with a scanner
        int firstNum, secondNum, product;
        System.out.println("Please enter a number to multiply");
        firstNum = obj.nextInt();
        System.out.println("Please enter another number to multiply the first number by");
        secondNum = obj.nextInt();
        product = firstNum * secondNum;
        System.out.println(firstNum +" x " + secondNum + " = " + product);

        //for-loops
        for (int i =0; i<5; i++) {
            System.out.println("This message has repeated " +i +"/4 times");
        }

    }
}

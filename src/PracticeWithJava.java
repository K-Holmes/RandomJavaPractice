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

        //switch statements- newest addition
        System.out.println("Please give a num between 1 and 5");
        int userNum = obj.nextInt();
        switch (userNum) {
            case 1:
                System.out.println("One, the loneliest number");
                break;
            case 2:
                System.out.println("Two, a pair, not to be confused with the fruit");
                break;
            case 3:
                System.out.println("Three, a trio, like the musketeers");
                break;
            case 4:
                System.out.println("Four, a typical squad size in video games");
                break;
            case 5:
                System.out.println("Five, representing penta(anything) and starfish- like Patrick Star!");
                break;
            default:
                System.out.println("You had one job, this is invalid");
        }

        //boolean checks
        System.out.println("");
        System.out.println("Today's task is to go to the library, but we need to check the weather.");
        System.out.println("Whats the weather like? 1= rain, 2= cloudy, 3= sunny, 4 = snow");
        int weatherCondition = obj.nextInt();
        boolean goodWeather;
        if (weatherCondition == 1) {
            goodWeather = false;
            System.out.println("Reports call for heavy rain, good weather = "+goodWeather);
            System.out.println("Maybe another day..");
        }
        else if (weatherCondition == 2) {
            goodWeather = true;
            System.out.println("Reports call for clouds, good weather = "+goodWeather);
            System.out.println("Should be fine, to the library!");
        }
        else if (weatherCondition == 3) {
            goodWeather = true;
            System.out.println("Reports call for sun, good weather = "+goodWeather);
            System.out.println("A beautiful day for the library");
        }
        else if (weatherCondition == 4) {
            goodWeather = false;
            System.out.println("Reports call for heavy snow, good weather = "+goodWeather);
            System.out.println("Maybe another day..");
        }
        else {
            goodWeather = false;
            System.out.println("You're too lazy to check the weather, good weather = " +goodWeather);
            System.out.println("Better luck next time");
        }

    }
}

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) { 
        System.out.println("Hello World!");


        // demonstartion of variables

        int age = 20;
        String name = "Sachintha";
        double height = 5.8;
        boolean isAdult = true;

        System.out.println("My name is " + name + " and my age is " + age + " and my height is " + height + " and is adult " + isAdult);

        // demonstartion of user input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String userName = sc.nextLine(); // here sc is the object of the Scanner class , and nextLine() is a method inside the Scanner class , and we are calling that method using the object sc , and we are storing the value returned by the nextLine() method in a variable called userName


       // demonstarte of string methods

         String myName = "Sachintha"; // is here myname is a object of the String class , and we are calling the methods using that object ? yes. but in general we look at myName as a variable , but its a object of the String class , and we are calling the methods using that object

            System.out.println(myName.length()); // here length() is a method inside the String class , and we are calling that method using the object myName , and we are printing the value returned by the length() method

            // demonstartion of if else statements to check a condition 

            if (userName.equals(myName)) { 
                System.out.println("You are Sachintha");
            } else {
                System.out.println("You are not Sachintha");
            }

            // list of all the operators

            // + - * / % ++ -- += -= *= /= %= == != > < >= <= && || ! & | ^ ~ << >> >>>

            //demonstartion of all loops

            // for loop

            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }

            // while loop

            int i = 0;

            while (i < 10000) {
                System.out.println(i);
                i++;
            }

            // do while loop

            int j = 0;

            do {
                System.out.println(j);
                j++;
            } while (j < 10000);

            // demonstartion of switch case

            int day = 1;

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("Invalid day");
            }

    }

    /* in java what happen is that everthing is inside a class , and the class name should be the same as the file name , why because its a convention . AND main method is the entry point of the program , but in classes what happen is we cant access anything inside the class without creating an object , so we need to create an object to access the main method , but in java we have a keyword called static , so if we use static keyword in front of the main method , then we can access the main method without creating an object , and the main method should be public , because we need to access it from outside the class , and the main method should be void , because we dont need to return anything from the main method , and the main method should have a parameter called String[] args , because we need to pass arguments to the main method , and the main method should be static because we need to access it without creating an object , and the main method should be public because we need to access it from outside the class */

    // demonstartion of variables


    
   

}

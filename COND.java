import java.util.Scanner;

public class COND {

    public static void main(String[] args) {

        /*

        int a = 5;
        int b = 10;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println();


        boolean isEquel = a == b;
        System.out.println(isEquel);


        if (a == b) {
            System.out.println("eueals");
        }


        int age = 50;

        if (age >= 18) {
            System.out.println("hello from the other side");
        } else {
            System.out.println("you can not enter");
        }

        int time = 11;

        if (time > 12) {
            System.out.println("good evening");
        } else {
            System.out.println("good mornning");

        }

        int yy = 20;
        int xx = 50;

        if (yy > xx) {
            System.out.println(yy + xx);

        } else
            System.out.println(yy - xx);

        String goldName = "chenchoc";

        if (goldName.length() >= 6) {
            System.out.println("yessssssss");

        } else
            System.out.println("not good");


        int number = 512;

        if (number % 2 == 0) {
            System.out.println("even number");
        } else
            System.out.println("old number");


    }
*/


        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = scanner.next();

        System.out.println("please enter your age");
        int age = scanner.nextInt();

        System.out.println("hey "+ name + " your age is "+ age);

        */

    /*
        int mnx =55;

        if ( mnx >= 50 && mnx <=70)
        System.out.println("yeaaaaa");
        else
        System.out.println("boooo");


 */



    Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number x ");
        double x = scanner.nextDouble();
        System.out.println("please enter cher op ");
        char op = scanner.next().charAt(0);
        System.out.println("please enter number y");
        double y = scanner.nextDouble();

        /*
    if (op == '+')
        System.out.println(x+y);
    else if (op == '-')
        System.out.println(x-y);
    else if (op == '*')
        System.out.println(x*y);
    else if (op == '/')
        System.out.println(x/y);
    else
        System.out.println("you enter a wrong op");
*/
        switch (op){
            case '+' -> System.out.println(x+y);
            case '-' -> System.out.println(x-y);
            case '*' -> System.out.println(x*y);
            case '/' -> System.out.println(x/y);
            case  '%' -> System.out.println(x%y);
            default -> System.out.println("you entre a worng op");





        }
    }

    }










import java.util.Locale;
import java.util.Scanner;

public class HOMEWORK {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
/*
        //שיעורי בית של שיעור מספר 2

        System.out.println("please enter number");
        int number1 = sc1.nextInt();

        if (number1%2==0) {
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }

        }
*/

        // שיעורי בית שיעור 3 שאלה ראשונה
        /*
        System.out.println("please enter your name :");
        String Name = sc1.next();
        System.out.println("[please enter your age :");
        int age = sc1.nextInt();


        if
        (age > 50)
        System.out.println(Name.toUpperCase(Locale.ROOT));
        else if (age < 50)
            System.out.println(Name.toLowerCase(Locale.ROOT));

         */


        //שיעור 3 שאלה שנייה
        /*


        System.out.println("please enter number");
        int number = sc1.nextInt();
        number = number  % 10;
        System.out.println(number);
        System.out.println("");
        */



        // שיעור 3 שאלה שלישית
        /*

        System.out.println("please enter numberDay");
        int numberDay = sc1.nextInt();

        if ( numberDay>=1 && numberDay <= 365 && numberDay%7==1)
        System.out.println("sunday");
        else if ( numberDay>=1 && numberDay <= 365 && numberDay%7==2)
            System.out.println("monday");
        else if ( numberDay>=1 && numberDay <= 365 && numberDay%7==3)
            System.out.println("Tuesday");
        else if ( numberDay>=1 && numberDay <= 365 && numberDay%7==4)
            System.out.println("wednesday");
        else if ( numberDay>=1 && numberDay <= 365 && numberDay%7==5)
            System.out.println("thursday");
        else if  ( numberDay>=1 && numberDay <= 365 && numberDay%7==6)
            System.out.println("friday");
        else if ( numberDay>=1 && numberDay <= 365 && numberDay%7==0)
            System.out.println("saturday");
        else if ( numberDay>=1 && numberDay <= 365 )
            System.out.println("Error in number range");

            פתרוו נוסף

        System.out.println("please enter a dayN");
        int dayN = sc1.nextInt();
        dayN = dayN % 7 ;

        switch (dayN){
            case 1 -> System.out.println("sun");
            case 2 -> System.out.println("mon");
            case 3 -> System.out.println("tus");
            case 4 -> System.out.println("wen");
            case 5 -> System.out.println("thu");
            case 6 -> System.out.println("fri");
            case 0 -> System.out.println("sat");



         */


        // שיעור 4 שאלה 1
/*
        System.out.println("please enter num");
        int num = sc1.nextInt();
        System.out.println((Math.pow( num , 3)));

*/
        // שיעור 4 שאלה 1 (פתרון ללא פונקציית מאט)
        /*


        int num =sc1.nextInt();
        int ans = 1;
        for ( int i =0 ; i <3 ; i++){
            ans = ans * num;
            }
            System.out.println(ans);
            */








        // שיעור 4 שאלה 2
/*
        for ( int i = 0 ; i <15 ; i++)
            System.out.println("heyyyyyyyyy");
  */
        // שיעור 4 שאלה 2 פתרון נוסך בצורת WHILE
        /*
        int c = 0 ;
        while (c <14 ){
            System.out.println("heyyyy");
            c++;
        }
*/

        // שיעור 4 שאלה 3
/*

      // לולאה היא שורת קוד החוזרת על עצמה כמות פעמים בצורה מסוימת
        //ישנן שני סוגי לולאות
        //לולאת FOR
        // לולאה המוגדרת מראש את כמות הפעמים שהקוד יחזור על עצמו
        // לולאת WHILE
        // לולאה שתחזור על עצמה כמות פעמים בלתי מוגבלת עד שתגבל ערך שתגיד לה לעצור את הלופ



 */


        //  שיעור 4 שאלה 4
/*
        for (int i =0 ; i < 100 ; i = i+3 )
            System.out.println(i);
*/


        // שיעור 4 שאלה 5
/*
        int sum = 0;
        for ( int i = 0 ; i < 8 ; i ++ ) {
            System.out.println("please enter the " + (i+1) + "number");
            int input = sc1.nextInt();
            sum = sum + input ;

        }
        System.out.println(sum);
*/

        // שיעור 4 שאלה 6 אתגר
/*
        int num = sc1.nextInt();
        int multi = 1;

        while (num > 0 ){
            multi = num * multi;
            num--;
        }
        System.out.println(multi);
*/

        }






    }






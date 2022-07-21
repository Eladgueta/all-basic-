import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class last {


// שיעור 4/7 למידת פונקציות


   // public static void sum(double a , double b ){
     //   System.out.println(a+b);


    // שאלה ראשונה- פונקציה שמקבלת 2 משתנים ומדפיסה את המכפלה שלהם
    /*
    public static void NUB ( int n , int n2) {

        System.out.println(n * n2);
    }
*/

    //  שאלה שנייה - פונקציה שמקבלת 2 משתנים , שם ושם משפחה ומדפיסה את השם באותיות גדולות ואת השם משפחה באותיות קטנות
    /*
    public static void NAMEandLASTNAME ( String name , String lastname ) {
        System.out.println(name.toUpperCase() + lastname.toLowerCase());
}
*/


// שאלה שלוש - פונקציה שמקבלת 3 מספרים ומדפיסה את הממוצע שלהם
    /*
    public static void  sum ( int a , int b , int c) {
        System.out.println((a + b + c) / 3);
}
   */

    // שאלה ארבע לא עשיתי !!!
    /*
  //  public static void NAMES ( String n1 , String n2 , String n3 , String n4 ) {

    }

*/

  //  public static void hello(){
    //    System.out.println("hey how are you");



    // שיעור 7/7
    //  תרגיל 1 - פונקציה שמקבלת מספר שלם . ומחזירה אמת אם המספר אי זוגי ושקר אם המספר זוגי
    /*
    static boolean ISODO( int x  ){

    if (x%2 == 0)
       return (false);
    else
        return (true);

    }
     */

    // תרגיל 2 - פונקציה שבודקת אם השם שלכם הוא שם של מלאך , שם של מלאך הוא שם שמורכב מ-בדיוק 3 אותיות והאות הראשונה s גדולה
    /*
    static boolean isangle (String name){
        char first = name.toUpperCase().charAt(0);
        if (name.length() == 3 && first == 's')
            return true;
        else
            return false;

}
     */


  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
        /*
        NUB(5 , 9);
        NAMEandLASTNAME("elad" ,"gueta" );
        sum(9,8, 5);
        NAMES();

   //   System.out.println(ISODO(87));

  //    System.out.println(isangle('ssa'));

*/
      // תרגיל 3 - קוד שמקבל מהמשתמש את שנת הלידה שלו , ומדפיס לו את הגיל שלו
     /*

      System.out.println("please enter the year you birth");
      int BR = scanner.nextInt();
      int thisyear = 2022;
      int age = thisyear - BR ;
      System.out.println(age);

      */


      //תרגיל 4 - קוד שמקבל 2 שמות מהמשתמש ומדפיס את אחוז ההתאמה בינהם (אהבה)
/*
      System.out.println("please enter the first name");
      String name1 = scanner.next();
      System.out.println("please enter the second name");
      String name2 = scanner.next();
      int x = random.nextInt(101);
      System.out.println(x + "% of loveeee");
*/

      // הדפסת השעה עכשיו
      /*
      LocalDateTime time = LocalDateTime.now();
      System.out.println(time);


       */

      // קוד לבדיקת כמה תהליכים רצים במחשב
      /*
      System.out.println(Thread.activeCount());
      */

      //

      //תרגיל 5 - קוד משחק הזכרון 

      int numbers[] = new int[10];
      numbers[0] = 10;
      numbers[1] = 20;
      numbers[2] = 30;
      numbers[3] = 40;
      numbers[4] = 50;
      numbers[5] = 50;
      numbers[6] = 40;
      numbers[7] = 30;
      numbers[8] = 20;
      numbers[9] = 10;
      int points = 0;

      for (int i = 0; i < 5; i++) {
      System.out.println("please enter a number between 0 - 9 ");
      int guess1 = scanner.nextInt();
      System.out.println("please enter a number between 0 - 9 ");
      int guess2 = scanner.nextInt();

      if (numbers[guess1] == numbers[guess2])
          points++;
          System.out.println("your points is : "+ points);
      }

      if ( points < 3)
          System.out.println("game over");
      else System.out.println("you are the best");
    }
}














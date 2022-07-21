import java.util.Arrays;
import java.util.Scanner;

public class homewoekincalls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //שיעור 27.6 תרגיל 1

        //    for (int i = 20; i <= 40; i++) {
        //        System.out.println(i);

        //תרגיל 2

        //for (int i = 0; i < 10000 ; i+=100) {
        //    System.out.println(i);

        // תרגיל 3

        //  System.out.println("please entar NUM");
        //  int NUM = scanner.nextInt();
        //  for (int  i = 0 ; i<NUM ; i++ ){
        //      System.out.println("DAMMMMMMMMMM WE GOT IT");

        // תרגיל 4 (אתגר )
        /*

       System.out.println("please enter number");
        int x = scanner.nextInt(); //25
        int newnum = 0;
        int ahdot = 0;
        for ( int i = x ; i>0 ; i=i/10){
            newnum = newnum * 10; // 0
            ahdot = x % 10 ;  // 5
            x = x /10 ;  // 2
            newnum = newnum + ahdot ; // לשאול את חודי למה בעצם מדפיסים את הnewnum ולא את המשתנה
            System.out.println(newnum);
            */

        // תרגיל 5

        //  int x = 5;
        //  while (x<75){
        //      System.out.println(x);
        //      x++ ;


        // תרגיל 6
        //   System.out.println("please enter a num");
        // int x = scanner.nextInt();

        //  while ( x != 133 ) {
        //    System.out.println("please enter a num");
        //  x = scanner.nextInt();}

        //   System.out.println("done");

        //תרגיל 7
        //  int c = 5 ;
        // int sum = 0 ;
        //   while ( c<=10) {
        //     sum = sum + c;
        //      c++;
        //   }
        //   System.out.println(sum);

        // תרגיל 8 אתגר

        //    System.out.println("please enter a num");
        //   int x = scanner.nextInt();
        //   int counter = 0 ;
        //    while ( x != 133 ) {
        //     System.out.println("please enter a num");
        //     x = scanner.nextInt();
        //    counter++;

        //  }
        //    System.out.println("done " + counter);


        // שיעור 31/6
        // תרגיל 1 - תוכנית שמקבלת 10 מספרים מהמשתמש ושומרת אותם במערך אחד ומדפיסה אותם
/*
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }for (int i = 0 ; i < 10 ; i++){
            System.out.println(numbers[i]);
            // System.out.println(Arrays.toString(numbers));
*/
        // תרגיל 2 - תוכנית שמקבלת מהמשתמש 5 מספרים ואחרכך מבקשת מהמשתמש מספר נוסף ובודקת אם המספר נמצא במערך
        /*
        int [] numbers = new int[5];
        for ( int i = 0 ; i <5 ; i++) {
            numbers[i] = scanner.nextInt();

        int c = scanner.nextInt();
        if  ( c == numbers[i] ){
            System.out.println("we found ");
        }

    }
        */
        //  תרגיל 3 - קוד שסוכם את המערך של תרגיל 1
/*
        int[] numbers = new int[10];
        int sum =0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }for (int i = 0 ; i < 10 ; i++) {
            sum = sum + numbers[i];
            System.out.println(sum);
       }
        System.out.println(Arrays.toString(numbers)); //////    ידפיס לי את המערך בצורה כזו [10 , 4 , 9 , 5 ]

        */

















}








}


















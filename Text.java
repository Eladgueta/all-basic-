import java.util.Locale;

public class Text {

    public static void main(String[] args) {

        String s1= "elad gueta";


        System.out.println(s1.toUpperCase(Locale.ROOT));      // מחזיר לי את הטקסט באותיות גדולות
        System.out.println(s1.toLowerCase(Locale.ROOT));     //מחזיר לי את הטקטסט באותיות קטנות
        System.out.println(s1.length());            //מחשב לי את הכמות תווים
        System.out.println(s1.charAt(3));      // יחזיר לי את האות שנמצאת במקום המסוים "3"
        System.out.println(s1.indexOf("and"));    // מחזיר לי את המיקום של המילה או האות  (אם אין יחזיר -1)
        System.out.println(s1.replace('a','c'));  // מחליף לי אות אחת באות אחרת

    }


}

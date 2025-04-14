import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {// Array of strings
        Date d = new Date(0);
        char c = 'A'; // A SINGLE LETTER, NUMBER OR SYMBOL LIKE A DOLLAR SIGN OR SPACE
        String fullName = "Bemi Hai";// string is a collection of charachter simmilar ro an array
        String[] fruit = {"Orange","Banana","Apple"};// An array ("list) or string


        System.out.println(d);
        System.out.println(c);
        System.out.println(fullName);
       // System.out.println(fruit[0] + (fruit[1] + (fruit[2] + (fruit[3]);
        System.out.println(fruit.length); //show length property


        int i =0;
        for (String f : fruit){
            System.out.println(f);
            //i++;

      //  for(int i = 0; i < fruit.length; i++) { // i = i + i
            //0,1,2,x
            System.out.println(i + fruit[i]);
        }
        System.out.println("All Done");
    }
    }
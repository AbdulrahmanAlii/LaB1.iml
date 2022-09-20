
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){

        //Q1
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter number the first number :");
//        int a= sc.nextInt();
//        System.out.print("Enter number the second number :");
//        int b= sc.nextInt();
//        System.out.println("The largest number of the two numbers is " + Math.max(a,b));

        //q2
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the radius to calculate the area of the circle :");
//        float a= sc.nextFloat();
//        double pi = 3.14;
//        double area = pi * a * a;
//
//        System.out.println("The area of the circle is  " + area);

        //q3
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter nuumber to covert it to hexa octa and binary :");
//        int a= sc.nextInt();
//        String hexa = Integer.toHexString(a);
//        System.out.println("HexaDecimal Value is : " + hexa);
//        String octal = Integer.toOctalString(a);
//        System.out.println("Octal Value is : " + octal);
//        String binary = Integer.toBinaryString(a);
//        System.out.println("Binary Value is : " + binary);

        //q4
//           Scanner sc= new Scanner(System.in);
//           System.out.print("Enter Word to reverse it :");
//           String a= sc.nextLine();
//           String nstr="";
//           char ch;
//
//
//         for (int i=0; i<a.length(); i++)
//                {
//                    ch= a.charAt(i);
//                    nstr= ch+nstr;
//                }
//                System.out.println("Orginal word: "+ a);
//                System.out.println("Reversed word: "+ nstr);

        //q5

//           Scanner sc= new Scanner(System.in);
//           System.out.print("Enter Word to check if it is a palindrome or not :");
//           String a= sc.nextLine();
//
//        if(isPalindrome(a))
//        {
//            System.out.println(a+" is a palindrome string");
//        }
//        else
//        {
//            System.out.println(a+" is not a palindrome string");
//        }

        // q6
//            Scanner sc= new Scanner(System.in);
//           System.out.print("Enter Word  :");
//           String a= sc.nextLine();
//           a= a.replace("e","a");
//           System.out.print("Result :" + a);

           // ctrl + alt +m used to extract the code to outside method
         // or you can selet the part of the code then refactor at the top menu >> extract this >> method

        // q7

        Scanner sc= new Scanner(System.in);
           System.out.print("Enter Word  :");
           String a= sc.nextLine();

           shuffle(a);

           // alt + insert going to allow u to do the getter and setter and the constructor too
















    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }
}



package Main;

// Imports the Hash Map Functionality into Java
import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

// Allows the user to input
import java.util.Scanner;

public class TalkyNumbersMain
{
    public static void main(String[] args) {

        // Declaring the HashMap information.
        HashMap<Integer, String> Num = new HashMap<>();
        // Declaring Input
        Scanner sc = new Scanner(System.in);

        // Declaring the variable of the input to String
        String number = sc.nextLine();

        // Declaring the values within the hash maps
        Num.put(1, "One");
        Num.put(2, "Two");
        Num.put(3, "Three");
        Num.put(4, "Four");
        Num.put(5, "Five");
        Num.put(6, "Six");
        Num.put(7, "Seven");
        Num.put(8, "Eight");
        Num.put(9, "Nine");
        Num.put(10, "Ten");
        Num.put(11, "Eleven");
        Num.put(12, "Twelve");
        Num.put(13, "Thirteen");
        Num.put(14, "Fourteen");
        Num.put(15, "Fifteen");
        Num.put(16, "Sixteen");
        Num.put(17, "Seventeen");
        Num.put(18, "Eighteen");
        Num.put(19, "Nineteen");
        Num.put(20, "Twenty");
        Num.put(30, "Thirty");
        Num.put(40, "Fourty");
        Num.put(50, "Fifty");
        Num.put(60, "Sixty");
        Num.put(70, "Seventy");
        Num.put(80, "Eighty");
        Num.put(90, "Ninety");
        Num.put(100, "One Hundred");
        Num.put(1000, "One Thousand");
        Num.put(1000000, "One Million");

        // Converting variable to a string
        String s1 = number;

        // Declaring what each variable is
        int Single = -1;
        int Tens = -1;
        int Hundred = -1;
        int Thousand = -1;
        int TensThousand = -1;
        int HunThousand = -1;
        int Million = -1;
        int TenMillion = -1;
        int HunMillion = -1;

        // Checks if user entered certain numbers
        if (Integer.parseInt(s1) == 100)
        {
            System.out.print("One Hundred");
        }
        else if (Integer.parseInt(s1) == 1000)
        {
            System.out.println("One Thousand");
        }
        else if (Integer.parseInt(s1) == 10000)
        {
            System.out.println("Ten Thousand");
        }
        else if (Integer.parseInt(s1) == 100000)
        {
            System.out.println("One Hundred Thousand");
        }
        else if (Integer.parseInt(s1) == 1000000)
        {
            System.out.print("One Million");
        }
        else if (Integer.parseInt(s1) == 10000000)
        {
            System.out.println("Ten Million");
        }
        else if (Integer.parseInt(s1) == 100000000)
        {
            System.out.println("One Hundred Million");
        }

        // Checks if the number is greater or less than certain numbers to output certain information
        else if (Integer.parseInt(s1) < 10)
        {
            // Gathering single digit information
            Single = Integer.parseInt(s1.substring(0, 1));
        }
        else if (Integer.parseInt(s1) >= 10 && Integer.parseInt(s1) < 100)
        {
            // Gathering double digit information
            Tens = Integer.parseInt(s1.substring(0, 1)) * 10;
            Single = Integer.parseInt(s1.substring(1, 2));
        }
        else if (Integer.parseInt(s1) > 100 && Integer.parseInt(s1) < 1000)
        {
            // Gathering triple digit information
            Hundred = Integer.parseInt(s1.substring(0, 1));
            Tens = Integer.parseInt(s1.substring(1, 2)) * 10;
            Single = Integer.parseInt(s1.substring(2, 3));
        }
        else if (Integer.parseInt(s1) > 1000 && Integer.parseInt(s1) < 10000)
        {
            // Gathering quadruple digit information
            Thousand = Integer.parseInt(s1.substring(0, 1));
            Hundred = Integer.parseInt(s1.substring(1, 2));
            Tens = Integer.parseInt(s1.substring(2, 3)) * 10;
            Single = Integer.parseInt(s1.substring(3, 4));
        }
        else if (Integer.parseInt(s1) > 10000 && Integer.parseInt(s1) < 100000)
        {
            // Gathering quintuple digit information
            TensThousand = Integer.parseInt(s1.substring(0, 1)) * 10;
            Thousand = Integer.parseInt(s1.substring(1,2));
            Hundred = Integer.parseInt(s1.substring(2, 3));
            Tens = Integer.parseInt(s1.substring(3, 4)) * 10;
            Single = Integer.parseInt(s1.substring(4, 5));
        }
        else if (Integer.parseInt(s1) > 100000 && Integer.parseInt(s1) < 1000000)
        {
            // Gathering sextuple digit infromation
            HunThousand = Integer.parseInt(s1.substring(0,1));
            TensThousand = Integer.parseInt(s1.substring(1, 2)) * 10;
            Thousand = Integer.parseInt(s1.substring(2,3));
            Hundred = Integer.parseInt(s1.substring(3, 4));
            Tens = Integer.parseInt(s1.substring(4, 5)) * 10;
            Single = Integer.parseInt(s1.substring(5, 6));
        }
        else if (Integer.parseInt(s1) > 1000000 && Integer.parseInt(s1) < 10000000)
        {
            // Gathering septuple  digit infromation
            Million = Integer.parseInt(s1.substring(0,1));
            HunThousand = Integer.parseInt(s1.substring(1,2));
            TensThousand = Integer.parseInt(s1.substring(2, 3)) * 10;
            Thousand = Integer.parseInt(s1.substring(3,4));
            Hundred = Integer.parseInt(s1.substring(4, 5));
            Tens = Integer.parseInt(s1.substring(5, 6)) * 10;
            Single = Integer.parseInt(s1.substring(6, 7));
        }
        else if (Integer.parseInt(s1) > 10000000 && Integer.parseInt(s1) < 100000000)
        {
            // Gathering octuple digit information
            TenMillion = Integer.parseInt(s1.substring(0,1)) * 10;
            Million = Integer.parseInt(s1.substring(1,2));
            HunThousand = Integer.parseInt(s1.substring(2,3));
            TensThousand = Integer.parseInt(s1.substring(3, 4)) * 10;
            Thousand = Integer.parseInt(s1.substring(4,5));
            Hundred = Integer.parseInt(s1.substring(5, 6));
            Tens = Integer.parseInt(s1.substring(6, 7)) * 10;
            Single = Integer.parseInt(s1.substring(7, 8));
        }
        else if (Integer.parseInt(s1) > 100000000 && Integer.parseInt(s1) < 1000000000)
        {
            // Gathering nonuple digit information
            HunMillion = Integer.parseInt(s1.substring(0,1));
            TenMillion = Integer.parseInt(s1.substring(1,2)) * 10;
            Million = Integer.parseInt(s1.substring(2,3));
            HunThousand = Integer.parseInt(s1.substring(3,4));
            TensThousand = Integer.parseInt(s1.substring(4, 5)) * 10;
            Thousand = Integer.parseInt(s1.substring(5,6));
            Hundred = Integer.parseInt(s1.substring(6, 7));
            Tens = Integer.parseInt(s1.substring(7, 8)) * 10;
            Single = Integer.parseInt(s1.substring(8, 9));
        }

        // Checks if their are any variables being used
        if (Num.containsKey(HunMillion))
        {
            // Outputs variables using the hash Map ( Including some text manipulation for punctuation)
            System.out.print(Num.get(HunMillion) + " Hundred And ");
        }
        if (Num.containsKey(TenMillion))
        {
            System.out.print(Num.get(TenMillion) + "-");
        }
        if (Num.containsKey(Million))
        {
            System.out.print(Num.get(Million) + " Million, ");
        }
        if (Num.containsKey(HunThousand))
        {
            System.out.print(Num.get(HunThousand) + " Hundred And ");
        }
        if (Num.containsKey(TensThousand))
        {
            System.out.print(Num.get(TensThousand) + "-");
        }
        if (Num.containsKey(Thousand))
        {
            System.out.print(Num.get(Thousand) + " Thousand, ");
        }
        if (Num.containsKey(Hundred))
        {
            System.out.print(Num.get(Hundred) + " Hundred And ");
        }
        if (Num.containsKey(Tens))
        {
            System.out.print(Num.get(Tens) + "-");
        }
        if (Num.containsKey(Single))
        {
            System.out.print(Num.get(Single));
        }
    }
}

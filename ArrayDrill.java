import java.util.Scanner;

public class ArrayDrill  {

public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

String[] array = new String[5];

for (int counter = 0; counter < array.length; counter++)   {
	System.out.println("Enter name: ");
         String name = input.nextLine();
           array[counter] = name;
      }

 for (int counter = 0; counter < array.length; counter++)  {
       System.out.println(array[counter]);
        }

}

}


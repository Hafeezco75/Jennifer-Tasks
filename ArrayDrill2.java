import java.util.Scanner;

public class ArrayDrill2  {

public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

String[] names = new String[5];

int[] grades = new int[5];

for (int counter = 0; counter < 5; counter++)   {
	System.out.print("Enter Student name: ");
         String name = input.nextLine();
          names[counter] = name;

     System.out.println("Enter student grade: ");
       int grade = input.nextInt();
	grades[counter] = grade;
     }

   for (int counter = 0; counter < 5; counter++)  {
      System.out.printf(" %n%n", names[counter]);
      System.out.printf(" %n%n", grades[counter]);
     }


}

}


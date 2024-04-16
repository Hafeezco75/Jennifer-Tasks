import java.util.Scanner;

public class ArrayDrill1  {

public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

int[] Age = new int[5];

for (int counter = 0; counter < 4; counter++)  {

    System.out.println("Enter age: ");
      int number = input.nextInt();
      Age[counter] = number;
   }

 for (int counter =0; counter < 4; counter++)  {
      System.out.println(Age[counter]);
    }

}

}
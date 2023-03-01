import java.util.Scanner;

public class Strings {
	
//--------------------------------------------- 
// Reads in an array of integers, sorts them, 
// then prints them in sorted order.
//--------------------------------------------- 
public static void main (String[] args) {
	String[] stringList;
	int size;

	Scanner scan = new Scanner (System.in);

	System.out.print ("\nHow many strings do you want to sort? ");
	size = scan.nextInt();
	scan.nextLine();        //read over the end of line

	stringList = new String[size];

	System.out.println ("\nEnter the strings...");
	for (int i = 0; i < size; i++)
	    stringList[i] = scan.nextLine();

	Sorting.insertionSort(stringList);

	System.out.println ("\nYour strings in sorted order...");
	for (int i = 0; i < size; i++)
	    System.out.println(stringList[i] + "  ");
	System.out.println ();
	
	scan.close();
    }
}
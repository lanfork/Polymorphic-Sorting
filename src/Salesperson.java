// ******************************************************* 
// Salesperson.java
//
// Represents a sales person who has a first name, last
// name, and total number of sales.
// ******************************************************* 
public class Salesperson implements Comparable {
	private static final char other = 0;
	private String firstName, lastName;
	private int totalSales;
	
//------------------------------------------------------ 
// Constructor: Sets up the sales person object with
// the given data.
//------------------------------------------------------ 
public Salesperson (String first, String last, int sales) {
	firstName = first;
	lastName = last;
	totalSales = sales;
} 

//------------------------------------------- 
// Returns the sales person as a string.
//------------------------------------------- 
public String toString() {
	return lastName + ", " + firstName + ": \t" + totalSales;
} 

//------------------------------------------- 
// Returns true if the sales people have
// the same name.
//------------------------------------------- 
public boolean equals (Object other) {
	return (lastName.equals(((Salesperson)other).getLastName()) && 
			firstName.equals(((Salesperson)other).getFirstName()));
} 

//-------------------------------------------------- 
// Order is based on total sales with the name
// (last, then first) breaking a tie.
//-------------------------------------------------- 
//////////////////////////////////////////////////////////////
public int compareTo(Object other) {
	int result = 0;
			
	String last = ((Salesperson) other).getLastName();
	String first = ((Salesperson) other).getFirstName();
	int otherSales = ((Salesperson) other).getSales();
	
	if(totalSales > otherSales) {
		result = -1;
	} else if(totalSales > otherSales) {
		result = 1;
	} else
		if(lastName.equals(last)){
			result = firstName.compareTo(first);
		} else {
			result = lastName.compareTo(last);
		}
	return result;
}

//------------------------- 
// First name accessor. 
//------------------------- 
public String getFirstName() { 
//Chapter 10: Polymorphism 187
	return firstName;
} 

//------------------------- 
// Last name accessor. 
//------------------------- 
public String getLastName() { 
	return lastName;
} 

//------------------------- 
// Total sales accessor. 
//------------------------- 
public int getSales() {
	return totalSales;
	} 

}

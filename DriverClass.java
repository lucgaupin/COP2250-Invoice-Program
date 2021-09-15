/*
 * BY...: LUC GAUPIN
 * CLASS: COP2250
 * ASSIG: MODULE 4
 * PROFE: PROFESSOR PISANO
 * PURPO: THIS PROGRAM IS GOING TO TAKE USER INPUT FROM USER, STORE IT IN PRIVATE VARIABLES IN DIFFERENT JAVA FILES
 * AND THEN IT WILL TAKE THAT INFORMATION AND OUTPUT IT IN A NICELY SETUP INVOICE
 */

import java.util.Scanner;

// MAIN DRIVERCLASS() THATS GOING TO RUN ALL THE CODE
public class DriverClass {

	// MAIN() METHOD
		@SuppressWarnings("resource")
		public static void main(String[] args) {
		
		// CREATES SCANNER CLASS
		Scanner in = new Scanner(System.in);
		
		// THIS IS GETTING ALL THE INFORMATION IN ORDER TO CREATE THE INVOICE SUCH AS STUDENT NAME/ STUDENT AGE/ AND HOW MANY HOURS THE TEACHER WORKED TODAY
		System.out.println("STUDENT - Enter Students Name: ");
		String studentName = in.nextLine();
		
		System.out.println("STUDENT - Enter Students Age: ");
		int studentAge = in.nextInt();
		
		System.out.println("TEACHER - Enter Hours Worked Today: ");
		int hoursTaught = in.nextInt();
		
		System.out.println("TEACHER - Enter rate: ");
		float hourlyRate = in.nextFloat();
		
		// INSTANTIATES STUDENT CLASS IN ORDER TO HAVE ACCESS TO ALL THE FIELDS IN THE STUDENT() CLASS IN THE STUDENT.JAVA FILE
		Student st = new Student(studentName, hoursTaught);
		// INSTANTIATES TEACHER CLASS IN ORDER TO HAVE ACCESS TO ALL THE FIELDS IN THE TEACHER() CLASS IN THE TEACHER.JAVA FILE
		Teacher te = new Teacher();
		// INSTANTIATES BILL CLASS IN ORDER TO HAVE ACCESS TO ALL THE FIELDS IN THE BILL() CLASS IN THE BILL.JAVA FILE
		Bill bi = new Bill(hourlyRate);
		
		// THIS SETS THE AMOUNT OF HOURS THE TEACHER WORKED
		te.setHoursTaught(hoursTaught);
		
		// THIS CALCULATES THE AMOUNT OF HOURS THE TEACHER HAS LEFT TO TEACH DURING THE WEEK
		double hoursLeft = (te.getMaxHours() - hoursTaught);
			if(hoursLeft < 0) {
				System.out.println("TUTOR HAS 0 HOURS LEFT THIS WEEK");
			}
			else {
				System.out.println("\nTUTOR HAS " + hoursLeft + " HOURS LEFT THIS WEEK.");
			}
		
		// THIS CALCULATES THE FINAL AMOUNT DUE
		double amountDue = (hoursTaught * hourlyRate);
		
		// THIS CHECKS TO SEE IF THE USER IS < 4YRS OLD, IF SO A 20% DISCOUNT IS APPLIED.
		if(studentAge < 10) {
			double discountAmount = amountDue * 0.20;
			amountDue = (amountDue - discountAmount);
			System.out.println("You get a 20% discount!\n");
		}
		
		// ERROR HANDLING. THIS CHECKS TO MAKE SURE THE USER WONT PUT IN A NUMBER LESS THAN 0, IF IT DOES IT'LL THROW AN ERROR AND TERMINATE THE PROGRAM
		if(hoursTaught < 0) {
			System.out.println("!! ERROR !! You can't have a number less than 0.");
			System.out.println("!! ERROR !! Please RE-RUN the program.\n");
			return;
		}
		
		// BELOW IS GOING TO BE THE OUTPUT FOR THE INVOICE! 
		System.out.println("\n\n============= INVOICE =============");
		System.out.println(st.toString());
		System.out.println(te.toString());
		System.out.printf("Rate per/hr.: $%.2f\n", + bi.getHourlyRate());
		System.out.printf("AMOUNT DUE..: $%.2f\n", + amountDue);
		System.out.println("===================================");
	}
}

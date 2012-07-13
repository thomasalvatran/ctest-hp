import java.io.*;
import java.util.*;
public class Array4 {
    public static void main(String args[]) throws Exception {
	String firstName;
     	String lastName;
            double weeklyHours;
	double hourlySalary;
	
//	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
      try {
//             if (args == null || args.length == 0)
//              throw new Error("Name is required"); 
	firstName    = args[0];	
            lastName     = args[1];
            weeklyHours  = Double.parseDouble(args[2]);
	hourlySalary = Double.parseDouble(args[3]);
	 
          } 
          catch (Exception e) { System.out.printf("Enter firstname, lastname, WeeklyHours, Rate \n" + "error: " + e +"\n"); return;}
          catch (Error e) { System.out.printf("error: " + e +"\n"); return; } //never catch no throw Error
	String fullName = lastName + ", " + firstName;
	double weeklySalary = weeklyHours * hourlySalary;

	System.out.println("Employee Payroll");
	System.out.printf("Full Name:     %s\n", fullName);
	System.out.printf("Weekly Salary: %.2f\n", weeklySalary);
    }
}

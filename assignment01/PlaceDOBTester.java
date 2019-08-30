package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PlaceDOBTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth person1 = new DateAndPlaceOfBirth( 8, 8, 2000, "Cornwall", "New York", "United States");
    DateAndPlaceOfBirth person2 = new DateAndPlaceOfBirth( 2, 2, 1999, "San Diego", "California", "United States");
    DateAndPlaceOfBirth person3 = new DateAndPlaceOfBirth( 1, 9, 1995, "New York", "New York", "United States");
    DateAndPlaceOfBirth person4 = new DateAndPlaceOfBirth( 7, 10, 2001, "London", "England");
    DateAndPlaceOfBirth person5 = new DateAndPlaceOfBirth( 9, 3, 2003, "Madrid", "Spain");

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);
    System.out.println(person4);
    System.out.println(person5);

    System.out.println(person1.hasSameBirthDayAs(person2));
    System.out.println(person1.hasSameBirthDateAs(person2));
    System.out.println(person1.olderThan(person2));
    System.out.println(person1.youngerThan(person2));

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}




  }

}

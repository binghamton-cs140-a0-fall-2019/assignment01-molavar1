package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
  DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth( 2, 2, 1999, "San Diego", "California", "United States");
  StreetUSAddress address1 = new StreetUSAddress("14 Trolly Drive", "Box 12", "Newburgh","NY","12462" );
  Person myPerson = new Person("Casey", "Gribben", 232-393-5688, dob1, address1 );

  try(var output =new PrintWriter(new FileOutputStream(
        new File("output.txt"), true /* true means append to file */))) {
    output.println("\nTESTS FOR Person.java:");

  //Copy all your lines above, add an extra "2" to every variable name
  // and replace every System.out.print or System.out.println
  // by output.print or output.println
  } catch (FileNotFoundException e) {
    e.printStackTrace();
  }
}

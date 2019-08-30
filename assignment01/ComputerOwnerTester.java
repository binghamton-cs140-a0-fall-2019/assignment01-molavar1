package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class ComputerOwnerTester(){
  DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth( 2, 2, 1999, "San Diego", "California", "United States");
  StreetUSAddress address1 = new StreetUSAddress("14 Trolly Drive", "Box 12", "Newburgh","NY","12462" );
  Person myPerson = new Person("Casey", "Gribben", 232-393-5688, dob1, address1 );
  ComputerOwner myOwner = new ComputerOwner(myPerson);
  Computer comp1 = new Computer("HP", "i7",6,"500", true, 1000.00);
  Computer comp2 = new Computer("Dell", "i6",2,"400", false, 700.00);
  Computer comp3 = new Computer("Apple", "i8",4,"1100", true, 1200.00);
  Computer comp4 = new Computer("Lenvo", "i9",9,"1200", false, 1400.00);
  addComputer(comp1);
  addComputer(comp2);
  addComputer(comp3);
  addComputer(comp4);
  System.out.println(myOwner);
  removeComputer(0);
  removeComputer(1);
  System.out.println(myOwner);

  try(var output =new PrintWriter(new FileOutputStream(
        new File("output.txt"), true /* true means append to file */))) {
    output.println("\nTESTS FOR ComputerOwner.java:");

  //Copy all your lines above, add an extra "2" to every variable name
  // and replace every System.out.print or System.out.println
  // by output.print or output.println
  } catch (FileNotFoundException e) {
    e.printStackTrace();
  }
}

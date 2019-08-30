package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
  Computer comp1 = new Computer("HP", "i7",6,"500", true, 1000.00);
  Computer comp2 = new Computer("Dell", "i6",2,"400", false, 700.00);
  Computer comp3 = new Computer("Apple", "i8",4,"1100", true, 1200.00);
  Computer comp4 = new Computer("Lenvo", "i9",9,"1200", false, 1400.00);

  System.out.println(comp1);
  System.out.println(comp2);
  System.out.println(comp3);
  System.out.println(comp4);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package Person;
import javax.swing.text.Document;

import org.w3c.dom.ranges.DocumentRange;

public class Apllication {

	public static void main(String[] args) {
		try{
		Person osoba1 =new PersonBulider().withNr(34).bulid();
	    System.out.println(osoba1);
	}

		catch(Exception exc){
			System.err.println(exc.getMessage());
		}
}
}

	
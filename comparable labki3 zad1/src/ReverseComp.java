import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseComp implements Comparator<Integer> {

	public  int compare(Integer a, Integer b)
    {
        if(b>a)
           return 1;
        else if(b<a)
           return -1;
        return 0;
    }
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> tab=new ArrayList<Integer>();
		tab.add(4);
		tab.add(892);
		tab.add(-27);
		tab.add(3);
		tab.add(2);
		tab.add(-341);
		tab.add(4);
		tab.add(81);
		tab.add(-32);
		 System.out.println(tab);
		 Collections.sort(tab,new OddNumberComp());
		 System.out.println(tab);
	}
	//Collections.reverseOrder()
	

}


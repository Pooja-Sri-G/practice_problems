package practice_programs;
import java.util.*;


public class DuplicateCustomerDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] registeredCustomers = {"C101","C102","C103","C101","C104","C105","C103","C106"};

	    String[] todayPurchases = {"C101", "C103", "C107", "C108"};
	    
	    Set<String> duplicates = new HashSet<>();
	    Set<String> customers = new HashSet<>();
	    
	    for(String s:registeredCustomers) {
	    	if(!customers.add(s)) {
	    		duplicates.add(s);
	    	}
	    }
	    
        Set<String> result = new HashSet<>();

        for (String s : todayPurchases) {
            if (duplicates.contains(s)) {
                result.add(s);
            }
        }

        System.out.println(result);
	        
	}

}

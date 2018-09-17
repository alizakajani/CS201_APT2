import java.util.Arrays;
import java.util.HashSet;

public class Starter {
	public int begins(String[] words, String first) {
		HashSet<String> set = new HashSet<>(Arrays.asList(words));
		int count = 0;
		for(String s : set) {
        	if(s.charAt(0) == first.charAt(0)) {
        		count += 1;
        	}
        }
        return count;
    }
}

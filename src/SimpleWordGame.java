import java.util.*;

public class SimpleWordGame {
	public int points(String[] player, String[] dictionary) {
	HashSet<String> set = new HashSet<>(Arrays.asList(player));
	HashSet<String> dict = new HashSet<>(Arrays.asList(dictionary));
	set.retainAll(dict);
	int ret = 0;
	for(String s : set) {
		ret += s.length()*s.length();
	}
	return ret;
	}
}

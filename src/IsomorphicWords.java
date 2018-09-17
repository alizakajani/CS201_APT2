import java.util.*;


public class IsomorphicWords {
	
	public int countPairs(String[] words) {
        
		int total = 0;
        
        for(int j = 0; j < words.length; j += 1) {
        	String jword = iso(words[j]);
        	for(int k = j + 1; k < words.length; k += 1) {
        		String kword = iso(words[k]);
        		if(jword.equals(kword)) {
        			total += 1;
        		}
        	}
        }
        return total;
     }
	
	char[] dict = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private String iso(String word) {
		char[] chars = word.toCharArray();
		HashMap<Character, Character> charMap = new HashMap<>();
		for(int k = 0; k < word.length(); k += 1) {
			if(! charMap.containsKey(chars[k])) {
				charMap.put(chars[k], dict[k]);
			}
			if(charMap.containsKey(chars[k])) {
				chars[k] = charMap.get(chars[k]);
			}
		}
		String isoWord = new String(chars);
		return isoWord;
	}

}


public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
        
		int[] hCount = new int[26];
        
		for(String s : headlines) {
			s = s.toLowerCase();
			for(char ch : s.toCharArray()) {
				hCount[ch] += 1;
			}
		}
		
		for(String m : messages) {
			m = m.toLowerCase();
			int[] mCount = new int[26];
			boolean a = true;
			for(char ch : m.toCharArray()) {
				mCount[ch] += 1;
			}
			for(int k = 0; k < 256; k++) {
				if(mCount[k] > hCount[k]) {
					a = false;
				}
			}
		}
		
        return 0;
  }
}

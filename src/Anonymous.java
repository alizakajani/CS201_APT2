
public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
        int total = 0;
        boolean a = true;
		int[] counts = new int[256];
		for(String s : headlines) {
			for(char ch : s.toLowerCase().toCharArray()) {
				if(ch == ' ') continue;
				counts[ch] += 1;
			}
		}
		
		for(String m : messages) {
			int[] mcounts = new int[256];
			a = true;
			for(char ch : m.toLowerCase().toCharArray()) {
				if(ch == ' ') continue;
				mcounts[ch] += 1;
			}
			for(char ch : m.toLowerCase().toCharArray()) {
				if(mcounts[ch] <= counts[ch]) continue;
				else if(mcounts[ch] > counts[ch]) {
					a = false;
				}
			}
			if(a == true) {
				total += 1;
			}
		}
		
        return total;
  }
}

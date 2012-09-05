
public class Trie {

	long address;
	Trie[] children = new Trie[29];

	public Trie(int next){
		next--;
		for (int i = 0; i < 29; i++){

			if (next >= 0) {
				children[i] = new Trie(next);
			}
			else {
				children[i] = null;
			}
		}
	}
	/**
	 * Test
	 */
	public static void main(String[] args){		
	Trie test = new Trie(3);
	test.children[2].children[2].children[2].address = 4266;
	System.out.println(test.children[2].children[2].children[2].address);
	
	
	}
	/**
	 * setAddress sŠtter adressen pŒ plats [first second third] till adress-parametern.
	 * 
	 */
	public void setAddress(Trie trie, int first, int second, int third, int address){
		trie.children[first].children[second].children[third].address = address;
	}
	public void setAddress(Trie trie, int first, int second, int address){
		trie.children[first].children[second].address = address;
	}
	public void setAddress(Trie trie, int first, int address){
		trie.children[first].address = address;
	}

	/**
	 * getAddress metoderna returnerar en address
	 */
	public long getAddress(Trie trie, int first, int second, int third){
		return trie.children[first].children[second].children[third].address;
	}
	public long getAddress(Trie trie, int first, int second){
		return trie.children[first].children[second].address;
	}
	public long getAddress(Trie trie, int first){
		return trie.children[first].address;
	}
	
}

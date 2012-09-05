
public class WordData {
	
	private long indexRowPtr = 0;
	private int nrOfOccurences = 0;
	
	WordData(long row) {
		
		indexRowPtr = row;
	}
	
	void countOccurence() {
		
		nrOfOccurences++;
	}
	
	void setIndexRowPtr(long row) {
		
		indexRowPtr = row;
	}
	
	long getIndexRowPtr() {
		
		return indexRowPtr;
	}
	
	int getNrOfOccurences() {
		
		return nrOfOccurences;
	}

}

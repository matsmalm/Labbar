import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class BuildIndexes {
	
	BuildIndexes() {
		
	}
	
	public void Tokenize(BufferedReader fin) {
		
		Map<String, WordData> wordmap = new HashMap<String, WordData>();
		long korpusWordPtr = 0;
		
		String token = null; /* aktuellt ord från korpus */
		
		/* För varje ord i korpus */
		
		/* Om ordet finns */
		wordmap.containsKey(token);
		WordData tempwd = (WordData) wordmap.get(token);
		tempwd.countOccurence();
		AddPtrIndex(tempwd.getIndexRowPtr(), korpusWordPtr);
		
		/* Om ordet inte finns */
		WordData wd = new WordData(AddPtrIndexRow(korpusWordPtr));
		wordmap.put(token, wd);
		
		/* När hela korpus gåtts igenom */
		writeWordIndex(wordmap);
		
		/* Görs sist. */
		populateAndWriteTrie(wordmap);
	}
	
	/* Lägg till en ny rad i PtrIndex för en ny tokens korprpuspekare 
	 * skriv första pekaren och returnera radnumret! */
	private long AddPtrIndexRow(long korpusWordPointer) {
		
		long ptrIndexRow = 0;
		
		/* Implementera */
		
		return ptrIndexRow;
	}
	
	/* Skriv ytterligare en korpuspekare på rätt rad i PtrIndex */
	private void AddPtrIndex(long indexRowPtr, long korpusWordPtr) {
		
		/* Implementera */
		
	}
	
	/* Skriver ut ordindexet från Hashmapen med tokens. 
	 * Varje rad består av "token nrOcOccurences ptrIndexRowPtr*/
	private void writeWordIndex(Map<String, WordData> wordmap) {
		
	}

	/* Gå igenom Hashmapen och bygg trien från denna med pekare in i WordIndex */
	private void populateAndWriteTrie(Map<String, WordData> wordmap) {
		
		Trie trie = new Trie(3);
		
		/* Implementera */
		
	}
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Index {
	
	public static void main(String[] args) throws IOException {
		
		/* Tidtagning, starta */
		Stopwatch sw = new Stopwatch();
		sw.start();
		
		BufferedReader fin = new BufferedReader(new FileReader(args[0]));
		
		BuildIndexes bi = new BuildIndexes();
		bi.Tokenize(fin);
		
		/* Tidtagning, stoppa och skriv ut. */
		sw.stop();
		System.out.println(sw);

		/* Testa lite med strängar, läsning och scanner */
		/*
		String line = fin.readLine();
		System.out.println(line);
		// ptr += line.getBytes("ISO-8859-1").length;
		
		Scanner sc = new Scanner(line);
		
		System.out.println("ptr: " + ptr);
		
		while(sc.hasNext()) {
			String token = sc.next().toString();
			System.out.println(token);
			ptr+=(Integer) (token.getBytes("ISO-8859-1").length);
			System.out.println("ptr: " + ptr);
		}
		*/
		
	}

}

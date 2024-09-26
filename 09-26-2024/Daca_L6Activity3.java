package September26;

public class Daca_L6Activity3 {

	public static void main(String[] args) {
		String sentence = "Guitar is my favorite musical instrument",
		       searchWord = "mus";
		System.out.println(searchIndex(searchWord, sentence.split(" ")));
	}
	
	public static int searchIndex(String search, String[] sentence) {	
		for(int i = 0; i < sentence.length; i++) {		
			if(sentence[i].contains(search)) {		
				return i + 1;		
			}	
		}
		return -1;
	}
}

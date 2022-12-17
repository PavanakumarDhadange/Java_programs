package javaprograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountWordsInString {

	static final String str = "This is  the new		 java program that has the capability to calculate the word count";
	static final Map<String, Integer> wordCountReport = new TreeMap<String, Integer>();
	
	public static void main(String[] args) {
		
		String[] words = str.split(" ");
		
		for(String word: words) {
			String wordLowerCase = word.toLowerCase().trim();
			if(!wordLowerCase.equals("")) {		//To eliminate empty entries in map
				if(wordCountReport.containsKey(wordLowerCase))
					wordCountReport.put(wordLowerCase, wordCountReport.get(wordLowerCase)+1);
				else
					wordCountReport.put(wordLowerCase, 1);
			}
		}
				
		System.out.println("Word Count List");
		for(Entry<String, Integer> entry: wordCountReport.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	
}

package snippet;

public class morestringpractice {
	
	public void one(String word) {
		
		String firstTwo = word.substring(0, 2);
		String lastTwo = word.substring(word.length()-2); 
		
		if (firstTwo.equals(lastTwo)) {
			System.out.println("yes");
		}
		
		else {
			System.out.println("no");
		}
	}
	
	public void numWords(String sentence) {
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				count ++;
			}
		}
		System.out.println(count+1);
	}
	
	public void withoute(String word) {
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == 'e') {
				word = word.substring(0, i) + word.substring(i+1);
			}
			
			System.out.println(word);
			
		}
		
	}
	
	public void block(String word) {
		
		int max = 0;
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == word.charAt(i+1)) {
				max ++;
			}
			
			System.out.println(max+1);
			
		}
		
	}
	
	public void palindrome (String words) {
		
		String word = "";
		
		for (int i = words.length()-1; i >= 0; i--) {
			word += words.charAt(i);
		}
		
		if (word.equals(words)) {
			System.out.println("is palindrome");
		}
		
		else {
			System.out.println("is not palindrome");
		}
		
	}
	
	
	
	
	
	
}


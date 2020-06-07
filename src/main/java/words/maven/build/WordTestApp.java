package words.maven.build; 

import org.apache.commons.lang3.StringUtils; 

public class WordTestApp { 
	
	public WordTestApp() { } 

	public int countWords(String words) { 

		String[] separateWords = StringUtils.split(words, ' '); 

		return (separateWords == null) ? 0 : separateWords.length; 

	} 

}

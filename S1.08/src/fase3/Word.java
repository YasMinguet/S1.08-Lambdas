package fase3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Word implements Reverse{

	public String reverse(String str) {
		return Stream.of(str)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        }
	

	
}

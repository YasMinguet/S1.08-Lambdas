package fase3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		interfazFuncional iF = (valor) -> {
			return Stream.of(valor).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		};

		System.out.println(iF.reverse("Akira"));

	}

}

package fase1;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		part1();
		System.out.println("-------");
		part2();
		System.out.println("-------");
		part3();
		System.out.println("-------");
		part5();
		System.out.println("-------");

	}

	static void part1() {
		List<String> nameList = Arrays.asList("Andrea", "Beatriz", "Ana", "Javier", "amy");
		final List<String> startsWithA = nameList.stream().filter(name -> name.startsWith("A") && (name.length() == 3))
				.collect(Collectors.toList());
		startsWithA.forEach(x -> System.out.println(x));

	}

	static void part2() {
		List<Integer> list = Arrays.asList(1, 50, 63, 15, 28);
		System.out.println(getNumerosToString(list, 2, ", "));

	}

	static void part3() {
		List<String> names = Arrays.asList("Oro", "Plata", "Bronce", "Bronceado");
		List<String> oNames = names.stream().filter(name -> name.contains("o")).collect(Collectors.toList());
		oNames.forEach(s -> System.out.println(s));
		System.out.println("-------");
		part4(names);

	}

	static void part4(List<String> l) {
		List<String> result = l.stream().filter(name -> (name.length() > 5)).collect(Collectors.toList());
		result.forEach(s -> System.out.println(s));

	}

	static void part5() {
		List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");
		months.forEach(m -> System.out.println(m));
		System.out.println("-------");
		part6(months);
	}

	static void part6(List<String> m) {
		m.forEach(System.out::println);

	}

	static String getNumerosToString(List<Integer> llista, int divisible, String separator) {
		return llista.stream().map(n -> (n % divisible == 0) ? "e" + n : "o" + n)
				.collect(Collectors.joining(separator));
	}

}

package fase2;

public class App {

	public static void main(String[] args) {
		interfazFuncional iF = () -> 3.1415;

		System.out.println(iF.getPiValue());

	}
}

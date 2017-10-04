package controle.FizzBuzz;

public class App {

	public String fizzBuzz(int i) {
		String res = "";
		if (i == 0) {
			res="0";
		}else if (i % 3 == 0 && i % 5 == 0) {
				res = "fizz buzz";
		} else if (i % 3 == 0) {
				res = "fizz";
		} else if (i % 5 == 0) {
				res = "buzz";
		}
		 else 	res = "" + i;
		return res;

	}

}

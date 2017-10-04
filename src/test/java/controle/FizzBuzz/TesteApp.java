package controle.FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteApp{
	@Test
	public void test() {
	
		App app = new App();
		
		Assert.assertEquals("-1", app.fizzBuzz(-1));
		Assert.assertEquals("0", app.fizzBuzz(0));
		Assert.assertEquals("1", app.fizzBuzz(1));
		Assert.assertEquals("fizz", app.fizzBuzz(9));
		Assert.assertEquals("buzz", app.fizzBuzz(10));		
		Assert.assertEquals("fizz buzz", app.fizzBuzz(15));		
		
	}
}

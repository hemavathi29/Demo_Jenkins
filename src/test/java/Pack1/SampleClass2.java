package Pack1;

import org.testng.annotations.Test;

public class SampleClass2 {
	
	@Test
	public void test2() {
		String S1 = "Selenium";
		
		char c[] = S1.toCharArray();
		
		for (int i = c.length -1 ; i >= 0; i--) {
			System.out.print(c[i]);
		}
				
	}

}

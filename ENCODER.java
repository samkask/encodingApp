package encode64npn;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ENCODER {
	
	
	public static String encode (String input){
	
	byte[] value;
		
	value = input.getBytes(StandardCharsets.UTF_8);
	String encodedValue = Base64.getEncoder().encodeToString(value);
	//System.out.println(encodedValue); 
	
	return new String(encodedValue);
	
	}

	
	
}

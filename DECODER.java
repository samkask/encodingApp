package encode64npn;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DECODER {
	
	public static String decode (byte[] decodedValue) {
	
	decodedValue = Base64.getDecoder().decode("");
	System.out.println(new String(decodedValue, StandardCharsets.UTF_8));
	return new String(decodedValue, StandardCharsets.UTF_8);
	}

}

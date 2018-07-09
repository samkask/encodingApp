package encode64npn;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.xml.bind.DatatypeConverter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		GUIapp inst = new GUIapp();
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
		
	
		/*boolean ex = true;
		loop:
		while (ex) {
		
			
		Scanner reader = new Scanner(System.in);
		
		String n = reader.nextLine();
		if (n.equalsIgnoreCase("exit")) { 
			
			System.exit(0);
		} else {
		String encodedValue = ENCODER.encode(n);
		
		System.out.println(encodedValue);
		
		String decodedvalue = DECODER.decode(null);
		
		System.out.println(decodedvalue );
		
		n = null;
		
		continue loop; 
		}
		
        }*/
		
		
		//byte[] message = "888".getBytes(StandardCharsets.UTF_8);
		//String encoded = Base64.getEncoder().encodeToString(message);
		//System.out.println(encoded);
		
		
		//byte[] bytesEncoded = Base64.encodeBase64(str.getBytes());
		
		//byte[] decoded = Base64.getDecoder().decode("");
		//System.out.println(new String(decoded, StandardCharsets.UTF_8));
	}

}

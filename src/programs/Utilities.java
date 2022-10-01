package programs;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public interface Utilities {

	//handles all the file stuff the reading and writing to files
	
	public static String toSha(String input) {
		//stolen code
		
		//this had comments but i got rid of them
		//this method does the sha1 thing
	    try {
	    	MessageDigest md = MessageDigest.getInstance("SHA-1");
	        byte[] messageDigest = md.digest(input.getBytes());
	        BigInteger no = new BigInteger(1, messageDigest);
	        String hashtext = no.toString(16);
	        while (hashtext.length() < 40) { hashtext = "0" + hashtext; }
	        return hashtext;
	    }
	    catch (NoSuchAlgorithmException e) { throw new RuntimeException(e); }
	}
	 
	//TODO likely more efficient way to do this
	public static File makeFile(String name, String content) {
		String filePath = null;
	    try { filePath = Files.writeString(Paths.get(name), content, StandardCharsets.ISO_8859_1).toString(); }
	    catch (Exception e) { e.printStackTrace(); }
	    return new File(filePath);
	}
	 
	
	//takes a path to a file and pulls data from it into a string
	//TODO doesn't handle bad input well
	public static String fileToString(String fileName) {
		try {
			String retString = "";
			BufferedReader reader = new BufferedReader(new FileReader(new File (fileName))); 
			while (reader.ready()) { retString += reader.readLine(); }
			reader.close();
			return retString;
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}
}

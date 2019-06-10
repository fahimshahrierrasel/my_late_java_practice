import java.io.*;
import java.nio.file.*;

public class JavaFile {

	private static void fileWrite() {
		Path file = Paths.get("Grades.txt");
		String str = "ABCDF";
		byte[] data = str.getBytes();
		OutputStream output = null;
		
		try {
			output = new BufferedOutputStream(Files.newOutputStream(file, StandardOpenOption.CREATE));
			output.write(data);
			output.flush();
			output.close();
		}
		catch(Exception e) {
			System.out.println("Message: " + e);
		}
	}
	
	private static void fileRead() {
		Path file = Paths.get("Grades.txt");
		InputStream input = null;
		try {
			input = Files.newInputStream(file);
			BufferedReader reader  = new BufferedReader(new InputStreamReader(input));
			String str = null;
			str = reader.readLine();
			System.out.println(str);
			input.close();
		}
		catch(IOException e) {
			System.out.println("Message: " + e);
		}
				
	}
}

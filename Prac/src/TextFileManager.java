import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;

public class TextFileManager {

	private String fileName;

	public TextFileManager(String filepathName) {
		fileName = filepathName;
		

	}

	public String readFile()

	{
		String finalText = null;
		String line = null;
		// reading the file

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			StringBuffer sb = new StringBuffer();
			
			while ((line = bufferReader.readLine()) != null) {
				sb.append(line);
			}
			finalText = sb.toString();

			
			bufferReader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return finalText;
	}

	public void writeFIle(String inputData) {
		
		try{
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write(inputData);
			bufferWriter.close();
			
			System.out.println("File has created : " + fileName);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		TextFileManager tx = new TextFileManager("C:/ex/data/testing2.txt");
		//tx.writeFIle("i like programming because it is fun, and it make me think more!!! this is the second one");
		String mag = tx.readFile();
		System.out.println(mag);
		
	}
	
	
	
	
	
	
	

}

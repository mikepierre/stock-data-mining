import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

import web.downloadCsv;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url = "C:\\Users\\MichaelPierre\\Downloads\\quotes.csv";
String line = "";
String split = ",";
/*
try(BufferedReader br = new BufferedReader(new FileReader(url))){
	
	while((line = br.readLine()) != null) {
		String[] stock = line.split(split);
		
		System.out.println(stock[0].replace("\"", ""));
		System.out.println(stock[1]);
	}
} catch(IOException e) {
	e.printStackTrace();
}
*/
downloadCsv download = new downloadCsv();

try {
	download.dowload();
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}

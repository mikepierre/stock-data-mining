package web;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class downloadCsv {

	private static final String OUTPUT_FILE = "C:\\Users\\MichaelPierre\\Downloads\\quotes.csv";
	public void dowload() throws MalformedURLException, IOException {

		URL website = new URL("http://finance.yahoo.com/d/quotes.csv?s=AAPL+GOOG+MSFT+SQ+ccu+JNJ+YHOO+AMZN&f=nab");
		try (InputStream in = website.openStream()) {
			Path to = Paths.get(OUTPUT_FILE);
			Files.copy(in, to, StandardCopyOption.REPLACE_EXISTING);
		}

		return;
		
	}
}

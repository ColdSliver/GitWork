package work10;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
public class FileStream {
	private static void copyFileUsingFileStreams(File source, File dest)

		    throws IOException { 

		  InputStream input = null; 

		  OutputStream output = null; 

		  try {

		      input = new FileInputStream(source);

		      output = new FileOutputStream(dest);   

		      byte[] buf = new byte[1024];   

		      int bytesRead;   

		      while ((bytesRead = input.read(buf)) > 0) {

		        output.write(buf, 0, bytesRead);

		      }

		  } finally {

		    input.close();

		    output.close();

		  }

		}
}

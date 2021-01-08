package work10;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
public class FileChanel {
	private static void copyFileUsingFileChannels(File source, File dest) throws IOException { 

	    FileChannel inputChannel = null; 

	    FileChannel outputChannel = null; 

	  try {

	    inputChannel = new FileInputStream(source).getChannel();

	    outputChannel = new FileOutputStream(dest).getChannel();

	    outputChannel.transferFrom(inputChannel, 0, inputChannel.size());

	  } finally {

	    inputChannel.close();

	    outputChannel.close();

	  }

	}
}

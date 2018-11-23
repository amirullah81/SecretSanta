package SecretSantaGift;

import java.io.*;

/**
 * Created by amirullah on 11/21/18.
 */
public class FileReaderWriter {
    public int fileReader(String path) throws IOException {
        File fileName = new File(path);
        int data = 1;
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                data = Integer.parseInt(line);
            }

            // Close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }

        return data;
    }

    public void fileWriter(String path, int data) throws IOException {
        File fileName = new File(path);
        try{
            //FileRWriter write text files in the default encoding.
            FileOutputStream is = new FileOutputStream(fileName);
            
            OutputStreamWriter ows = new OutputStreamWriter(is);
            Writer writer = new BufferedWriter(ows);

            String data1 = String.valueOf(data);
            writer.write(data1);
            writer.close();
        }

        catch(IOException ex){
            System.out.println("Error writing file '" + fileName + "'");
        }
    }
}

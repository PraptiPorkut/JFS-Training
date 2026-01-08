package files;

import java.io.*;

public class FileRead {
    static void main() {
        try{
            BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\suraj\\OneDrive\\Pictures\\Desktop\\JFD\\Day8\\src\\files\\myfile.txt"));
            String ch;
            while((ch=br.readLine())!= null){
                //System.out.print((char)ch);
                System.out.println(ch);
            }
            System.out.println(br.readLine());
            br.close();
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException io){
            System.out.println(io);
        }

    }
}

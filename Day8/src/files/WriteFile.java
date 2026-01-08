package files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//java.io package ->FileWriter->write character data in the file
//byte stream-> Binary Data
//Character stream->Unicode conversion
public class WriteFile {
//FileWriter->extends Output stream writer ->connect character stream to byte stream
    //1.charactre oriented stream
    //2.convinente for text file//works with char,string and char
    //3.Apend :add content
    //4.
    String path;
    String currentdata;
    public WriteFile(String path,String data){
        this.path=path;
        this.currentdata=data;
        try{
            FileWriter fw= new FileWriter(path);
            fw.write(data);
            fw.close();
        }catch(IOException io){
            System.out.println(io);
        }
    }
    public String changedata(String data){
        String old_data=this.currentdata;
        this.currentdata=data;
        try{
            FileWriter fw= new FileWriter(path);
            fw.write(data);
            fw.close();
        }catch(IOException io){
            System.out.println("Changed Data Successfully");
        }
        return old_data;
    }
    public String appenddata(String data){
        String old_data=this.currentdata;
        this.currentdata=old_data+data;
        try{
            BufferedWriter fw= new BufferedWriter(new FileWriter(path,true));
            fw.write(data);
            fw.newLine();
            fw.close();
        }catch(IOException io){
            System.out.println("Changed Data Successfully");
        }
        return currentdata;
    }
}

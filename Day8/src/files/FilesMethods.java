package files;
import java.io.File;
import java.io.IOException;
import java.lang.classfile.instruction.SwitchCase;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FilesMethods {
    public static void main(String[] args){
        //1.open file
        //2.read from file
        //3.writting to files
        //4.adding files
        //5.closing or deleting files
        try {
            File file = new File("myfile.txt");//file object created
            System.out.println("File Object Created");
            if (file.createNewFile()){//createing new file
                System.out.println("file created at:"+file.getAbsolutePath());
            }else {
                System.out.println("File already created at : "+file.getAbsoluteFile());
            }

           int choice=0;
            WriteFile writeFile =new WriteFile("myfile.txt","Hey!! .... method called");
            while(choice<4){
                System.out.println("*******MENU*******");
                System.out.println("1.Get Data.");
                System.out.println("2.Re-write Data.");
                System.out.println("3.Append Data.");
                System.out.println("4.Exit");

                Scanner s=new Scanner(System.in);
                System.out.println("Enter your choice");
                int uc=s.nextInt();
                switch (uc){
                    case 1:{
                        System.out.println("Current Data is: "+writeFile.currentdata);
                        choice=uc;
                        break;
                    }
                    case 2: {
                        s.nextLine();
                        choice=uc;
                        System.out.println("Enter data want to write.");
                        String new_data= s.nextLine();
                        writeFile.changedata(new_data);
                        System.out.println("Data Changed Suceessfullt");
                        break;
                    }
                    case 3:{
                        s.nextLine();
                        choice=uc;
                        System.out.println("Enter data want to append.");
                        String new_data= s.nextLine();
                        writeFile.appenddata(new_data);
                        System.out.println("Data Appended  Suceessfullt");
                        break;
                    }
                    default:{
                        System.out.println("Thanks!!! Have a nice day.");
                        return;
                    }
               }
            }
            /*System.out.println(file.getAbsoluteFile());
            System.out.println(file.isAbsolute());
            System.out.println(file.getName());
            System.out.println(file.canRead());
            System.out.println(file.length());
            writeFile.changedata("Prapti Changed data.");
            System.out.println(file.length());*/
        }catch(IOException err){
            System.out.println("Error in the file creation.");
        }
    }
}

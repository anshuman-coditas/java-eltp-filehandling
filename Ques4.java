package FileIOAssignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Ques4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f;
        FileReader fr=new FileReader(f=new File("src/FileIOAssignment/file2.txt"));
        if(f.exists()){
            int i=0;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("File Not Found");

    }
}
        //**************OUTPUT*****************
//        Anshuman Kumar, MCA from Delhi.
//        Bsc CS from Delhi University.
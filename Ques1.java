package FileIOAssignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ques1 {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        File f = new File("src/FileIOAssignment/file.txt");
        FileInputStream fin = new FileInputStream(f);
        if (f.exists()) {
            int i=0;
            while((i= fin.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("File Not Found");
    }
}
//            OUTPUT

//    Anshuman Kumar Intern at Coditas Solutions.
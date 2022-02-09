package FileIOAssignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src/FileIOAssignment/file2.txt");
        Scanner inp=new Scanner(file);
        if(file.exists()){
            while(inp.hasNextLine()){
                System.out.println(inp.nextLine());
            }
        }
        else
            System.out.println("File not Found");

    }
}
        //*************OUTPUT*******************
//        Anshuman Kumar, MCA from Delhi.
//        Bsc CS from Delhi University.
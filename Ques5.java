package FileIOAssignment;
import java.io.*;
public class Ques5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f=new File("src/FileIOAssignment/file3.txt");

        BufferedReader br=new BufferedReader(new FileReader(f));
        if(f.exists()){
            int i=0;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("File not Found.");
    }
}

    //**********OUTPUT***************//
//    Anshuman Kumar Intern at Coditas Solutions.
//        Anshuman Kumar, MCA from Delhi.
//        Bsc CS from Delhi University.

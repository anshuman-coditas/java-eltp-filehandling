package FileIOAssignment;

import java.io.*;

public class Ques2 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        File f = new File("src/FileIOAssignment/file.txt");
        FileInputStream fin = new FileInputStream(f);
        BufferedInputStream bin=new BufferedInputStream(fin);
        if(f.exists()){
            int i=0;
            while((i= bin.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("Not Found!");


    }
}
                            //********OUTPUT*****
//                            Anshuman Kumar Intern at Coditas Solutions.
package FileIOAssignment;
import java.io.*;
public class Ques6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin1=new FileInputStream("src/FileIOAssignment/file4.txt");
        FileInputStream fin2=new FileInputStream("src/FileIOAssignment/file5.txt");
        FileOutputStream fout=new FileOutputStream("src/FileIOAssignment/output.txt");
        SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
        int i=0;
        while((i=sin.read())!=-1){
            fout.write(i);
        }
    }
}
        //********OUTPUT***********
            //In the output.txt FILE
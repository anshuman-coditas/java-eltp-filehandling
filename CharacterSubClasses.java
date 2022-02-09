package FileIOAssignment;

import java.io.*;

public class CharacterSubClasses {
    public static void main(String[] args) throws FileNotFoundException ,IOException{
        File f=new File("src/FileIOAssignment/file3.txt");
        File f1=new File("src/FileIOAssignment/output1.txt");
        Reader rd=new FileReader(f);
        Writer wr=new FileWriter(f1);
        FilterReader fr=new FilterReader(rd) {};//performing reading operation to read filtered character streams.
        FilterWriter wr1=new FilterWriter(wr) {};//writing filtered characters to a file.
        int i=0;
        while((i= fr.read())!=-1){
            System.out.print((char) i);
        }
        char ch='a';
        wr1.append(ch);
        rd.close();
        wr.close();
        fr.close();
        wr1.close();

    }
}
//                  **********OUTPUT**********
//
//    Anshuman Kumar Intern at Coditas Solutions.
//        Anshuman Kumar, MCA from Delhi.
//        Bsc CS from Delhi University.
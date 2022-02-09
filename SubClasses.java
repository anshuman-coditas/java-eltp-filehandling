package FileIOAssignment;
import java.io.*;
public class SubClasses {
    public static void main(String[] args) throws IOException {
        File f = new File("src/FileIOAssignment/file2.txt");
        File f1=new File("src/FileIOAssignment/output1.txt");
        FileInputStream fin = new FileInputStream(f);
        FileInputStream fin1=new FileInputStream(f1);
        DataInputStream din=new DataInputStream(fin);//read primitive data types from files.
        FileOutputStream fout=new FileOutputStream(f);
        DataOutputStream dout=new DataOutputStream(fout);//write primitive data to a file in easy way
        int i=0;
        while((i=din.read())!=-1){
            System.out.print((char) i);
        }
        String str="CS Graduate";
        byte[] b=str.getBytes();
        fout.write(b);
        dout.write(b);
        fout.close();
        dout.close();
    }
}

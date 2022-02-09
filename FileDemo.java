import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("src/abc.txt");
        if(f.exists()) {
            System.out.println("File is There");
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getCanonicalPath());
            System.out.println(f.getPath());
            System.out.println(f.getCanonicalFile());
            System.out.println(f.getParent());
            System.out.println(f.getAbsoluteFile());
        }
        else
            System.out.println("No File!");
    }
}


import java.io.File;
import java.util.Scanner;

public class TextFileRead
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("../mounika-pe2/PE2/src/main/java/textfile.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine().toUpperCase());
        System.out.println("Length of file ="+file.length());
    }
}


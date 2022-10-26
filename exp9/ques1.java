package exp9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ques1
{
    public static void main(String args[]) throws IOException
    {
        FileReader f1=new FileReader("sample1.txt");
        FileWriter f2=new FileWriter("sample2.txt");
        int read;
        while((read=f1.read())!=-1)
        {
            f2.write(Character.toLowerCase(read));
        }
        f1.close();
        f2.close();
        System.out.print("converted from upper to lower case!!!");
    }
}

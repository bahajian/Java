/**
 * Created by Bhajian on 5/11/2017.
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // write your code here
        System.out.println("password generator");

        String myStr=new String();
        char[] a=new char[36];


        char myCh=1;
        for(int i=0;i<10;i++)
            a[i]= (char) (i+48);


        for(int i=0;i<26;i++)
            a[i+10]= (char) (i+65);




        for(int i=0;i<36;i++)
            System.out.println("ch= "+a[i]);





        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");



//--------------------------------------------------------------------------------
            for(int b=1;b<36;b++)
                for(int c=0;c<36;c++)
                    for(int d=0;d<36;d++)
                        for(int e=0;e<36;e++)
                            for(int f=0;f<36;f++)
                                if((b!=c&&c!=d)&& (c!=d&&d!=e)&& (d!=e&&e!=f))
                                writer.println(a[b]+""+a[c]+""+a[d]+""+a[e]+""+a[f]+"Rogers");
        writer.close();













//      for(long ii = 0; ii<60466176; ii++){
//          System.out.println(ii);
//
//      }







    }
}

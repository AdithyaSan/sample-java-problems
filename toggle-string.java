/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner in = new Scanner(System.in);
        String s, out="";
        char ch;
        int  i = 0;
        s = in.next();
        do{
            ch = s.charAt(i);
            if(Character.isUpperCase(ch)==true){
                ch = Character.toLowerCase(ch);
            }
            else{
                ch = Character.toUpperCase(ch);
            }
            out = out + ch;
            i++;
        }while(i<s.length());
        
        System.out.println(out);
    }
}

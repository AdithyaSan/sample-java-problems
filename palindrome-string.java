//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class TestClass {
  public static void main(String args[] ) throws Exception {
    Scanner in  = new Scanner(System.in);
    String s;
    int i1 = 0;
    int flag = 0;
    s = in.next();
    int i2 = s.length()-1;
    if(!s.equals(new StringBuilder(s).reverse().toString())){
      flag = 1;
    }
    if(flag==0){
      System.out.println("YES");
    }
    else System.out.println("NO");
    
  }
}

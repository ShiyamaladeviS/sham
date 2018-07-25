import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String s[]=new String[10];
      for(int i=0;i<10;i++){
      s[i]=in.next();
      }
    Arrays.sort(s);
   System.out.println(s[0]);
     in.close();
	}
}

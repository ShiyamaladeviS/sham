import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
 String s=in.next();
 int l=s.length();
 int  c=l/2;;
 if(l%2!=0){
	 System.out.print(s.substring(0,c)+"*"+s.substring(c+1));
 }else{
	 System.out.print(s.substring(0,c-1)+"**"+s.substring(c+1));
	  }
      in.close();
	}
}

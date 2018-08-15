import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String a=in.next();
 String []s={"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
for(int i=0;i<s.length;i++){
 if(a.equals(s[i])){
	 System.out.println(i+1);
 }
}  
  in.close();
  }
}

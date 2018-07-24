import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String a=String.valueOf(n);
String[] s=a.split("");
for(int i=0;i<s.length;i++){
	System.out.print(s[i]+" ");
}
in.close();
 }
}

import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
 String b=in.nextLine();
   int l=b.length();
   int i;
   String a="";
   String c="";
 for(i=0;i<l;i++){
	 a+=b.substring(i,i+1);
 }for(i=l-1;i>=0;i--){
	 c+=b.substring(i,i+1);
 }
 if(a.equals(c)){
 System.out.println("yes");
 }else{
	 System.out.println("no");
 }
      in.close();
	}
}

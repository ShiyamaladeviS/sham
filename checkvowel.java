import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
 String b=in.nextLine();
 b.toLowerCase();
  int i,count=0;
  String []s=b.split("");
  String[] a={"a","e","i","o","u"};
 for(i=0;i<5;i++){
	 for(int j=0;j<b.length();j++){
	if(a[i].contains(s[j])){
		count++;
	}
	 }
 }
	if(count>=1){
System.out.println("yes");
 }else{
	 System.out.println("no");
 }
      in.close();
	}
}

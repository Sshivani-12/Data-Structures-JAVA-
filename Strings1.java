/*class Reve
{
	static String Countj(String s)
	{

	char [] temp =s.toCharArray();
	int n=temp.length;
	char te;
	for (int i=0;i<n;i++)
	{

	int k=i;
		while(i<n && temp[i] != ' ')
		{
			i++;
		}
		te=temp[k];
		temp[k]=temp[i-1];
		temp[i-1]=te;
	}
	return new String(temp);
}
}
public class Strings1
{	


	public static void main(String[] args) {
		String s="Shivani wakde";
		Reve r=new Reve();
		System.out.println(r.Countj(s));

	}
}

*/
/*
public class Strings1
{	


	public static void main(String[] args) {
		String s="Shivani";
	char [] temp=s.toCharArray();
		
		int n=temp.length;
		for(int i=n-1;i>=0;i--)
		{
			 System.out.print(temp[i]);
		}	
	}
}
*/
/*
import java.util.regex.Pattern;
public class Strings1
{	
	static String rrev(String s)
	{
		Pattern p=Pattern.compile("\\s");
		String[] temp=p.split(s);
		String result="";
		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
				result=temp[i]+result;
			else
				result=" "+temp[i]+result;
		}
		return result;
	}

	public static void main(String[] args) {
		String s="Shivani wakde";
		System.out.println(rrev(s));

}
}*/
/*
public class Strings1
{	
	static boolean rrev(String s)
	{
		
	int i=0;
	int n=s.length();
	while(i<n && s.charAt(i)=='0')
		{
			i++;
		}
		while(i<n){
			if(s.charAt(i)=='0')
			{
				return true;
			}
			i++;
		}


		return false;
	}

	public static void main(String[] args) {
		String s="0079";
		if(rrev(s)){
			System.out.println("duck");
		}
		else{
			System.out.println(" Nduck");
		}

}
}
*/
class Strings1{

	static char [] a= "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
	static String ss(String s,char[]str1)
	{
		String s2="";
		for(char i:str1)
		{
			s2+=a[s.indexOf(i)];

		}
		return s2;
	}
	public static void main(String[] args) {
		String charSet = "qwertyuiopasdfghjklzxcvbnm"; 
        String str1 = "egrt"; 
        System.out.print(ss(charSet, str1.toCharArray())); 
}

}

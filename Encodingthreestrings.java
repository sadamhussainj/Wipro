import java.io.*;
import  java.util.*;
public Encodingthreestrings
{
    public class Result{
		public final String output1;
		public final String output2;
		public final String output3;

		public Result(String out1, String out2, String out3){
			output1 = out1;
			output2 = out2;
			output3 = out3;
		}
	}
	
    public Result encodeThreeStrings(String input1,String input2,String input3){
		String str1=Find(input1);
		String str2=Find(input2);
		String str3=Find(input3);
		String[] s1=str1.split(" ");
		String[] s2=str2.split(" ");
		String[] s3=str3.split(" ");
		String res1="",res2="",res3="",res="";
		res1=s1[0]+s2[0]+s3[0];
		res2=s1[1]+s2[1]+s3[1];
		res3=s1[2]+s2[2]+s3[2];
		String s="";
		char[] arr=res3.toCharArray();
		for(char c:arr)
		{
			
		  s=String.valueOf(c);
				if((c>='a')&&(c<='z'))
				   {
				   res=res+s.toUpperCase();
				}
				   else if((c>='A')&&(c<='Z'))
				   {
				res=res+s.toLowerCase();
				}

		}
		Result r=new Result(res1,res2,res);
		return r;
		
    }
	public String Find(String input)
	{
		String s1="";
		String s2="";
		String s3="";
		String res="";
		int n1=input.length();
		int equal=0;
		if(n1%3==0)
		{
			equal=n1/3;
			s1=s1+input.substring(0,equal);
			s2=s2+input.substring(equal,2*equal);
			s3=s3+input.substring(2*equal);
		}
		else if(n1%3==1)
		{
			equal=n1/3;
			s1=s1+input.substring(0,equal);
			s2=s2+input.substring(equal,n1-equal);
			s3=s3+input.substring(n1-equal);
		}
		else if(n1%3==2)
		{
			equal=n1/3;
			s1=s1+input.substring(0,equal+1);
			s2=s2+input.substring(equal+1,n1-(equal+1));
			s3=s3+input.substring(n1-(equal+1));
		}
		
		res=s1+" "+s2+" "+s3;
		return res;
	}
	}
        

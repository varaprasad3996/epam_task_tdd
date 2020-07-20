package com.epam.practice.tdd_junit_hometask;

public class RemovingChars 
{
	 String removeChars(String input)
	{
		String res="";
		if(input.length() <=2 )
		{
			if(input.length()<=1 )
			{
				if(!input.equals("A"))
					res=input;
			}
			else
			{
				if(input.charAt(0)=='A' && input.charAt(1)=='A' )
					res="";
				else if(input.charAt(0)=='A' )
					res=""+input.charAt(1);
				else if(input.charAt(1)=='A' )
					res=""+input.charAt(0);
			}
		}
		else
		{
			if(input.charAt(0)=='A' && input.charAt(1)=='A')
				res=input.substring(2);
			else if(input.charAt(0)=='A')
				res=input.substring(1);
			else if(input.charAt(1)=='A')
				res=""+input.charAt(0)+ input.substring(2);
			else
				res = input;
			
		}
		
		return res;
	}
 
}

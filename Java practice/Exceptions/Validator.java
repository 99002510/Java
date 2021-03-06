package com.validation;
import com.Exceptions.NameExistsException;
import com.Exceptions.TooLongException;
import com.Exceptions.TooShortException;

public class Validator 
{
	private String[] names = {"Ankith","Raju","Nipun","Rohan"};
	public boolean validateName(String username) throws NameExistsException 
	{
		for(String uname:names) 
		{
			if(uname.equals(username)) 
			{
				throw new NameExistsException();
			}
		}
		return true;
	}
	public boolean validatePassword(String password) throws TooLongException,TooShortException 
	{
		if (password.length()>=15) 
		{
			throw new TooLongException("Password is too Lomg");
		}
		if(password.length()<=5) 
		{
			throw new TooShortException("Password is too short");
		}
		return true;
	}
}

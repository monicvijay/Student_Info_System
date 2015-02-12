package edu.iiitb.sis.actions.authentication;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import edu.iiitb.sis.dao.AuthenticationDao;

import com.opensymphony.xwork2.ModelDriven;

import edu.iiitb.sis.model.Login;

public class LoginAction implements ModelDriven<Login>,SessionAware
{
	private Login login=new Login();
	private String message;
	AuthenticationDao authenticate=new AuthenticationDao();
	private SessionMap<String,Object> sessionMap;  
	private Map session;
	
	public SessionMap<String, Object> getSessionMap()
	{
		return sessionMap;
	}
	public void setSession(Map<String, Object> arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void setSessionMap(SessionMap<String, Object> sessionMap) 
	{
		this.sessionMap = sessionMap;
	}

	public String execute()
	{
		message=authenticate.checkLogin(login);
		//System.out.println(message);
		if(message.equalsIgnoreCase("Admin"))
		{
			return "Admin";
		}
		else if(message.equalsIgnoreCase("Faculty"))
		{
			return "Faculty";
		}
		else if(message.equalsIgnoreCase("Student"))
		{
			return "Student";
		}
		else
		{
			
			return "failure";
		}
		
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public Login getLogin() 
	{
		return login;
	}

	public void setLogin(Login login)
	{
		this.login = login;
	}

	public Login getModel()
	{
		return login;
	}

	


}

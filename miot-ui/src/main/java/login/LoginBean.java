package login;


import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.ServletException;
 
@ManagedBean(name = "loginBean")
@SessionScoped
 
public class LoginBean implements Serializable {
 
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
 
     
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
   
 
    public String login() throws ServletException, IOException {
    	if(("admin").equals(getUsername()) && ("admin").equals(password)){
    		return "/pages/device/deviceList.jsf";
    	}
    	return null;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}

package struts2.spring3.hibernate3.userinfoapp.action;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class LogoutAction extends ActionSupport{

	public String logoutUser(){
        ActionContext ctx = ActionContext.getContext();  
        Map session = ctx.getSession();  
        session.clear();
		return "input";
	}
}
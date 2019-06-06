package mystruts.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import mystruts.dao.LoginDao;
import mystruts.form.LoginForm;
 
public class LoginAction extends Action {
 
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    
//    public void prepare() throws Exception {
//    	LoginForm loginForm = new LoginForm();
//        loginForm.getUserName();
//    }
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	
    	HttpSession ses = request.getSession(true);
        LoginForm loginForm = (LoginForm) form;
        
        String username = loginForm.getUserName();
        String password = loginForm.getPassword();
        FormFile image = loginForm.getFile();
//        File file = loginForm.getFile();
        
        LoginDao dao = new LoginDao();
        dao.insertData(username, password, image);
        
        ses.setAttribute("userName", username);
        
        if (loginForm.getUserName().equals(loginForm.getPassword())) {
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }
        

    }
}

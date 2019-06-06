package com.sample.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sample.dao.LoginSampleDao;
import com.sample.form.LoginSampleForm;





public class LoginSampleAction extends Action {
	 
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    

    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	
    	HttpSession ses = request.getSession(true);
        LoginSampleForm loginForm = (LoginSampleForm) form;
        
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        
        LoginSampleDao dao = new LoginSampleDao();
        boolean value = dao.checkLogin(username, password);
        
        ses.setAttribute("username", username);
        
        if (value) {
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }
        

    }
}
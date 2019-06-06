package com.vaannila;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.validator.DynaValidatorForm;


public class LoginAction extends Action {

   

  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//        DynaValidatorForm loginForm = (DynaValidatorForm) form;
    	LoginForm loginForm = (LoginForm) form;
        String userName = loginForm.getUserName().toString();
        if(userName.equals("myname") )
        {
            return mapping.findForward("success");
        }
        else
        {
            return mapping.findForward("failure");
        }
        
    }
}

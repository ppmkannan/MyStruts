package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestCheck extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String value = request.getParameter("value");
//		System.out.println(success);
		if (value.equals("one")) {
			return mapping.findForward("one");
		} 
		else if (value.equals("two")){
			return mapping.findForward("two");
		}
		else {
			return mapping.findForward("default");
		}
		
		
	}

}
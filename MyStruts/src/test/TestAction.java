package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String success = request.getParameter("success");
//		System.out.println(success);
		if (success.equals("ppm")) {
			return mapping.findForward("success");
		} 
		else if (success.equals("baby")){
			return mapping.findForward("failure");
		}
		else {
			return mapping.findForward("failure");
		}
		
		
	}

}
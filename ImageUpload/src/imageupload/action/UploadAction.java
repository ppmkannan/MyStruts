package imageupload.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import imageupload.dao.UploadDao;
import imageupload.form.UploadForm;



public class UploadAction extends Action {
	 
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	
    	UploadForm uploadForm = (UploadForm) form;
        
        String username = uploadForm.getUserName();
        String password = uploadForm.getPassword();
        File image = uploadForm.getFile();
//        File file = loginForm.getFile();
        
        UploadDao dao = new UploadDao();
        dao.insertData(username, password, image);
        
        
        
        if (uploadForm.getUserName().equals(uploadForm.getPassword())) {
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }
        

    }
}


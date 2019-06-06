package imageupload.form;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

public class UploadForm extends ActionForm {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName; 
    private String password;
    private File file;
	
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public File getFile() {
    	return file;
    }
    
    public void setFile(File file) {
    	this.file = file;
    }
    
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.password = null;
    }

}


package imageupload.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import imageupload.dao.UploadDao;
import imageupload.form.UploadForm;

public class GetAction {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		UploadDao dao = new UploadDao();
		UploadForm uploadForm = new UploadForm();
		File getfile = uploadForm.getFile();
		File file = new File("file");
		dao.getFile(file);
		return mapping.findForward("images");
	}
}

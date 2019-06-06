package tiles.form;

import org.apache.struts.action.ActionForm;

public class TilesForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String parameter = " ";

	public String getParameter()

	{

		return parameter;

	}

	public void setParameter(String parameter)

	{

		this.parameter = parameter;

	}
}

package br.com.mendes.projecttheme.util;

import org.primefaces.component.api.Widget;
import org.primefaces.component.selectonemenu.SelectOneMenu;

import jakarta.faces.component.UINamingContainer;
import jakarta.faces.context.FacesContext;
import jakarta.faces.application.ResourceDependencies;
import jakarta.faces.application.ResourceDependency;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="primefaces.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="primefaces.js")
})
public class ThemeSwitcher extends SelectOneMenu implements Widget {


	public static final String COMPONENT_TYPE = "br.com.mendes.projectmanager.util.ThemeSwitcher";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.ThemeSwitcherRenderer";

	protected enum PropertyKeys {
		widgetVar
		,buttonPreText;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public ThemeSwitcher() {
		setRendererType(DEFAULT_RENDERER);
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public String getWidgetVar() {
		return (String) getStateHelper().eval(PropertyKeys.widgetVar, null);
	}
	
	public void setWidgetVar(String widgetVar) {
		getStateHelper().put(PropertyKeys.widgetVar, widgetVar);
	}

	public String getButtonPreText() {
		return (String) getStateHelper().eval(PropertyKeys.buttonPreText, null);
	}
	public void setButtonPreText(java.lang.String buttonPreText) {
		getStateHelper().put(PropertyKeys.buttonPreText, buttonPreText);
	}

	public String resolveWidgetVar() {
		FacesContext context = getFacesContext();
		String userWidgetVar = (String) getAttributes().get("widgetVar");

		if (userWidgetVar != null)
			return userWidgetVar;
		 else
			return "widget_" + getClientId(context).replaceAll("-|" + UINamingContainer.getSeparatorChar(context), "_");
	}
}
package br.com.mendes.projecttheme.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.mendes.projecttheme.model.Theme;
import br.com.mendes.projecttheme.util.ThemeSwitcher;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ThemeSwitcherBean implements Serializable {

	private static final long serialVersionUID = 5048506968654604348L;

	private String theme = "arya";
	private List<Theme> themes;

	@PostConstruct
	public void init() {
		themes = new ArrayList<Theme>();
		themes.add(new Theme("Arya", "arya"));
		themes.add(new Theme("Vela", "vela"));
		themes.add(new Theme("Saga", "saga"));
		themes.add(new Theme("Afterdark", "afterdark"));
		themes.add(new Theme("Afternoon", "afternoon"));
		themes.add(new Theme("Afterwork", "afterwork"));
		themes.add(new Theme("Black-tie", "black-tie"));
		themes.add(new Theme("Blitzer", "blitzer"));
		themes.add(new Theme("Bluesky", "bluesky"));
		themes.add(new Theme("Bootstrap", "bootstrap"));
		themes.add(new Theme("Casablanca", "casablanca"));
		themes.add(new Theme("Cruze", "cruze"));
		themes.add(new Theme("Cupertino", "cupertino"));
		themes.add(new Theme("Dark-hive", "dark-hive"));
		themes.add(new Theme("Delta", "delta"));
		themes.add(new Theme("Dot-luv", "dot-luv"));
		themes.add(new Theme("Eggplant", "eggplant"));
		themes.add(new Theme("Excite-bike", "excite-bike"));
		themes.add(new Theme("Flick", "flick"));
		themes.add(new Theme("Glass-x", "glass-x"));
		themes.add(new Theme("Home", "home"));
		themes.add(new Theme("Hot-sneaks", "hot-sneaks"));
		themes.add(new Theme("Humanity", "humanity"));
		themes.add(new Theme("Le-frog", "le-frog"));
		themes.add(new Theme("Midnight", "midnight"));
		themes.add(new Theme("Mint-choc", "mint-choc"));
		themes.add(new Theme("Overcast", "overcast"));
		themes.add(new Theme("Pepper-grinder", "pepper-grinder"));
		themes.add(new Theme("Redmond", "redmond"));
		themes.add(new Theme("Rocket", "rocket"));
		themes.add(new Theme("Sam", "sam"));
		themes.add(new Theme("Smoothness", "smoothness"));
		themes.add(new Theme("South-street", "south-street"));
		themes.add(new Theme("Start", "start"));
		themes.add(new Theme("Sunny", "sunny"));
		themes.add(new Theme("Swanky-purse", "swanky-purse"));
		themes.add(new Theme("Trontastic", "trontastic"));
		themes.add(new Theme("Ui-darkness", "ui-darkness"));
		themes.add(new Theme("Ui-lightness", "ui-lightness"));
		themes.add(new Theme("Vader", "vader"));
	}

	public List<Theme> getThemes() {
		return themes;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
        this.theme = theme;
    }
	
	public void saveTheme(AjaxBehaviorEvent ajax) {
//		ThemeSwitcher t = (ThemeSwitcher) ajax.getSource();
//		String v = (String) t.getValue();
//		setTheme(v);
		setTheme((String)((ThemeSwitcher) ajax.getSource()).getValue());
	}
}

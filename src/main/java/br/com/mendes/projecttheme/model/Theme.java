package br.com.mendes.projecttheme.model;

public class Theme {

	private String label;
    private String name;

    public Theme(String label, String name) {
        this.label = label;
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }
}

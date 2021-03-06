package me.ohtaeg.domain.search;

public enum RequestVariableName {
    QUERY("query"), DISPLAY("display"), START("start"), SORT("sort");

    private String name;

    RequestVariableName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

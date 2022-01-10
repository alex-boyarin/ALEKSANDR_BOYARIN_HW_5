package onliner.enums;

public enum TopMenuMainPage {
    CATALOG("Каталог");
    private String value;

    TopMenuMainPage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

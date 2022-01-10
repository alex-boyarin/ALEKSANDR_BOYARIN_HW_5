package onliner.enums;

public enum CatalogCategory {
    ELECTRONICS("Электроника"),
    COMPUTERS_AND_NETWORKS("Компьютеры и сети"),
    HOME_APPLIANCES("Бытовая техника"),
    CONSTRUCTION_AND_REPAIR("Стройка и ремонт"),
    HOUSE_AND_GARDEN("Дом и сад"),
    AUTO_AND_MOTO("Авто и мото"),
    BEAUTY_AND_SPORT("Красота и спорт"),
    CHILDREN_AND_MOTHERS("Детям и мамам"),
    WORK_AND_OFFICE("Работа и офис"),
    FOOD("Еда");

    private String value;

    CatalogCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

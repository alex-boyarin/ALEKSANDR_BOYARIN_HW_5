package onliner.enums;

public enum ComputersNetworks {
    LAPTOPS_COMPUTERS_MONITORS("Ноутбуки,компьютеры, мониторы"),
    COMPONENTS("Комплектующие"),
    DATA_STORAGE("Хранение данных"),
    NETWORK_HARDWARE("Сетевое оборудование");
    private String value;

    ComputersNetworks(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

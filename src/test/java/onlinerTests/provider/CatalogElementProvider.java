package onlinerTests.provider;

import onliner.enums.CatalogCategory;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.List;
import java.util.stream.Stream;

public class CatalogElementProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(List.of(
                        "Электроника",
                        "Компьютеры и сети",
                        "Бытовая техника",
                        "Стройка и ремонт",
                        "Дом и сад",
                        "Авто и мото",
                        "Красота и спорт",
                        "Детям и мамам",
                        "Работа и офис",
                        "Еда")));
    }
}

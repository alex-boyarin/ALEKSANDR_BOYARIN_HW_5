package onlinerTests.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.List;
import java.util.stream.Stream;

public class ComputersNetworksProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(List.of(
                        "Ноутбуки, компьютеры, мониторы",
                        "Комплектующие",
                        "Хранение данных",
                        "Сетевое оборудование")));
    }
}

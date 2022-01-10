import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantyukov.domain.MobilePhone;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Мы создаем кнтруткор и проверяем методы: ")
@Data


public class MobilePhoneTest {


    public static final String model = "iPhone_13_Pro_Max";
    public static final String company = "Apple";
    public static final int price = 140_000;
    public static final String new_model = "iPhone_12_Pro_Max";
    public static final String new_company = "Honor";
    public static final int new_price = 10_000;

    @DisplayName(" корректно создается конструктором")
    @Test
    public void shouldCorrectConstructor() {
        MobilePhone mobilePhones = new MobilePhone(model, company, price);

        assertAll("iPhone_13_Pro_Max", () -> assertEquals(model, mobilePhones.getModel()), () -> assertEquals(company, mobilePhones.getCompany()), () -> assertEquals(price, mobilePhones.getPrice()));

    }

    @DisplayName("Корректо изменять параметры телефона")
    @Test
    public void shouldHaveCorrectPhoneUpdate() {
        MobilePhone mobilePhones = new MobilePhone(model, company, price);
        assertAll("iPhone_12_Pro_Max", () -> assertEquals(new_model, mobilePhones.getModel()), () -> assertEquals(new_company, mobilePhones.getCompany()), () -> assertEquals(new_price, mobilePhones.getPrice()));
    }
}


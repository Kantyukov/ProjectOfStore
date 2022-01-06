import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantyukov.domain.MobilePhones;
import ru.artem.kantyukov.services.MobilePhoneServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Мы создаем коллекцию и проверяем методы: ")
@Data
public class MobilePhoneServiceImplTest {

    List<MobilePhones> listOfPhoneInStore = new ArrayList<>(); // создаем коллекцию phoneList
    public static final String model = "iPhone_13_Pro_Max";
    public static final String company = "Apple";
    public static final int price = 140_000;

    @DisplayName(" корректно создается конструктором")
    @Test
    public void shouldCorrectConstructor() {
        MobilePhones mobilePhones = new MobilePhones(model, company, price);

        Assertions.assertEquals(model, mobilePhones.getModel());
        Assertions.assertEquals(company, mobilePhones.getCompany());
        Assertions.assertEquals(price, mobilePhones.getPrice());
    }

    @DisplayName("Корректо изменять параметры телефона")
    @Test
    public void shouldHaveCorrectPhoneUpdate() {
        MobilePhones mobilePhones = new MobilePhones(model, company, price);
        assertAll("iPhone_13_Pro_Max", () -> assertEquals(model, mobilePhones.getModel()),
                () -> assertEquals(company, mobilePhones.getCompany()),
                () -> assertEquals(price, mobilePhones.getPrice()));
    }

    @Test
    @DisplayName("Проверка метода takePhoneByModel")
    void shouldCorrectMethodTakePhoneByFirm() {
        MobilePhones actualPhone = new MobilePhones(model, company, price);
        listOfPhoneInStore.add(actualPhone);
        MobilePhoneServiceImpl  phoneService = new MobilePhoneServiceImpl(listOfPhoneInStore);
        Assertions.assertEquals(actualPhone, phoneService.takePhoneByName(model));
    }

    @Test
    @DisplayName("Проверка метода hasPhone")
    void shouldCorrectMethodHasPhone() {
        MobilePhones actualPhone = new MobilePhones(model, company, price);
        listOfPhoneInStore.add(actualPhone);
        MobilePhoneServiceImpl phoneService = new MobilePhoneServiceImpl(listOfPhoneInStore);
        Assertions.assertTrue(phoneService.hasPhone(model));
    }
}








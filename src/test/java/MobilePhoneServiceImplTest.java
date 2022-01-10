import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantyukov.domain.MobilePhone;
import ru.artem.kantyukov.services.MobilePhoneServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Мы создаем коллекцию и проверяем методы: ")
@Data
public class MobilePhoneServiceImplTest {

    static final List<MobilePhone> listOfPhoneInStore = new ArrayList<>(); // создаем коллекцию phoneList
    public static final String model = "iPhone_13_Pro_Max";
    public static final String company = "Apple";
    public static final int price = 140_000;

    @Test
    @DisplayName("Проверка метода takePhoneByModel")
    void shouldCorrectMethodTakePhoneByFirm() {
        MobilePhone actualPhone = new MobilePhone(model, company, price);
        listOfPhoneInStore.add(actualPhone);
        MobilePhoneServiceImpl phoneService = new MobilePhoneServiceImpl(listOfPhoneInStore);
        Assertions.assertEquals(actualPhone, phoneService.takePhoneByName(model));
    }

    @Test
    @DisplayName("Проверка метода hasPhone")
    void shouldCorrectMethodHasPhone() {
        MobilePhone actualPhone = new MobilePhone(model, company, price);
        listOfPhoneInStore.add(actualPhone);
        MobilePhoneServiceImpl phoneService = new MobilePhoneServiceImpl(listOfPhoneInStore);
        Assertions.assertTrue(phoneService.hasPhone(model));
    }
}








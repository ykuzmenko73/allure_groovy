package allure_groovy;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureTestJava {
    @Test
    public void testJava() {
        step("Test", () -> {
                step ("Some internal step");
        });
    }
}

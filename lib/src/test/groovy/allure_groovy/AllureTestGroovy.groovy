package allure_groovy

import io.qameta.allure.Allure
import spock.lang.Specification

import static io.qameta.allure.Allure.step

class AllureTestGroovy extends Specification {

    def testOperation() {
        given:

        step("Test", (Allure.ThrowableRunnableVoid)() -> {
            step ("Some internal step");
        });
    }
}

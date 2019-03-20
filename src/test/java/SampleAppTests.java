import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SampleAppTests {

    @Test
    @DisplayName("Should add numbers")
    void shouldAddNumbers() {
        SampleApp app = new SampleApp();
        assertEquals(app.add(1, 1), 2);
    }

}

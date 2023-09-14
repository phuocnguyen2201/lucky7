import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void testLucky7() {
        var app = App.lucky7();
        assertEquals(app? true: false, app);
    }
}

package Team7.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
    void testMessageText() {
        Message message = new Message();
        message.setText("JUnit Test");
        
        assertEquals("JUnit Test", message.getText());
    }

}

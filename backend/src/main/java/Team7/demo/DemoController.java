package Team7.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // ✅ Allows frontend to call this API
public class DemoController {

    @Autowired
    private MessageRepository repository;

    @GetMapping("/message")
    public List<Message> getAllMessages() {
        return repository.findAll();
    }
}

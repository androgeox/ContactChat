package Controller;

import Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;


}

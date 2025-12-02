package com.sahil.spring_boot_kickoff.controller;
import com.sahil.spring_boot_kickoff.model.HelloMessage;
import com.sahil.spring_boot_kickoff.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private HelloService helloService;

    @PostMapping
    public HelloMessage createMessage(@RequestBody HelloMessage message){
        return helloService.addMessage(message);
    }

    @GetMapping
    public List<HelloMessage> getAllMessages(){
        return helloService.getMessages();
    }

    @GetMapping("/{id}")
    public HelloMessage getMessageById(@PathVariable int id){
        return helloService.getMessageById(id);
    }

    @PutMapping("/{id}")
    public HelloMessage updateMessage(@PathVariable int id, @RequestBody HelloMessage body){
        return helloService.updateMessage(id, body.getMessage());
    }

    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable int id){
        boolean deleted = helloService.deleteMessage(id);
        return deleted ? "Deleted Succesfully" : "Message Not Found";
    }

}

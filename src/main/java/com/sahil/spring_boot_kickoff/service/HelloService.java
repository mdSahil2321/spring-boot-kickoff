package com.sahil.spring_boot_kickoff.service;
import com.sahil.spring_boot_kickoff.model.HelloMessage;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HelloService {

    private final List<HelloMessage> messages =new ArrayList<>();

    public HelloMessage addMessage(HelloMessage message){
        messages.add(message);
        return message;
    }

    public List<HelloMessage> getMessages(){
        return messages;
    }

    public HelloMessage getMessageById(int id){
        Optional<HelloMessage> msg=messages.stream().filter(m->m.getId()==id).findFirst();
        return msg.orElse(null);
    }

    public HelloMessage updateMessage(int id, String newMessage){
        for(HelloMessage msg:messages){
            if(msg.getId()==id){
                msg.setMessage(newMessage);
                return msg;
            }
        }
        return null;
    }

    public boolean deleteMessage(int id){
        return messages.removeIf(m->m.getId()==id);
    }
}

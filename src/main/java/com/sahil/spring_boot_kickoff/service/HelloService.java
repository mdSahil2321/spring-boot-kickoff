package com.sahil.spring_boot_kickoff.service;
import com.sahil.spring_boot_kickoff.model.HelloMessage;
import com.sahil.spring_boot_kickoff.repository.HelloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class HelloService {
    @Autowired

    private HelloRepo helloRepo;

    public HelloMessage addMessage(HelloMessage message){
        return helloRepo.save(message);
    }

    public List<HelloMessage> getMessages(){
        return helloRepo.findAll();
    }

    public HelloMessage getMessageById(int id){
        return helloRepo.findById(id).orElse(null);
    }

    public HelloMessage updateMessage(int id, String newMessage){
        HelloMessage msg = helloRepo.findById(id).orElse(null);
        if (msg !=null){
            msg.setMessage(newMessage);
            return helloRepo.save(msg);
        }
        return null;
    }

    public boolean deleteMessage(int id){
        if (helloRepo.existsById(id)){
            helloRepo.deleteById(id);
            return true;
        }
        return false;
    }
}

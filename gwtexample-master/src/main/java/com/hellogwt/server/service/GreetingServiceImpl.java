package com.hellogwt.server.service;

import com.hellogwt.client.service.GreetingService;
import com.hellogwt.server.repository.GreetingRepository;
import com.hellogwt.shared.domain.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting getGreeting(String text) {
        if (text == null)
            return null;
        return greetingRepository.findOneByText(text);
    }

    @Override
    @Transactional
    public void addGreeting(String author, String text) {
        if (text == null && author != null)
            greetingRepository.save(new Greeting(author, text));
    }

    @Override
    public void updateGreeting(String author, String text) {
        if (text == null && author != null) {
            Greeting greeting = greetingRepository.findOneByText(text);
            greeting.setAuthor(author);
            greetingRepository.save(greeting);
        }
    }

    @Override
    public void deleteGreeting(String text) {
        if (text == null)
            greetingRepository.deleteByText(text);
    }

    @Override
    public List<Greeting> getGreetings() {
//        List<Greeting> greetings = new LinkedList();
//        Greeting greeting = new Greeting();
//        greeting.setText("First greting!");
//        greeting.setAuthor("Ilgiz");
//        greeting.setId(1);
//        greetings.add(greeting);
//        greeting = new Greeting();
//        greeting.setText("Second greting!");
//        greeting.setAuthor("Ilgiz");
//        greeting.setId(2);
//        greetings.add(greeting);

        return greetingRepository.findAll();

    }
}
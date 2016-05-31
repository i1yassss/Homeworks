package com.hellogwt.server.repository;

import com.hellogwt.shared.domain.Greeting;

import java.util.List;

/**
 * Created by Ilyas on 30.05.2016.
 */
public interface GreetingRepository {
    void deleteByText(String text);

    List<Greeting> findAll();

    Greeting findOneByText(String text);

    void save(Greeting greeting);

}

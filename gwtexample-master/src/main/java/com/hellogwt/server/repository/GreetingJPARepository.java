package com.hellogwt.server.repository;

import com.hellogwt.shared.domain.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ilyas on 30.05.2016.
 */

public interface GreetingJPARepository extends JpaRepository<Greeting, Integer> {

    Greeting findOneByText(String text);

    void deleteByText(String text);

}

package org.practice2020.interfaces;

import org.practice2020.interfaces.model.Person;

public interface PersonFactory<P extends Person> {

    P create(String name, String login);

}

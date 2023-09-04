package dev.hass.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import dev.hass.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		logger.info("Finding all people");
		
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}
	
	private Person mockPerson(int i) {
		Person person =  new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Yuri " + i);
		person.setLastName("Hass " + i);
		person.setAddress("Timbó " + i);
		person.setGender("Male");
		
		return person;
	}

	public Person findById(String id) {
		logger.info("Finding one person");
		Person person =  new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Yuri");
		person.setLastName("Hass");
		person.setAddress("Timbó");
		person.setGender("Male");
		
		return person;
	}
	
	public Person create(Person person) {
		logger.info("Creating one person");
		return person;
	}
	
	public Person update(Person person) {
		logger.info("Updating one person");
		return person;
	}
	
	public void delete(String id) {
		logger.info("Deleting one person");
	}

}

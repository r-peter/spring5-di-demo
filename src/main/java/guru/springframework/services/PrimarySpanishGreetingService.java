package guru.springframework.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

	public PrimarySpanishGreetingService(@Qualifier("greetingRepositoryImpl") GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	private GreetingRepository greetingRepository;

	@Override
	public String sayGreeting() {
		return greetingRepository.getSpanishGreeting();
	}
}

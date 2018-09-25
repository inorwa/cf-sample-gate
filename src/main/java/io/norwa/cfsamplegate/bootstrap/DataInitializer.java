package io.norwa.cfsamplegate.bootstrap;

import io.norwa.cfsamplegate.models.UserEntity;
import io.norwa.cfsamplegate.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	private UserRepository userRepository;

	public DataInitializer(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}

	private void initData(){
		userRepository.deleteAll();
		UserEntity userEntity = new UserEntity("login","givenname","familyname");
		userRepository.save(userEntity);
	}
}

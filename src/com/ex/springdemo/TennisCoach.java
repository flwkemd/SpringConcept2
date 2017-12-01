package com.ex.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStudff() {
		System.out.println(">> TennisCoach : init method");
	}
	
	// define my destory method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach : destory method");
	}
	
	
	// define a setter method
	/*@Autowired
	public void anyName(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : setter method");
		this.fortuneService = fortuneService;
	}*/
	
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice tennis";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

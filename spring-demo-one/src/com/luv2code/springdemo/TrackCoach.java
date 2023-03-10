package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach() {}
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneServiceto get a fortune
		return "TC: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
		public void doMyCleanupStuff() {
			System.out.println("TrackCoach: inside method doMyCleanupStuff");
		}

}

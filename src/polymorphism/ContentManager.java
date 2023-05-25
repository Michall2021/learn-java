package polymorphism;

import typesOfClasses.User;

public class ContentManager extends User{
	
	public void validateAccessRights() {
		System.out.println("I'm a content manager. I have no enough rights to withdraw money.");
	}

	public ProfileInformationData getProfileInformtaion(Profile profile) {
		return new AccountInformation();
	}
}

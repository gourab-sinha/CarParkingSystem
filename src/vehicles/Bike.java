package vehicles;

import users.User;

public class Bike extends Vehicle{

    public Bike(User user, String registrationNo){
        super(user, registrationNo);
    }
    @Override
    public void drive() {
        System.out.println("Driving Bike");
    }
}

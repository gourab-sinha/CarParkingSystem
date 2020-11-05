package vehicles;

import users.User;

public class Bus extends Vehicle{
    public Bus(User user, String registrationNo){
        super(user, registrationNo);
    }

    @Override
    public void drive() {
        System.out.println("Driving Bus");
    }
}

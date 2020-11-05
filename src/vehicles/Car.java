package vehicles;

import users.User;

public class Car extends Vehicle{

    public Car(User user, String registrationNo){
        super(user, registrationNo);
    }
    @Override
    public void drive() {
        System.out.println("Driving Car");
    }
}

package vehicles;

import users.User;

public abstract class Vehicle {
    public User user;
    public String registrationNo;

    public Vehicle(User user, String registrationNo){
        this.user=user;
        this.registrationNo=registrationNo;
    }

    public abstract void drive();

}

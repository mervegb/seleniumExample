package users;


public class UserPool {

    public static User getValidUser() {
        return new User("email", "asd");
    }

    public static User getUserWithWrongPassword() {
        return new User("email", "dghsajkldas");
    }

    public static User getUserWithEmptyPassword() {
        return new User("email", "");
    }

    public static User getUserWithEmptyEmailAndPassword() {
        return new User("", "");
    }
}

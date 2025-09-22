
abstract class User {
    
    abstract void showMessage();

    
    void displayUserType() {
        System.out.println("User type selected");
    }
}


class AdminUser extends User {
    @Override
    void showMessage() {
        System.out.println("Welcome, Admin!");
    }
}


class GuestUser extends User {
    @Override
    void showMessage() {
        System.out.println("Welcome, Guest!");
    }
}


public class messages {
    public static void main(String[] args) {
        
        User admin = new AdminUser();
        admin.displayUserType();
        admin.showMessage();

        System.out.println(); 

        
        User guest = new GuestUser();
        guest.displayUserType();
        guest.showMessage();
    }
}

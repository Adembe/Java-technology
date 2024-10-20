package Seminar4;

public class IllegalCoffeeException extends Exception{
    String message;
    public IllegalCoffeeException(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

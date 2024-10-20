package Seminar4;

public class IllegalTriangleException extends Exception{
    String message;
    public IllegalTriangleException(String message) {
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

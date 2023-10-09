package exceptions;

public class BancaException extends Exception{
    String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BancaException{" +
                "message='" + message + '\'' +
                '}';
    }
}

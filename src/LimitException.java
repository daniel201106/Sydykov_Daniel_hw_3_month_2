public class LimitException extends Exception{

    public double getRemeniningAmount() {
        return remeniningAmount;
    }

    public void setRemeniningAmount(double remeniningAmount) {
        this.remeniningAmount = remeniningAmount;
    }

    public LimitException(String message, double remeniningAmount){
        super(message);
        this.remeniningAmount = remeniningAmount;
    }
    private double remeniningAmount;
}

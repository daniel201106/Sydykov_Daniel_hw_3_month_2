public class BankAccount {

    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void Deposit(double sum ) throws LimitException{
        amount += sum;
        System.out.println("Вы паполнили счет на " + (int) getAmount() + " Dollar");
    }

    public void withDrew(int sun) throws LimitException {
        if(sun > amount){
            throw new LimitException("У тебя слишком мало денег ", amount);
        }else {
            amount -= sun ;
            System.out.println("Вы сняли " + sun + " Dollar " + "Остаток на счету " + amount);

        }

    }
}

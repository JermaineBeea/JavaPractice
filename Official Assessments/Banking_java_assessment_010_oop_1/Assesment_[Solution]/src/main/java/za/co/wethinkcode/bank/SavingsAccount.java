package za.co.wethinkcode.bank;

public class SavingsAccount extends Account{

    private final Money MINBALANCE = new Money(0);
    private Money availableBalance = new Money(0);
    private String accountName;

    public SavingsAccount() {
        accountName = "Savings Account";
    }

    public SavingsAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public Money getAvailableBalance() {
        return availableBalance;
    }

    @Override
    public String accountName() {
        return accountName;
    }

    @Override
    public void renameAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void creditAccount(Money creditAmount) {
        availableBalance = availableBalance.add(creditAmount);
    }

    @Override
    public void debitAccount(Money debitAmount) {
        if (!insufficientFunds(debitAmount)) availableBalance  = availableBalance.subtract(debitAmount);
        else System.out.println("Insufficient Funds");
    }

    private boolean insufficientFunds(Money debitAmount) {
        return (availableBalance.subtract(debitAmount)).compareTo(MINBALANCE) < 0;
    }
}

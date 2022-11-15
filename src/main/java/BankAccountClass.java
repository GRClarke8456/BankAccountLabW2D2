public class BankAccountClass {
//    Making private properties
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Integer accountNumber;
    private Double balance;

//    Constructor
    public BankAccountClass(String firstName, String lastName, String dateOfBirth, Integer accountNumber,
                            Double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//   Methods
    public Double deposit(Double a){
        return a + this.balance;
    }
    public Double withdrawal(Double b){
        return this.balance - b;
    }
    public Double payInterest(Double c){
        return this.balance * c;
    }

//    GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public Integer getAccountNumber(){
        return this.accountNumber;
    }
    public Double getBalance(){
        return this.balance;
    }

//    SETTERS
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setDateOfBirth(String newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }
    public void setAccountNumber(Integer newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

class BankAccount{
    constructor(accountNumber, accountHolderName,accountBalance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountBalance=accountBalance;
    }
    getCurrentBalance=function(){
        console.log(this.accountBalance);
    }}
class Savings extends BankAccount{
constructor(accountNumber, accountHolderName,accountBalance,isSalary){
    super(accountNumber, accountHolderName,accountBalance);
    this.isSalary=isSalary;
}
withdraw=function(amount){
if(this.accountBalance>=amount){
    this.accountBalance-=amount;
}
else{
    console.log("insufficient balance");
}}}
class Current extends BankAccount{
    constructor(accountNumber, accountHolderName,accountBalance,odLimit){
        super(accountNumber, accountHolderName,accountBalance);
        this.odLimit=odLimit;
    }
    withdraw=function(amount){
        if(this.accountBalance+this.odLimit>=amount){
            this.accountBalance-=amount;
        }
        else{
            console.log("amount exceeding odLimit");
        }}}

    const savings=new Savings(51823343,"Queany Gonsalves",50000,true);
    const current=new Current(21344234,"Kevin Gonsalves",70000,10000);
    savings.withdraw(10000);
    savings.getCurrentBalance();
    savings.withdraw(80000);
    savings.getCurrentBalance();
    current.withdraw(75000);
    current.getCurrentBalance();
    current.withdraw(50000);
    current.getCurrentBalance();
    
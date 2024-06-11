console.log("hello");

class BankAccount{
    #balance
    #acctNum
    static #count = 0
    constructor(_balance){
        this._balance = _balance
        this.acctNum = ++(BankAccount.#count)
    }

    get balance(){
        return this._balance
    }
    
    get acctNum(){
        return this._acctNum
    }
    set acctNum(account){
        this._acctNum = account
    }

    deposit(amount){
        if (amount >=0)
            this._balance += amount
        else throw new Error("Deposit must be greater than zero")
             return amount
            
    }

    withdraw(amount){
        if (amount <= this._balance)
            this._balance - amount
        return amount
    }

    checkBal(amount){
        return this._balance
    }
}
    const acct1 = new BankAccount(100)
    console.log(acct1)


    

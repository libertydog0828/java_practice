class Account{
    private String Name;
    private String No;
    private long Balance;   //zandaka//
    private Day Openday;

    //Constructer//
    public Account(String n, String num, long b, Day d){
        this.Name = n; this.No = num; this.Balance = b;
        this.Openday = new Day(d);
    }
    
    //get name, num, balace, Openday//
    public String getNmae(){ return this.Name; }
    public String getNo() { return this.No; }
    public long getBalance() { return this.Balance; }
    public Day getOpenday() { return new Day(Openday); }

    //set name, num, balance//
    public void setName(String name){ this.Name = name; }
    public void setNo(String num){ this.No = num; }
    public void setBalance(long z){ this.Balance = z; }

    //deposit method//
    public void Deposit(long k){
        this.Balance += k;
    }

    //withdraw method//
    public void Withdraw(long k){
        if(this.Balance <= 0){
            System.out.print("You can't withdraw\n");
        }
        else this.Balance -= k;
    }

    //Account information//
    public String toString(){
        return "{ " + this.Name + ", " + this.No + ", "
        + this.Balance + " , " + this.Openday + " } ";
    }
}
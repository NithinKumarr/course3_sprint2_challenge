public class SavingAccountImp {
    public static void main (String[]args){
        SavingAccount savingaccount=new SavingAccount(775967894,"Sam",5000,"Active");
        savingaccount.Display();
        savingaccount.withdrawCash(2000);
        savingaccount.depositCash(1000);
        savingaccount.fundTransfer(1000);
    }
}

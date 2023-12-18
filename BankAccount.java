public class BankAccount {
    int count;
    String name;
    
    

    public BankAccount() {
        this.count = count;
        this.name = name;
    }

    public void addMoneyToCount() {
        count += 500;
    }

    public void limit() {
        if (count > 5000) {
            System.out.println("You can't add money becouse on your account limit");
            count = 5000;
        }
    }
    public void transitMoney(int a,String name2){
        if(count<=a){
            System.out.println("You heavan't");
            return;
        }
        count -=a;
        System.out.println(name + "transit : " + a + "$" + "to" + name.replace(name,name2));

    } 
}

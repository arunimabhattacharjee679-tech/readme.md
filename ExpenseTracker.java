import java.util.Scanner;
import java.util.ArrayList;
class Transaction {
    private int amount;
    private String date;
    private String category;
    private String description;

    Transaction(int amount,String date,String category,String description){
        this.amount=amount;
        this.date=date;
        this.category=category;
        this.description=description;
    }

    public int getamount(){
        return amount;
    }
    public String getdate(){
        return date;
    }
    public String getcategory(){
        return category;
    }
    public String getdescription(){
        return description;
    }
    public void setamount(int amount){
        this.amount=amount;
    }
    public void setadate(String date){
        this.date=date;
    }
    public void setcategory(String category){
        this.category=category;
    }
    public void setdescription(String description){
        this.description=description;
    }
}
class ExpenseTracker{
    public static void main(String[] args) {
        ArrayList<Transaction> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        
        
        boolean running=true;

        System.out.println("enter starting amount:");
        int currBalance=sc.nextInt();
        sc.nextLine();
        if(currBalance<0){
            System.out.println("Sorry you are running low");
            return;
        }

        while(running){
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transactions");
            System.out.println("3. View Current Balance");
            System.out.println("4. Edit transaction");
            System.out.println("5. Delete Transaction");
            System.out.println("6. Exit");
        
            System.out.println("enter your choice:");
            int button=sc.nextInt();
            sc.nextLine();

            switch(button){
                case 1:
                    System.out.println("how much spend/income:");
                    int amount=sc.nextInt();
                    sc.nextLine();

                    System.out.println("enter date:");
                    String date=sc.nextLine();

                    System.out.println("enter category:");
                    String category=sc.nextLine();
                    while(!category.equalsIgnoreCase("income") && !category.equalsIgnoreCase("spend")){
                        System.out.println("Invalid! Please enter income or spend");
                        category=sc.nextLine();
                    }

                    System.out.println("tell us the description:");
                    String description=sc.nextLine();
        
                    if(category.equalsIgnoreCase("income")){
                        currBalance=currBalance+amount;
                    }
                    else if(category.equalsIgnoreCase("spend")){
                        currBalance=currBalance-amount;
                    }
                    else{
                        System.out.println("Invalid");
                        return;
                    }

                    Transaction obj=new Transaction(amount,date,category,description);
                    list.add(obj);
                    System.out.println("Transaction added successfully!!");
                    break;

                case 2:
                    System.out.println("all transactions are");
                    if(list.size()==0){
                        System.out.println("no transaction available");
                    }
                    else{
                        for(int i=0;i < list.size();i++){
                            Transaction t=list.get(i);
                            System.out.println("Transaction:"+(i+1));
                            System.out.println("------Transaction details--------");
                            System.out.println("amount:"+t.getamount());
                            System.out.println("date:"+t.getdate());
                            System.out.println("category:"+t.getcategory());
                            System.out.println("description:"+t.getdescription());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is:"+currBalance);
                    break;

                case 4:
                    System.out.println("Enter transaction number want to edit:");
                    int num=sc.nextInt();
                    sc.nextLine();
                    if(num<1 || num>list.size()){
                        System.out.println("Invalid Transaction!!");
                        break;
                    }
                    Transaction t=list.get(num-1); 
                    list.remove(num-1);

                    if(t.getcategory().equalsIgnoreCase("income")){
                        currBalance=currBalance-t.getamount();
                    }
                    else if(t.getcategory().equalsIgnoreCase("spend")){
                        currBalance=currBalance+t.getamount();
                    }
                    System.out.println("how much spend/income:");
                    int newAmount=sc.nextInt();
                    sc.nextLine();

                    System.out.println("enter date:");
                    String newDate=sc.nextLine();

                    System.out.println("enter category:");
                    String newCategory=sc.nextLine();
                    while(!newCategory.equalsIgnoreCase("income") && !newCategory.equalsIgnoreCase("spend")){
                        System.out.println("Invalid! Please enter income or spend");
                        newCategory=sc.nextLine();
                    }

                    System.out.println("tell us the description:");
                    String newDescription=sc.nextLine();
                    
        
                    if(newCategory.equalsIgnoreCase("income")){
                        currBalance=currBalance+newAmount;
                    }
                    else if(newCategory.equalsIgnoreCase("spend")){
                        currBalance=currBalance-newAmount;
                    }
                    else{
                        System.out.println("Invalid");
                        return;
                    }

                    Transaction obj1=new Transaction(newAmount,newDate,newCategory,newDescription);
                    list.add(obj1);
                    break;

                case 5:
                    if(list.size()==0){
                        System.out.println("Invalid");
                        break;
                    }
                    System.out.println("Enter transaction number to delete:");
                    int n=sc.nextInt();
                    sc.nextLine();
                    if(n<1 || n>list.size()){
                        System.out.println("Invalid Transaction!!");
                        break;
                    }
                    Transaction T=list.get(n-1);
                    if(T.getcategory().equalsIgnoreCase("income")){
                        currBalance=currBalance-T.getamount();
                    }
                    else if(T.getcategory().equalsIgnoreCase("spend")){
                        currBalance=currBalance+T.getamount();
                    }
                    list.remove(n-1);
                    System.out.println("Transaction deleted Successfully!!");
                    break;

                case 6:
                    System.out.println("Thanks for using us!!");
                    running=false;
                    break;

                default:
                    System.out.println("Invalid choice!");
                }
            }
        sc.close();
    }
}

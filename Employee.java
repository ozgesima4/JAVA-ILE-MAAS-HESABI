package javaapplication37;

public class Employee {
    String name;
    double salary;
    int workhouse;
    int hearyear;
    

    public Employee(String name, double salary, int workhouse, int hearyear) {
        this.name = name;
        this.salary = salary;
        this.workhouse = workhouse;
        this.hearyear = hearyear;
    }
   double tax(){
        if(this.salary < 1000){
          return 0;
        }
      return (this.salary*0.03);
       
    }
    
    int bonus(){
        if(this.workhouse-40 > 0){
           return(this.workhouse-40)*30; 
        }else{
            return 0;
        }
    }
    double raisesalary(){
        double maasartisi;
        if(2021-this.hearyear < 10){
        return maasartisi=(this.salary*0.05);
        }
        else if(2021-this.hearyear > 9 && 2021-this.hearyear < 20){
        return maasartisi=(this.salary*0.10);
        }
        else if(2021-this.hearyear > 19){
        return  maasartisi=(this.salary*0.15);
        }
        return 0;
    }
    
    void tostring(){
        System.out.println("adi\t:"+this.name+ "maasi\t:"+this.salary+" calisma saati\t:"+this.workhouse+" bas yili\t:"+this.hearyear);
        System.out.println("vergi\t:"+tax());
        System.out.println("bonus\t"+bonus());
        System.out.println("maas artisi\t "+raisesalary());
        System.out.println("vergi ve bonusla beraber maas \t"+((this.salary)-tax()+bonus()));
        
        
        
    }
}

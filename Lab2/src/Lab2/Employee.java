package Lab2;

public class Employee {

   int e_id;
   String e_name;
   String e_soc_num;
   double e_sal;


   public Employee(){
       //no-arg constructor
   }

   //We need to get values, so we use Accessor method.

    public int getE_id(){
       return e_id;
    }

    public String getE_name(){
        return e_name;
    }

    public String getE_soc_num(){
        return e_soc_num;
    }

    public double getE_sal(){
        return e_sal;
    }

    //Second step we need to pull out values from Accessor method by Mutator method.

    public void setE_id(int e_id){
       this.e_id = e_id;
    }

    public void setE_name(String e_name){
       this.e_name = e_name;
    }

    public void setE_sal(double e_sal) {
        this.e_sal = e_sal;
    }

    public void setE_soc_num(String e_soc_num) {
        this.e_soc_num = e_soc_num;
    }
}

package com.learning;

/*Create a class named 'Employee' with String variable ‘emp_name' and 
 * integer variable ‘emp_id’ and String variable 'address'. 
 * Assign the value of emp_id as '1001' and name as "James" and 
 * address as “13th St, New York” by 
 * creating an object of the class Employee.

And finally print this employee details like 
“Employee Name is James and Employee ID is 1001 and Employee Address is 13th St, New York” 
[Exactly same text including lowercase, uppercase and spaces]
*/

class Employee{
    String emp_name;
    int emp_id;
    String address;
   Employee(String emp_name,int emp_id,String address){
       this.emp_name = emp_name;
       this.emp_id=emp_id;
       this.address=address;
   }
}

public class Exercise2 {
  
    public static void main(String[] args){
        

        System.out.println(printDetails());
    }
        public static String printDetails(){
            Employee james=new Employee("James",1001,"13th St, New York");
        return "Employee Name is "+james.emp_name+" and Employee ID is "+ james.emp_id+" and Employee Address is "+james.address;
        // TODO : Return the result here [ex: return "hello";]
    }
}
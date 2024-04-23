package org.example.proxy;

public class TestMain {
    public static void main(String[] args) {

        try{
            EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
            employeeDaoProxy.create("ADMIN", new Employee());
            System.out.println("Operation successful");
        }catch (Exception e){
            System.out.println("Exception occurred");
        }

    }
}

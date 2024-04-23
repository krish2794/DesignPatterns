package org.example.proxy;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee obj) {
        System.out.println("Creating object");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Deleting object");
    }
}

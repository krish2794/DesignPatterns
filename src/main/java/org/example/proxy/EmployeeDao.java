package org.example.proxy;

public interface EmployeeDao {
    void create(String client, Employee obj) throws Exception;

    void delete(String client, int employeeId);
}

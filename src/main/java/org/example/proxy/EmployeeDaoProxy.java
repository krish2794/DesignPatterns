package org.example.proxy;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImpl employeeDao;

    EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.create(client,obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) {
        employeeDao.delete(client,employeeId);
    }
}

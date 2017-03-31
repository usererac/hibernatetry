package hello;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ManageEmployee {
    private static SessionFactory factory;

    public static void main(String... args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        ManageEmployee me = new ManageEmployee();

        HashSet<Certificate> set1 = new HashSet<Certificate>();
        set1.add(new Certificate("MCA"));
        set1.add(new Certificate("MBA"));
        set1.add(new Certificate("CSE"));
        Integer empID1 = me.addEmployee("Manoj", "Kumar", 40000, set1);

        HashSet<Certificate> set2 = new HashSet<Certificate>();
        set2.add(new Certificate("BTECH"));
        set2.add(new Certificate("BARCH"));
        Integer empID2 = me.addEmployee("Mahesh", "Kothuru", 343333,set2);

        me.listEmployees();
        me.updateEmployee(empID1, 632222);
        me.deleteEmployee(empID2);
        me.listEmployees();



    }

    private Integer addEmployee(String fname, String lname, int salary, Set cert) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeId = null;
        try{
            tx= session.beginTransaction();
            EmployeeH employee = new EmployeeH(fname,lname,salary);
            employee.setCertificates(cert);
            employeeId = (Integer)session.save(employee);
            tx.commit();
        }catch (HibernateException e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        return employeeId;
    }

    private void listEmployees() {
        Session session = factory.openSession();

    }

    private void deleteEmployee(Integer empId) {
    }

    private void updateEmployee(Integer empId, int salary) {
    }
}

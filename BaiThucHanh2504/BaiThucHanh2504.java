package packBaiTap;

import packBaiTap.Person;
import packBaiTap.Customer;
import packBaiTap.VIPCustomer;
import packBaiTap.Employee;
import packBaiTap.FullTimeEmployee;
import packBaiTap.PartTimeEmployee;
import packBaiTap.Student;
import packBaiTap.OfflineStudent;
import packBaiTap.OnlineStudent;
public class app1904{
    public static void main(String[] args){
        Person ps = new Person("Person", 18);
        Student std = new Student("Student", 18, 4.0);
        OfflineStudent off = new OfflineStudent("Off", 18, "Co");
        OnlineStudent onl = new OnlineStudent("Onl", 18, "Co");
        Customer ct = new Customer("Customer", 18, 50000);
        VIPCustomer vct = new VIPCustomer("VIP", 18, 5000, 3.1);
        Employee e = new Employee("Employee", 18, 1);
        PartTimeEmployee e1 = new PartTimeEmployee("Part time",18, 2, 10, 50000);
        FullTimeEmployee e2 = new FullTimeEmployee("Full time",18, 3, 10000000, 5);
        ps.display();
        std.display();
        off.display();
        onl.display();
        ct.display();
        vct.display();
        e.display();
        e1.display();
        e2.display();
    }
}
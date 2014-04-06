package defender.methods;

/**
 * Created by yfain11 on 3/31/14.
 */
public class Employee extends Person implements Payable {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.increasePay();  // using default increasePay() implementation
    }
}

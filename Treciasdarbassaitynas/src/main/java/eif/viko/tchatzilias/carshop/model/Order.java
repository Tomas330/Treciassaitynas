/**

 The Order class represents an order in the computer shop.
 It contains information about the order date, the list of customers, and the list of computers in the order.
 */
package eif.viko.tchatzilias.carshop.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity(name = "Orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String orderDate;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Customer> customers;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Car> cars;

    public Order() {}
    /**
     * Constructs an Order object with the specified id, order date, list of customers, and list of computers.
     *
     * @param id         the id of the order
     * @param orderDate  the date of the order
     * @param customers  the list of customers in the order
     * @param cars  the list of cars in the order
     */
    public Order(Long id, String orderDate, List<Customer> customers, List<Car> cars) {
        this.id = id;
        this.orderDate = orderDate;
        this.customers = customers;
        this.cars = cars;
    }
    /**
     * Constructs an Order object with the specified order date, list of customers, and list of computers.
     *
     * @param orderDate  the date of the order
     * @param customers  the list of customers in the order
     * @param cars  the list of computers in the order
     */
    public Order(String orderDate, List<Customer> customers, List<Car> cars) {
        this.orderDate = orderDate;
        this.customers = customers;
        this.cars = cars;
    }
    /**
     * Returns the id of the order.
     *
     * @return the id of the order
     */
    public Long getId() {
        return id;
    }
    /**
     * Sets the id of the order.
     *
     * @param id  the id of the order
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * Returns the date of the order.
     *
     * @return the date of the order
     */
    public String getOrderDate() {
        return orderDate;
    }
    /**
     * Sets the date of the order.
     *
     * @param orderDate  the date of the order
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Returns the list of customers in the order.
     *
     * @return the list of customers in the order
     */
    public List<Customer> getCustomers() {
        return customers;
    }
    /**
     * Sets the list of customers in the order.
     *
     * @param customers  the list of customers in the order
     */
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    /**
     * Returns the list of cars in the order.
     *
     * @return the list of cars in the order
     */
    public List<Car> getCars() {
        return cars;
    }
    /**
     * Sets the list of computers in the order.
     *
     * @param cars  the list of computers in the order
     */
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    /**
     * Checks if this Order is equal to the specified object.
     *
     * @param o  the object to compare
     * @return true if the Orders are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Order)) {
            return false;
        }

        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(customers, order.customers) &&
                Objects.equals(cars, order.cars);
    }
    /**
     * Generates the hash code for this Order.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, customers, cars);
    }
    /**
     * Returns the string representation of the Order.
     *
     * @return the string representation of the Order
     */
    @Override
    public String toString() {
        return String.format("Order:\n\t Date = %s\n\t" +
                        "Customers: \n\t%s" +
                        "Computers:\n\t\t%s",
                this.orderDate,
                this.customers,
                this.cars,
                constructCustomerString(),
                constructCarString());
    }
    /**
     * Constructs and returns a string representation of the customers in the order.
     *
     * @return the string representation of the customers in the order
     */
    private String constructCustomerString(){
        String resultCustomer = "";
        for(Customer customer : this.customers){
            resultCustomer += customer.toString();
        }
        return resultCustomer;
    }
    /**
     * Constructs and returns a string representation of the computers in the order.
     *
     * @return the string representation of the computers in the order
     */
    private String constructCarString(){
        String resultComputer = "";
        for(Car car : this.cars){
            resultComputer += car.toString();
        }
        return resultComputer;
    }
}
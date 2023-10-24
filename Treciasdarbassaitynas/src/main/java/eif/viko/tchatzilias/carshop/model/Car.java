/**

 The Computer class represents a computer in the computer shop.
 It contains information about the computer's id, name, parts, years, and price.
 */
package eif.viko.tchatzilias.carshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Car {
    private @Id @GeneratedValue Long id;
    private String carName;
    private String engine;
    private String years;
    private Double price;
    /**
     * Constructs an empty Car object.
     */
    public Car() {};
    /**
     * Constructs a Car object with the specified id, name, engine, years, and price.
     *
     * @param id            the id of the car
     * @param carName  the name of the car
     * @param engine         the parts of the car
     * @param years         the years of the car
     * @param price         the price of the car
     */
    public Car(Long id, String carName, String engine, String years, Double price) {
        this.id = id;
        this.carName = carName;
        this.engine = engine;
        this.years = years;
        this.price = price;
    }
    /**
     * Constructs a Car object with the specified name, engine, years, and price.
     *
     * @param carName  the name of the car
     * @param engine         the parts of the car
     * @param years         the years of the car
     * @param price         the price of the car
     */

    public Car(String carName, String engine, String years, Double price) {
        this.carName = carName;
        this.engine = engine;
        this.years = years;
        this.price = price;
    }
    /**
     * Returns the id of the car.
     *
     * @return the id of the car
     */
    public Long getId() {
        return id;
    }
    /**
     * Sets the id of the car.
     *
     * @param id  the id of the car
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * Returns the name of the car.
     *
     * @return the name of the car
     */
    public String getCarName() {
        return carName;
    }
    /**
     * Sets the name of the car.
     *
     * @param carName  the name of the car
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }
    /**
     * Returns the parts of the car.
     *
     * @return the parts of the car
     */
    public String getEngine() {
        return engine;
    }
    /**
     * Sets the parts of the car.
     *
     * @param parts  the parts of the car
     */
    public void setEngine(String parts) {
        this.engine = parts;
    }
    /**
     * Returns the years of the car.
     *
     * @return the years of the car
     */
    public String getYears() {
        return years;
    }
    /**
     * Sets the years of the car.
     *
     * @param years  the years of the car
     */
    public void setYears(String years) {
        this.years = years;
    }
    /**
     * Returns the price of the car.
     *
     * @return the price of the car
     */
    public Double getPrice() {
        return price;
    }
    /**
     * Sets the price of the car.
     *
     * @param price  the price of the car
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    /**
     * Checks if this Car is equal to the specified object.
     *
     * @param o  the object to compare
     * @return true if the Car are equal, false otherwise
     */
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (!(o instanceof Car)){
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(this.id, car.id)
                && Objects.equals(this.engine, car.engine)
                && Objects.equals(this.carName, car.carName)
                && Objects.equals(this.price, car.price)
                && Objects.equals(this.years, car.years);
    }
    /**
     * Generates the hash code for this Car.
     *
     * @return the hash code
     */
    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.engine, this.carName, this.price, this.years);
    }

    @Override
    public String toString() {
        return String.format("\tTrip:\n\t\t\t\t" + "Car name = %s\n\t\t\t\t" + "engine = %s\n\t\t\t\t" +
                        "years = %s\n\t\t\t\t" + "price = %s\n\t\t\t\t",
                this.carName,
                this.engine,
                this.years,
                this.price);
    }

}

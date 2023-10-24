package eif.viko.tchatzilias.carshop.configuration;

import eif.viko.tchatzilias.carshop.OrderRepository;
import eif.viko.tchatzilias.carshop.model.Order;
import eif.viko.tchatzilias.carshop.model.Customer;
import eif.viko.tchatzilias.carshop.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(OrderRepository repository){

        Car car1 = new Car("BMW 435", "2979 cm³, 394 AG (290kW)", "2015", 19990.00);
        Customer customer1 = new Customer("Tomas", "Kandis");
        Order order1 = new Order("2023-10-16", List.of(customer1), List.of(car1));

        Car car2 = new Car( "Mazda MX-5", "1800 cm³, 254 AG (187kW)", "1999", 9000.00);

        Customer customer01 = new Customer("MIgruotas", "Lokys");

        Customer customer02 = new Customer("Julius", "Sviesmetis");

        Order order2 = new Order("2023-04-10", List.of(customer01,customer02), List.of(car2));


        return args -> {
            log.info("Loading" + repository.save(order1));
            log.info("Loading" + repository.save(order2));
        };

    }
}
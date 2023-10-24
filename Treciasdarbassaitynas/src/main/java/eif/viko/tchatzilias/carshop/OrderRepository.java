package eif.viko.tchatzilias.carshop;

import eif.viko.tchatzilias.carshop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
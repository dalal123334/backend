package ma.enset.ebackingbachend1.repositories;

import ma.enset.ebackingbachend1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

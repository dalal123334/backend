package ma.enset.ebackingbachend1.repositories;

import ma.enset.ebackingbachend1.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {
}

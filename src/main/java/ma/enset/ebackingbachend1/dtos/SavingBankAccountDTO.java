package ma.enset.ebackingbachend1.dtos;

import lombok.Data;
import ma.enset.ebackingbachend1.enums.AccountStatus;

import java.util.Date;
@Data
public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}


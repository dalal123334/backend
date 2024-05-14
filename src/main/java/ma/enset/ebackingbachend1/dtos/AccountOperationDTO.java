package ma.enset.ebackingbachend1.dtos;

import lombok.Data;
import ma.enset.ebackingbachend1.enums.OperationType;

import java.util.Date;
@Data
public class AccountOperationDTO {private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

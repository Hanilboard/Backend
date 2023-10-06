package HanilBoard.hanil.Domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@Getter
public class Address {
    private String address;
    private String detail_address;
    private String zipcode;
}

package HanilBoard.hanil.Domain.product;

import lombok.Getter;

import javax.persistence.*;

@Entity@Getter
public class OptionChild {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private OptionParent optionParent;
    private String name;
    private Long additional_price;
}

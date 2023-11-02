package HanilBoard.hanil.Domain.product;

import lombok.Getter;

import javax.persistence.*;

@Entity@Getter
public class OptionChild {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_parent_id")
    private OptionParent optionParent;

    private String name;
    private Long additional_price;
}

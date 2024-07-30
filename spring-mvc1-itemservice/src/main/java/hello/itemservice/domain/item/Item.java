package hello.itemservice.domain.item;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

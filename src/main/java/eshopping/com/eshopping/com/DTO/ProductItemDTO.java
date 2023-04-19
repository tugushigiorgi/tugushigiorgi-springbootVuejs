package eshopping.com.eshopping.com.DTO;

import lombok.*;

import java.util.List;
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductItemDTO {
    public Long  id;
    public String ProductName;
    public String Price;
    public List<String> Images;
    public String DetailedLink ;



}

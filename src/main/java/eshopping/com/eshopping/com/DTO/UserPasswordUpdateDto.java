package eshopping.com.eshopping.com.DTO;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserPasswordUpdateDto {

   public String oldpassword;
    public   String newpassword;




}

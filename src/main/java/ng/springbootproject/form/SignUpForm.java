/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.form;

/**
 *
 * @author RAJAB IMAM
 */
import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class SignUpForm {

    @NotBlank
    @Email
    private String userId;

    @NotBlank
    @Length(min = 4, max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String password;

    @NotBlank
    private String userName;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date birthday;

    @Min(20)
    @Max(100)
    private Integer age;
    
    @NotNull
    private Integer gender;
}

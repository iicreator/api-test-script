package ren.eatbox.request;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName: Login
 * @Description: TODO
 **/
@Data
@ToString
public class LoginRequest{
    private String username;
    private String password;
}

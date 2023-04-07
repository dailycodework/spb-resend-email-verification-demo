package com.dailycodework.sbemailverificationdemo.registration.password;

import lombok.Data;

/**
 * @author Sampson Alfred
 */
@Data
public class PasswordResetRequest {
    private String email;
    private String oldPassword;
    private String newPassword;
}

package com.gwendolinanna.auth.ws.app.ui.model.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Johnkegd
 */
@Getter
@Setter
public class PasswordResetModel {
    private String token;
    private String password;
}

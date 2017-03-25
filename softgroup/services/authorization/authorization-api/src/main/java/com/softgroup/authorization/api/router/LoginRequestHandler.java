package com.softgroup.authorization.api.router;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.common.router.api.AbstractRequestHandler;

public class LoginRequestHandler
        extends AbstractRequestHandler<LoginRequest, LoginResponse>
        implements AuthorizationRequestHandler{

}

package com.au.data2ml.uaa.web.rest.errors;

public class PhoneAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public PhoneAlreadyUsedException() {
        super(ErrorConstants.PHONE_ALREADY_USED_TYPE, "Phone number already used!", "userManagement", "phoneexists");
    }
}

package com.example.webservice.domains.common.sms.services;

public interface SmsService {
    boolean sendSms(String phoneNumber, String message);
}

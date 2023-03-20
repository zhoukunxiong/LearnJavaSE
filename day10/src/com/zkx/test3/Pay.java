package com.zkx.test3;
//接口定义支付方式
public interface Pay {
    //支付平台支付
    void paymentPlatforms();

    //银行卡网银支付
    void banksCards();

    //信用卡快捷支付
    void creditCards();
}

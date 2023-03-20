package com.zkx.test3;

public class PayImplments implements Pay {
    @Override
    public void paymentPlatforms() {
        System.out.println("支付平台支付");
    }

    @Override
    public void banksCards() {
        System.out.println("银行卡网银支付");
    }

    @Override
    public void creditCards() {
        System.out.println("信用卡快捷支付");
    }
}

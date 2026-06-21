package _12_design_patterns.files.adapter;

import _12_design_patterns.files.adapter.iface.ExternalBankExposedAPIHandler;

class YesBankExposedAPIHandler implements ExternalBankExposedAPIHandler{

    private final YesBankExposedAPI yesBankExposedAPI;

    YesBankExposedAPIHandler(YesBankExposedAPI yesBankExposedAPI){
        this.yesBankExposedAPI=yesBankExposedAPI;
    }

    @Override
    public boolean pay(int amount) {
        try {
            return yesBankExposedAPI.payAmount(amount);
        } catch(IllegalArgumentException e) {
            System.out.println("Payment failed");
            return false;
        }
    }

    @Override
    public int checkBalance() {
        return yesBankExposedAPI.viewBalance();
    }
}

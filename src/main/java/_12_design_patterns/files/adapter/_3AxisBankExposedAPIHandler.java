package _12_design_patterns.files.adapter;

import _12_design_patterns.files.adapter.iface.ExternalBankExposedAPIHandler;

class AxisBankExposedAPIHandler implements ExternalBankExposedAPIHandler{

    private final AxisBankExposedAPI axisBankExposedAPI;
    
    AxisBankExposedAPIHandler(AxisBankExposedAPI axisBankExposedAPI){
        this.axisBankExposedAPI=axisBankExposedAPI;
    }

    @Override
    public boolean pay(int amount) {
        try {
            return axisBankExposedAPI.payMoney(amount);
        } catch(IllegalArgumentException e) {
            System.out.println("Payment failed");
            return false;
        }
    }

    @Override
    public int checkBalance() {
        return axisBankExposedAPI.seeBalance();
    }
    
}

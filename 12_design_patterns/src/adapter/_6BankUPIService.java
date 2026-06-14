package adapter;

import adapter.iface.ExternalBankExposedAPIHandler;

class BankUPIService {
    
    // not using concrete class, but using interface instead
    private final ExternalBankExposedAPIHandler handler;
    
    // Constructor dependency injection
    // @Autowired -> Spring boot 
    public BankUPIService(ExternalBankExposedAPIHandler handler){
        this.handler=handler;
    }

    public boolean makePayment(int amount){
        return handler.pay(amount);
    }

    public int checkBalance(){
        return handler.checkBalance();
    }
    
}

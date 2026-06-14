package adapter;

import adapter.iface.ExternalBankExposedAPIHandler;

public class _1AdapterPatternDemo {
    public static void main(String[] args) {
        // Dependency inversion
        // Client is injecting the dependency
        // TODO: int initialBalance = 1000;
        // TODO: AxisBankExposedAPI axisBankExposedAPI = new AxisBankExposedAPI(initialBalance); // can be replaced with YesBank
        // TODO: ExternalBankExposedAPIHandler externalExposedAPIHandler = new AxisBankExposedAPIHandler(axisBankExposedAPI); // right side can be changed to YesBank
        // TODO: BankUPIService bankUPIService = new BankUPIService(externalExposedAPIHandler);
        // TODO: bankUPIService.makePayment(10);
        // TODO: System.out.println(bankUPIService.checkBalance());

    }
}

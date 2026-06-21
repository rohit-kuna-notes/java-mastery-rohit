package _12_design_patterns.files.adapter.iface;

// Acts as the common interface between respective external bank exposed api and internal UPI service
public interface ExternalBankExposedAPIHandler {
    abstract boolean pay(int amount);
    abstract int checkBalance();
}

public class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {

        _customer  = customer;
        _creditManager = creditManager;
    }

    public void save(){
        System.out.println("Müşteri Kaydedildi : " );
    }

    public void delete(){
        System.out.println("Müşteri Silindi : ");
    }

    public void GiveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi Verildi");
    }
}

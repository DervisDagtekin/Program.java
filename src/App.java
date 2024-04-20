public class App {
    // public static void main(String[] args) {

    //     CreditManager creditManager = new CreditManager();
    //     creditManager.Calculate();
    //     creditManager.Save();

    //     Customer customer = new Customer();// örneğini oluşturma, instance oluşturmak, instane creation 
    //     customer.Id=1;
    //     customer.City= "İstanbul";

    //     CustomerManager customerManager = new CustomerManager(customer);
    //     customerManager.Save();
    //     customerManager.Delete();

    //     Company company = new Company();
    //     company.TaxNumber = "1442102";
    //     company.CompanyName = "Lg";
    //     company.Id = 100;

    //     CustomerManager customerManager2 = new CustomerManager(new Company());

    //     Person person = new Person();
    //     person.NationalIdentity= " ";

    //     Customer c1 = new Customer();
    //     Customer c2 = new Person();
    //     Customer c3 = new Company();

    // }

    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();
    }

}

public class Customer {

    public Customer() {
        System.out.println("Müşteri Nesnesi Başlatıldı");
    }

    private int Id;
    private String City;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }

}

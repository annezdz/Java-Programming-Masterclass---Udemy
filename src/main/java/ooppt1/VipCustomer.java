package ooppt1;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Default Name",900.00, "default@email.com");
    }

    public VipCustomer(String name, String email) {
        this.email = email;
        this.name = name;
        this.limit = 1000;
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}

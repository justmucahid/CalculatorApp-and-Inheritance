package polymorphism;

public class IndividualCustomer extends CustomerInheritance {
    private String _firstName;
    private String _lastName;

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

}

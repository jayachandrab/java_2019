package moduler4.assignment1;

public class Contact {
    String name;

    @Override
    public String toString() {
        return "{" +
                " Name = " + name  +
                ", Email = " + email  +
                ", Phone Number = "+phoneNumber+" }";
    }

    String email;
    String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public Contact(String name,String email,String phoneNumber) {
        this.name=name;
        this.email = email;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


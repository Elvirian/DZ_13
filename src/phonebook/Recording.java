package phonebook;

import java.util.List;

public class Recording {
    private String name;
    private List<Integer> phoneNumber;


    public Recording() {
    }

    public Recording(String name, List<Integer> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Recording{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
package bank.assessment;

public class Person {

    private String forename, surname, emailAddress, dateOfBirth;
    private BankAccount bankAccount;

    public Person() { }

    public Person(String forename, String surname, String emailAddress, String dateOfBirth) {
        this.forename = forename;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }
}

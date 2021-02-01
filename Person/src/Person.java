public class Person {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        System.out.println("firstName = " + person.getFirstName());
        person.setLastName("Yeet");
        System.out.println("lastName = " + person.getLastName());
        person.setAge(12);
        System.out.println("age = " + person.getAge());
        System.out.println("teen = " + person.isTeen());
        System.out.println("fullName = " + person.getFullName());
    }

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        }

        return firstName + " " + lastName;
    }
}

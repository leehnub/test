/**
 * Created by dpli on 3/1/2016.
 */
public class Person {

    private String name;
    private String address;
    private int age;
    private String phone;

    public Person ()
    {
        name = "";
        address = "";
        age = 0;
        phone = "";
    }
    public Person (String myName, String myAddress, int myAge, String myPhone)
    {
        name = myName;
        address = myAddress;
        age = myAge;
        phone = myPhone;
    }

    public void setName(String myName)
    {
       name = myName;
    }

    public void setAddress(String myAddress)
    {
        address = myAddress;
    }

    public void setAge(int myAge)
    {
        age = myAge;
    }

    public void setPhone(String myPhone)
    {
        phone = myPhone;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhone()
    {
        return phone;
    }

}

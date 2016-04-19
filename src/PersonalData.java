/**
 * Created by dpli on 2/25/2016.
 */
public class PersonalData {
    public static void main(String[] args)
    {

     Person me = new Person();
     Person myFriend1 = new Person();
     Person myFriend2 = new Person();

     me.setName("Hnub Lee");
     me.setAddress("4265 East. Brooklyn Avenue");
     me.setAge(15);
     me.setPhone("(559)-4235-000");

     myFriend1.setName("Maryln Rose");
     myFriend1.setAddress("6123 North. Thomason Avenue");
     myFriend1.setAge(18);
     myFriend1.setPhone("(661)-246-6184");

     myFriend2.setName("Barry MacCan");
     myFriend2.setAddress("918 South. Everest Avenue");
     myFriend2.setAge(16);
     myFriend2.setPhone("(559)-709-1118");

     System.out.println("My information:");
     System.out.println("Name:" + me.getName());
     System.out.println("Address:" + me.getAddress());
     System.out.println("Age:" + me.getAge());
     System.out.println("Phone:" + me.getPhone());

     System.out.println("\nFriend #1's information:");
     System.out.println("Name: " + myFriend1.getName());
     System.out.println("Address: " + myFriend1.getAddress());
     System.out.println("Age: " + myFriend1.getAge());
     System.out.println("Phone: " + myFriend1.getPhone());

     System.out.println("\nFriend #2's information: ");
     System.out.println("Name: " + myFriend2.getName());
     System.out.println("Address: " + myFriend2.getAddress());
     System.out.println("Age: " + myFriend2.getAge());
     System.out.println("Phone: " + myFriend2.getPhone());

    }
}

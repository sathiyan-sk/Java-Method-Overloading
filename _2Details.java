class Person {
     private String name;
     private int age;
     private String address;
 
     public Person(String name) {
         this.name = name;
     }
 
     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     public Person(String name, int age, String address) {
         this.name = name;
         this.age = age;
         this.address = address;
     }
 
     public void display() {
         System.out.println("Name: " + name);
         if (age != 0) {
             System.out.println("Age: " + age);
         }
         if (address != null) {
             System.out.println("Address: " + address);
         }
         System.out.println();
     }
 }
 
 public class _2Details {
     public static void main(String[] args) { // Create obj use different constructors
         
         Person person1 = new Person("Mike");
         Person person2 = new Person("Elon Musk", 55);
         Person person3 = new Person("Charlie", 30, "123 Street, City");

         person1.display();
         person2.display();
         person3.display();
     }
 }
 
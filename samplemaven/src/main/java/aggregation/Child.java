package aggregation;

public class Child {
    String City;
    String State;
    Parent ref;

    public Child(String City, String State, Parent ref) {
        this.City = City;
        this.State = State;
        this.ref = ref;
    }

    public void display() {
        System.out.println(City + " " + State);
        System.out.println(ref.name + " " + ref.rollno + " " + ref.address);
    }

    public static void main(String[] args) {
        Parent obj1 = new Parent("Rudra", 31, "abcd");
        Child obj = new Child("TVPM", "Kerala", obj1);
        obj.display();
    }
}

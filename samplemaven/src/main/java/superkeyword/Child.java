package superkeyword;

public class Child extends Parent {
    int num = 100;

   public void show() {
        super.display();  // Call parent method
        System.out.println("Child num: " + num);
        System.out.println("Parent num using super: " + super.num);  // Access parent variable
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }

	}



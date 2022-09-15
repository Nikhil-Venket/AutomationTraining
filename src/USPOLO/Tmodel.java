package USPOLO;

public class Tmodel extends Tshirt {
    int Count;
    String Colour;
    char Size;

    static {
        System.out.println("USpolo-Tshirt");
    }

    Tmodel(int Count, String Colour, char Size) {
        this.Count = Count;
        this.Colour = Colour;
        this.Size = Size;
        System.out.println("USPOLO T-shirt");
        System.out.println("T shirt count="+Count);
        System.out.println("T shirt color="+Colour);
        System.out.println("T shirt size="+Size);
    }
    public void User1(){
        System.out.println("Customer 1");
        scanner();
    }
    public void User2(){
        System.out.println("Customer 2");
        scanner();
    }
    public void User3(){
        System.out.println("Customer 3");
        scanner();
    }

    public static void main(String[] args) {
        Tmodel mod=new Tmodel(1000,"White", 'L');
        mod.User1();
        mod.User2();
        mod.User3();

    }


}


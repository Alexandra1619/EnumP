package EnumPackage;

public class EnCl {
    public static void main(String[] args) {

        System.out.println("The price of meat: "+Producti.meat.getPrice()+" Rub");
        System.out.println("Price for everything: ");
        for (Producti pr:Producti.values())
        {
            System.out.println(pr+" "+pr.getPrice()+" Rub");
        }
    }
}

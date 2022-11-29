import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pen myPen = new Pen("Gel", "Red", 15);
        Headphone myHeadphone = new Headphone("Alienware", "RKTC-784xc");
        Headphone newHeadphone = new Headphone(null, null);
        Scanner scanner = new Scanner(System.in);

        System.out.println(String.format("You have a %s %s pen with a pen-point of %d.", myPen.color, myPen.type, myPen.point));

        System.out.println(myHeadphone.getInformation());
        System.out.println(String.format( "It is %b that your headphones are muted.", myHeadphone.isMuted()));

        System.out.println("Do you want to add a new Headset?");
        System.out.println("\"yes\" or \"no\"");
        String option = scanner.nextLine();
        String newBrand;
        String newModel;

        if( option.equalsIgnoreCase("yes")) {
            System.out.println("What brand are the new headphones?\n");
            newBrand = scanner.nextLine();

            System.out.println("What model are the new headphones?\n");
            newModel = scanner.nextLine();

            newHeadphone = new Headphone(newBrand, newModel);
        }

        System.out.println(newHeadphone.getInformation());
        System.out.println(String.format( "It is %b that your headphones are muted.", newHeadphone.isMuted()));        

        

        System.out.println("Hello, World!");
        scanner.close();
    }
}

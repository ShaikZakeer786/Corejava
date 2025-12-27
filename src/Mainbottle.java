
import java.util.ArrayList;
import java.util.List;

public class Mainbottle {
    public static void main(String[] args) {

        Bottle b1 = new Bottle();
        b1.setBottlename("kinley");
        b1.setColour("Blue");
        b1.setCapacity(5.0);

        Bottle b2 = new Bottle();
        b2.setBottlename("bislery");
        b2.setColour("skyblue");
        b2.setCapacity(10.0);

        Bottle b3 = new Bottle();
        b3.setBottlename("milton");
        b3.setColour("grey");
        b3.setCapacity(2.0);

        List<Bottle> bottleList = new ArrayList<>();
        bottleList.add(b1);
        bottleList.add(b2);
        bottleList.add(b3);

        System.out.println("List of Bottles:\n");

        for (Bottle bottle : bottleList) {
            System.out.println("Bottle Name : " + bottle.getBottlename());
            System.out.println("Colour      : " + bottle.getColour());
            System.out.println("Capacity(L) : " + bottle.getCapacity());
           
        }
    }
}


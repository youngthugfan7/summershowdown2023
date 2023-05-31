import java.util.Scanner;

public class Event{
    public static int cuttoff = 50;
    public static double ppg = 35;

    private String event;
    private int guests;
    private double price;

    public void setEventNumber(String e){
        this.event = e;
    }

    public void setGuests(int g){
        this.guests = g;
        this.price = g * ppg;
    }
    Event(String en,int g){
        this.setEventNumber(en); 
        this.setGuests(g);
    }

    public String toString(){
        return("The # of guests at " + event + " is " + guests + ". It will cost " + price + "dollars");
    }
}

class test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guests;
        String eventNum;
        System.out.print("Type guests: ");
        guests = input.nextInt();
        System.out.println();
        input.nextLine();
        System.out.print("Type event name: ");
        eventNum = input.nextLine();
        Event obj1 = new Event(eventNum, guests);
        System.out.print(obj1);
    }
}
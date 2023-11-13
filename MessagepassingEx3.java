import java.util.ArrayList;
//import java.util.EventListener;

class Event{
    private String eventName;
    public Event(String eventName){
        this.eventName=eventName;
    }
    public String getEvent(){
        return eventName;
    }
}

 class Eventnotifier{
    private ArrayList<EventListen> listeners=new ArrayList<>();

    public void addEventtListener(EventListen listener){
        listeners.add(listener);
    }
    public void removeEventListener(EventListen listener){
        listeners.remove(listener);
    }
    public void notifyevent(Event event){
        for(EventListen listener:listeners){
            listener.handle(event);
        }
    }

 }
interface EventListen{
    void handle(Event event);
}

class EventReceiever implements EventListen{
    private String receieverName;
    public EventReceiever(String receieverName){
        this.receieverName=receieverName;
    }
    public void handle(Event event){
        System.out.println(receieverName + " receieved " + event.getEvent());

    }
}
public class MessagepassingEx3 {
    public static void main(String args[]){
        Eventnotifier eventnotifier=new Eventnotifier();
        EventListen e1=new EventReceiever("Coke studio");
        EventListen e2=new EventReceiever("Zee studio");
        EventListen e3=new EventReceiever("T Series");

        eventnotifier.addEventtListener(e1);
        eventnotifier.addEventtListener(e2);
        eventnotifier.addEventtListener(e3);
        Event av=new Event("Event 1");
        eventnotifier.notifyevent(av);

        eventnotifier.removeEventListener(e3);
        Event ak=new Event("Event 2");
        eventnotifier.notifyevent(ak);
        }

}

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String AirFrom;
    private String to;
    private int travelTime;

    public Ticket(int id, int price, String AirFrom, String to, int travelTime) {
        this.id = id;
        this.price = price;
        this.AirFrom = AirFrom;
        this.to = to;
        this.travelTime = travelTime;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public String getFrom() {

        return AirFrom;
    }

    public void setFrom(String from) {

        this.AirFrom = from;
    }

    public String getTo() {

        return to;
    }

    public void setTo(String to) {

        this.to = to;
    }

    public int getTravelTime() {

        return travelTime;
    }

    public void setTravelTime(int travelTime) {

        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        } else {
            if (price > o.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

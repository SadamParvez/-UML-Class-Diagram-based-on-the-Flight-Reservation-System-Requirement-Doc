public class TouristTicket {
    private  String hotelAddress;
    private String[] selectedTouristLocation;

    public String[] getSelectedTouristLocation(){
        return this.selectedTouristLocation;
    }

    public void removeTouristLocations(String[] location){
        this.selectedTouristLocation=location;
        location=null;
    }

    public void addTouristLocations(String[] location){
        this.selectedTouristLocation=location;
    }

}

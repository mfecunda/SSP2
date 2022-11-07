public class Door {
    private  String doorName;
    private String state ;


    public Door (){
        this.doorName ="";
        this.state= "" ;
    }
    public Door (String name ,String state){
         this.doorName =name;
         this.state =state;
    }


    public void close(){
        this.state = "Closed";
    }

    public void open(){
        this.state = "Open";
    }

    public String getName() {
        return doorName;
    }

    public String getState() {
        return state;
    }

    public void setName(String newName) {
        this.doorName = newName;
    }

    public void setState(String newState) {
        this.state =  newState;
    }
}

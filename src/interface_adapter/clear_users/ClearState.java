package interface_adapter.clear_users;


public class ClearState {
    private String message;
    public ClearState(ClearState copy){
        this.message = copy.message;
    }
    public ClearState(){
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "ClearState{" +
                "message='" + message + '\'' +
                '}';
    }
}

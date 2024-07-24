import java.util.HashMap;


public class State {

    public String name;
    public boolean isFinal;
    public HashMap<String, State> transitions;

    public State(String name, boolean isFinal) {
        this.name = name;
        this.isFinal = isFinal;
        this.transitions = new HashMap<>();
    }
    
    public void addTransition(String symbol, State state){
        this.transitions.put(symbol, state);
    }
    
    public State getNextState(String symbol){
        return this.transitions.get(symbol);
    }
    
    public String toString(){
        String s = "name: " + this.name + " isFinal: " + this.isFinal;
        return s;
    }
}

public class Automaton {

    public State S;

    public Automaton(State S) {
        this.S = S;
    }
    
    public boolean isValid(String word){
        
        if(word == null || word.equals("")){
            if(S.isFinal){
                return true;
            }
            else{
                return false;
            }
        }
        
        boolean valid = false;
        
        State currentState = S;
        
        for(int i =0; i<word.length(); i++){
            String symbol = word.substring(i, i+1);
            
            currentState = currentState.getNextState(symbol);
            
            if(currentState == null) return false;
            
            if(currentState.isFinal){
                valid = true;
            }
            else{
                valid = false;
            }
            
            
        }
        
        return valid;
    }
    
}

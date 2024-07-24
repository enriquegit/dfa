public class Main {

    public static void main(String[] args) {
        
        State S = new State("S", false);
        State b = new State("b", false);
        State bb = new State("bb", true);
        
        S.addTransition("a", S);
        S.addTransition("b", b);
        b.addTransition("a", S);
        b.addTransition("b", bb);
        bb.addTransition("a", bb);
        bb.addTransition("b", bb);
        
        Automaton automaton = new Automaton(S);
        
        String input = "aabbaab";
        
        System.out.println(automaton.isValid(input));
    }
}

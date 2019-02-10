public class SignalDisplayer {

    static String display(int signal){

        if(signal==0)  return "No signal !";
        String displaySignal = "|";
        for(int i=0;i<signal;i++){
            displaySignal+="*";
        }
        for (int j=signal;j<10;j++){
            displaySignal+=".";
        }
        displaySignal+="|";
        return displaySignal;
    }

}

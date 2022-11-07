public class VendingMachine {
    private int cans;
    private int tokens;

    public VendingMachine(){
        this.cans = 0;
        this.tokens = 0;
    }



    public void fillUp(int cans ){
            this.cans += cans;
    }

    public int getCanCount() {
        return cans;
    }

    public int getTokenCount() {
        return tokens;
    }
    public void insertToken(){
        if(cans <= 0 ){
            System.out.println("Sorry machine out of cans , please fill up");
        }
        else {
            tokens++;
            cans--;
        }

    }



}

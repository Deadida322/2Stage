public class TwoVars {
    private int firstVar;
    private int secondVar;

    public void setFirstVar(int firstVar) {
        this.firstVar = firstVar;
    }
    public void setSecondVar(int secondVar) {
        this.secondVar = secondVar;
    }

    public void printFirstVar(){
        System.out.println(this.firstVar);
    }

    public void printSecondVar(){
        System.out.println(this.secondVar);
    }

    public int getSum(){
        return firstVar + secondVar;
    }

    public int getMax(){
        return Math.max(firstVar, secondVar);
    }
}

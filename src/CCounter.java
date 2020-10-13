public class CCounter {

    private int value;
    private int bornInf;
    int pas;
    int bornSup;


    CCounter()
    {

        this.bornInf = 0;
        this.value = this.bornInf;
        this.bornSup = Integer.MAX_VALUE;
        this.pas = 1;
    }
    CCounter(int _pas, int _binf, int _bsup)
    {
        this.bornInf = _binf;
        this.value = this.bornInf;
        this.bornSup = _bsup;
        this.pas = _pas;
    }

    public void incrementCounter()
    {
        this.value += this.pas;
    }

    public void ResetToZero()
    {
        this.value = this.bornInf;
    }

    public int getValue(){
        return this.value;
    }
    public int getBornInf(){
        return this.bornInf;
    }
    public int getBornSup(){
        return this.bornSup;
    }
}

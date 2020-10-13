//relation par heritage
public class CWatch extends CCounterChain
{
    CWatch()
    {
        super();
    }

    CWatch(int _nbCounter, int _pas[], int _binf[], int _bsup[]) {
        super(_nbCounter, _pas, _binf, _bsup);
        }

    public void Increment()
    {
        this.incrementCounter();
    }
    public void ResetWatchToZero()
    {
        this.ResetAllToZero();
    }

    public void TimerRoll()
    {
        //on boucle sur 100 secondes
        for(int i =0; i<100000;i++)
        {
            this.Display();
            try {
                Thread.sleep(1000);
                this.Increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

//Relation par composition
/*
public class CWatch {

    int nbCounter;
    CCounterChain counterChain;
    int pas[];
    int binf[];
    int bsup[];

    CWatch(){
        nbCounter = 0;
        counterChain = null;
    }

    CWatch(int _nbCounter, int _pas[], int _binf[], int _bsup[])
    {
        this.nbCounter = _nbCounter;
        this.pas = _pas;
        this.binf = _binf;
        this.bsup = _bsup;
        this.counterChain = new CCounterChain(this.nbCounter, this.pas, this.binf, this.bsup);
    }

    public void Increment()
    {
        this.counterChain.incrementCounter();
    }

    public void ResetWatchToZero()
    {
        this.counterChain.ResetAllToZero();
    }

    public void TimerRoll()
    {
        //on boucle sur 100 secondes
        for(int i =0; i<10000;i++)
        {
            try {
                Thread.sleep(1000);
                this.Increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.counterChain.Display();
        }
    }
}
*/
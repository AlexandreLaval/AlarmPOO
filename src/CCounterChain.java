public class CCounterChain
{
    CCounter CounterArray[];
    int nbCounter;

    CCounterChain()
    {
        this.nbCounter = 0;
        this.CounterArray = new CCounter[this.nbCounter];
    }

    CCounterChain(int _nbCounter, int _pas[], int _binf[], int _bsup[])
    {
        this.nbCounter = _nbCounter;
        this.CounterArray = new CCounter[this.nbCounter];
        for(int i = 0; i<this.nbCounter;i++)
        {
            this.CounterArray[i] = new CCounter(_pas[i],_binf[i],_bsup[i]);
        }
    }

    public boolean CheckCounterValue(int _ind)
    {
        if(this.CounterArray[_ind].getValue() +1 >= this.CounterArray[_ind].getBornSup())
        {
            return true;
        }
        return false;
    }
    public void ResetAllToZero()
    {
        for (int i = 0; i < this.nbCounter; i++)
        {
            this.CounterArray[i].ResetToZero();
        }
    }
    public void ResetCounterToZero()
    {
        for(int i=0;i<this.nbCounter;i++)
        {
            this.CounterArray[i].ResetToZero();
        }
    }
    public void ResetCounterToZero(int _ind)
    {
        this.CounterArray[_ind].ResetToZero();
    }

    public void incrementCounter()
    {
        int CounterToInc = 0;
        for(int i =0;i< this.nbCounter; i++)
        {
            if(CheckCounterValue(CounterToInc))
            {
                this.CounterArray[CounterToInc].ResetToZero();
                CounterToInc++;
            }
        }
        this.CounterArray[CounterToInc].incrementCounter();
    }

    public void Display()
    {
        String str = "";
        for(int i = this.nbCounter-1; i >= 0; i--)
        {
            str += CounterArray[i].getValue() + " : ";
        }
        System.out.println(str);
    }



}

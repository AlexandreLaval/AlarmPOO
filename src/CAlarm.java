public  class CAlarm extends CWatch
{

    private int hour,min,sec;

    CAlarm(){}

    CAlarm(int _nbCounter, int _pas[], int _binf[], int _bsup[])
    {
        super(_nbCounter, _pas, _binf, _bsup);

    }

    public void SetAlarm(int _hour, int _min, int _sec)
    {
        this.hour = _hour;
        this.min = _min;
        this.sec = _sec;
    }

    public void activeAlarm()
    {
    }

    @Override
    public void TimerRoll() {
        super.TimerRoll();
    }

    @Override
    public void Increment()
    {
        if (this.CounterArray[0].getValue() == this.sec && this.CounterArray[1].getValue() == this.min && this.CounterArray[2].getValue() == this.hour)
            activeAlarm();
        super.Increment();
    }

}

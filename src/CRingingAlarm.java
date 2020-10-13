public class CRingingAlarm extends CAlarm implements ITrigger<CRingingAlarm>
{


    CRingingAlarm(int _nbCounter, int _pas[], int _binf[], int _bsup[])
    {
        super(_nbCounter, _pas, _binf, _bsup);
    }

    public CRingingAlarm trigger()
    {
        System.out.println("Dring dring");
        return this;
    }

    public void activeAlarm()
    {
        this.trigger();
    }

}

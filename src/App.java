public class App {
    public static void main(String[] args)
    {
       System.out.println("Creation Montre");

      // CWatch cWatch = new CWatch(3,new int[] {1,1,1},new int[] {0,0,0}, new int[] {60,60,24});

        CRingingAlarm cRingingAlarm = new CRingingAlarm(3,new int[] {1,1,1},new int[] {0,0,0}, new int[] {60,60,24});
        cRingingAlarm.SetAlarm(0,0, 5);
        cRingingAlarm.TimerRoll();
    }
}


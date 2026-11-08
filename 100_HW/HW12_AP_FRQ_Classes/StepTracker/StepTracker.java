class Steptracker{
    private int days;
    private int activeDays;
    private int steps;
    public static void StepTracker(int a){
        days=1;
        steps=a;
        if(steps>=a){
            activeDays++;
        }
    }
    public static int activeDays(){
        return activeDays;
    }
    public static double averageSteps(){
        if(steps>0){
            return steps/days;
        }
    }
    public static double addDailySteps(int a){
        steps+=a;
        days++;
        if(a>10000){
        ActiveDays++;
        }
    }


}
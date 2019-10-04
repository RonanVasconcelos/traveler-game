public class Timer {
    double time;
    double limit;
    Action action;
    boolean repete;
    boolean fim;

    public Timer(double limit, boolean repete, Action action) {
        this.limit = limit;
        this.action = action;
        this.repete = repete;
    }

    public void tique(double dt) {
        if(fim) return;
        time += dt;
        if(time > limit) {
            action.executa();
            if(repete) {
                time -= limit;
            } else {
                fim = true;
            }
        }
    }
}
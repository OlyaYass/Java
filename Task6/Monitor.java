public class Monitor {
    public double diagonal;

    public Monitor(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "диагональ экрана: "+diagonal;
    }
}

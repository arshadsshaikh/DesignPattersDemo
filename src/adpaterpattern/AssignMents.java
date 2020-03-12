package adpaterpattern;

public class AssignMents {

    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public  void write(String str){

        p.writeAssignment(str);
    }
}

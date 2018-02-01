package gnu.mapping;

public class Setter0 extends Setter {
    public Setter0(Procedure getter) {
        super(getter);
    }

    public int numArgs() {
        return 4097;
    }

    public Object apply1(Object result) throws Throwable {
        this.getter.set0(result);
        return Values.empty;
    }

    public Object applyN(Object[] args) throws Throwable {
        int nargs = args.length;
        if (nargs != 1) {
            throw new WrongArguments(this, nargs);
        }
        this.getter.set0(args[0]);
        return Values.empty;
    }
}

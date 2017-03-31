package hello;

public class WorkSpace {


    public static void main(String... args) {
        WorkSpace ws = new WorkSpace();
        ws.m(ws);

    }

    private void m(WorkSpace ws) {
        System.out.println(this.getClass());
        if (ws instanceof WorkSpace) {
            System.out.println(ws.toString());
        }
    }
}

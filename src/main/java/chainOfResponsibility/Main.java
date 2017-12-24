package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        String msg = "<fuck the world>";
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);
        String result = mp.process();
        System.out.println(result);
    }
}

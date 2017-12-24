package chainOfResponsibility;

public class MsgProcessor {

    private String msg;

    private Filter[] filterChain = {new HTMLFilter(), new CurseWordFilter()};

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        String result = msg;
        for (Filter f : filterChain) {
            result = f.doFilter(result);
        }

        return result;
    }
}

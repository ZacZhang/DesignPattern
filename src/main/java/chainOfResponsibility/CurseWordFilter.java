package chainOfResponsibility;

public class CurseWordFilter implements Filter{
    public String doFilter(String str) {
        // process the curse word
        String result = str.replaceAll("fuck", "love")
                .replaceAll("shit", "");
        return result;
    }
}

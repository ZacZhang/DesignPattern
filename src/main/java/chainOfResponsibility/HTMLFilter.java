package chainOfResponsibility;

public class HTMLFilter implements Filter{
    public String doFilter(String str) {
        // process the html tag <>
        String result = str.replaceAll("<", "[")
                .replaceAll(">", "]");
        return result;
    }
}

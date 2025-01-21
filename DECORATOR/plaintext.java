public class plaintext implements text{
    private String content;
    public plaintext(String content)
    {
        this.content=content;
    }
    public String style()
    {
        return content;
    }
}

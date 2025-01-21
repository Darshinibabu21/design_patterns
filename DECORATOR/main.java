public class main {
    public static void main(String[] args) {
        text p=new plaintext("hello world");
        text bold=new boldtext(p);
        text italic=new italictext(bold);
        text under=new underline(italic);

        System.out.println("plaintext:"+p.style());
        System.out.println("boldtext:"+bold.style());
        System.out.println("italictext:"+italic.style());
        System.out.println("underlined text:"+under.style());
    }
}

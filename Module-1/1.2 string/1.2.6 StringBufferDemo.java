package core.string;

public class StringBufferDemo {

    public static void main(String[] args) {
        String s1 = "Tops";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);

        sb.append("Technologies");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);
    }

}

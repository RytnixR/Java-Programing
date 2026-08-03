public class basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rytnix");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //set char at 0
        sb.setCharAt(0, 'T'); // only one character change at a time with ' '
        System.out.println(sb);

        //inserting in string
        sb.insert(0, "ig_ther"); // can add one or more with " "
        System.out.println(sb);

        // deleting
        sb.delete(7, 8); // 7 is starting and 8 is excluded so it goes to 8-1 = 7
        System.out.println(sb);

        // appending
        StringBuilder g = new StringBuilder("H");
        g.append("e"); // str = str + "e" ismai new string bnti or stringbuilder mai same string mai append hora hai
        g.append("l"); // str = str + "l"
        g.append("l"); // str = str + "l"
        g.append("o"); // str = str + "o"
        System.out.println(g);


    }
}
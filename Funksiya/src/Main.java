import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("metn daxil edin");
        String s = sc.nextLine();

        int a = s.length();
        System.out.println("uzunluq=" + a);
        char b = s.charAt(s.length() - 1);
        System.out.println("sonuncu simvol--" + b);
        boolean c = s.startsWith("salam");
        System.out.println("baslangic 'salam' duzdurdmu?-" + c);
        boolean d = s.endsWith("kisi");
        System.out.println("sonu 'kisi' sozuyle eynidirmi?--" + d);
        try {
            String e = s.substring(3, 8);
            System.out.println("verilims araliqdaki simvollar=" + e);
        } catch (Exception ex){
            System.out.println("verilmis aaraliqda melumat yoxdu");
            ex.getMessage();
        }

        boolean f = s.equals("salam ay kisi");
        System.out.println("verdiyim melumatla oturulen melumat eynidirmi?-" + f);
        // herifler boyuk kicikliyine baxmadan oxluyur
        boolean j = s.equalsIgnoreCase("salam AY kisi");
        System.out.println("verdiyim melumatla oturulen melumat eynidirmi?-" + j);
        boolean g = s.isEmpty();
        System.out.println("melumat bosdurmu?--" +g);
        String h = s.replace("a", "b");
        System.out.println(h);
        //left rigth bosluqlari silir
        String mm=s.trim();
        int x=mm.length();
        System.out.println("qiraq bosluqlari sildikden sonra uzunluq-"+x);
        //daxil edilen simvolun yerlesdiyo yeri gosderir
        int a2=mm.indexOf("s");
        System.out.println(a2);
        //butun herifler kicildir
        String l=mm.toLowerCase();
        System.out.println(l);
        //butun herifler boyudur
        String y=mm.toUpperCase();
        System.out.println(y);


    }
}
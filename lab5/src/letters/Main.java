package letters;

public class Main {
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        C cc = new C();
        D dd = new D();
        E ee = new E();
        F ff = new F();
        G gg = new G();
        H hh = new H();
        I ii = new I();
        J jj = new J();
        X xx = new X();

        System.out.println(aa.toString());
        System.out.println(bb.toString());
        System.out.println(cc.toString());
        System.out.println(dd.toString());
        System.out.println(ee.toString());
        System.out.println(ff.toString());
        System.out.println(gg.toString());
        System.out.println(hh.toString());
        System.out.println(ii.toString());
        System.out.println(jj.toString());

        A aaa = new A ("aaa",new X("xxx"));
        System.out.println(aaa.toString());

        aa.a = "22 in the bombed foyer,";
        bb.b = "For the times, can we stop this rage?";
        cc.c = "No money, no doctors for patients";
        dd.d = "And the bullets, they keep you in slavery";
        ee.e = "Father won't get to see her smile";
        ff.f = "You saw death, now it's in her eyes";
        gg.g = "What the hell are we doing to change things?";
        hh.h = "'Cause I can hear guns in the distance";
        ii.i = "When a mother cries for her children?";
        jj.j = "Gettin' rich, tell me who gets paid";

        aa.display();
        bb.display();
        cc.display();
        dd.display();
        ee.display();
        ff.display();
        gg.display();
        hh.display();
        ii.display();
        jj.display();
    }
}
package letters;

public class Main {
    public static void main(String[] args) {
        A aa = new A("aa",new X("xxx"));
        B bb = new B("ba","bb",new X("xxx"));
        C cc = new C("ca","cb","cc", new X("xxx"));
        D dd = new D("da","db","dc","dd", new X("xxx"));
        E ee = new E("ea","eb","ec","ed","ee", new X("xxx"));
        F ff = new F("fa","fb","fc","fd","fe","ff", new X("xxx"));
        G gg = new G("ga","gb","gc","gd","ge","gf","gg", new X("xxx"));
        H hh = new H("ha","hb","hc","hd","he","hf","hg","hh", new X("xxx"));
        I ii = new I("ia","ib","ic","id","ie","if","ig","ih","ii", new X("xxx"));
        J jj = new J("ja","jb","jc","jd","je","jf","jg","jh","ji","jj", new X("xxx"));

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

    }
}
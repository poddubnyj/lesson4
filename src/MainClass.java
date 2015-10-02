/**
 * Created by Source_it-2 on 02.10.2015.
 */
public class MainClass {
    void main () {
        Skyscraper sc = new Skyscraper ();
        sc.s=90;
        sc.h=3;
        sc.f=10;
        int vol = sc.V();
        System.out.print ("объем небоскреба =" +(vol*sc.f));
    }
}
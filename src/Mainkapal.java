public class Mainkapal {
    public static void main(String[] args) {
        Kapalpesiar kps = new Kapalpesiar();
        Kapalselam ksl = new Kapalselam();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Karakteristik Kapal");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Kapal Pesiar");
        kps.tampilkanmerk();
        kps.tampilkanwarna();
        kps.tampilkannama();
        kps.tampilkanjeniskelamin();
        System.out.println("");
        System.out.println("Kapal Selam");
        ksl.tampilkanmerk();
        ksl.tampilkanwarna();
        ksl.tampilkannama();
        ksl.tampilkanjeniskelamin();
}   

}
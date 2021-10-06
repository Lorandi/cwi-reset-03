public class Estoque {

    static int paes = 60;
    static int torta = 4;
    static int fatiasTorta = torta * 16;
    static int sanduiche = 20;
    static int leite = 20;
    static int cafe = 20;

    public static int getPaes() {
        return paes;
    }

    public static void setPaes(int paes) {
        Estoque.paes = paes;
    }

    public static int getTorta() {
        return torta;
    }

    public static void setTorta(int torta) {
        Estoque.torta = torta;
    }

    public static int getFatiasTorta() {
        return fatiasTorta;
    }

    public static void setFatiasTorta(int fatiasTorta) {
        Estoque.fatiasTorta = fatiasTorta;
    }

    public static int getSanduiche() {
        return sanduiche;
    }

    public static void setSanduiche(int sanduiche) {
        Estoque.sanduiche = sanduiche;
    }

    public static int getLeite() {
        return leite;
    }

    public static void setLeite(int leite) {
        Estoque.leite = leite;
    }

    public static int getCafe() {
        return cafe;
    }

    public static void setCafe(int cafe) {
        Estoque.cafe = cafe;
    }

    public static String showEstoque(){
        return "Estoque: " + "\n"
                + "Pães: " + getPaes()+ "\n"
                + "Fatias de torta: " + getFatiasTorta()+ "\n"
                + "Sanduiche:  " + getSanduiche()+ "\n"
                + "Leite: " + getLeite()+ "\n"
                + "Café: " + getCafe()+ "\n" ;
    }

}

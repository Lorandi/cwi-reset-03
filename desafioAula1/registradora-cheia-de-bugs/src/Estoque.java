public class Estoque {
     int paes = 3600;
     int torta = 4;
     int fatiasTorta = torta * 16;
     int sanduiche = 20;
     int leite = 20;
     int cafe = 20;

    public int getPaes() {
        return paes;
    }

    public void setPaes(int paes) {
        this.paes = paes;
    }

    public int getTorta() {
        return torta;
    }

    public void setTorta(int torta) {
        this.torta = torta;
    }

    public int getFatiasTorta() {
        return fatiasTorta;
    }

    public void setFatiasTorta(int fatiasTorta) {
        this.fatiasTorta = fatiasTorta;
    }

    public int getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(int sanduiche) {
        this.sanduiche = sanduiche;
    }

    public int getLeite() {
        return leite;
    }

    public void setLeite(int leite) {
        this.leite = leite;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "paes=" + paes +
                ", torta=" + torta +
                ", fatiasTorta=" + fatiasTorta +
                ", sanduiche=" + sanduiche +
                ", leite=" + leite +
                ", cafe=" + cafe +
                '}';
    }
}

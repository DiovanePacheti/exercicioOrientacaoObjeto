package exercicio;

public class Personagem {

    private String raca = " ";
    private String classe = " ";
    private String nickname = " ";
    private int stamina = 0;
    private String mana = " ";
    private int power_attack = 0;
    private int intelecto = 0;
    private int armor = 0;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Personagem(String raca,String classe,String nickname,int stamina, String mana, int power_attack, int intelecto, int armor){
        this.raca = raca;
        this.classe = classe;
        this.nickname = nickname;
        this.stamina = stamina;
        this.mana = mana;
        this.power_attack = power_attack;
        this.intelecto = intelecto;
        this.armor = armor;
    }

    //METODOS ACESSORES GET E SET
    public String getRaca(){ return this.raca;}
    public void setRaca(String raca) {this.raca = raca;}
    public String getClasse() { return this.classe;}
    public void setNome(String classe){this.classe = classe;}
    public String getNickname(){return this.nickname;}
    public void setPorte(String nickname) { this.nickname = nickname; }
    public int getStamina() { return this.stamina; }
    public void setStamina(int stamina){ this.stamina = stamina;}
    public String getMana() { return this.mana; }
    public void setMana(String mana) { this.mana = mana; }
    public int getPower_attack() { return this.power_attack; }
    public void setPower_attack(int power_attack) { this.power_attack = power_attack; }
    public int getIntelecto() { return intelecto; }
    public void setPedigree(String pedigree) { this.intelecto = intelecto; }

    @Override
    public String toString() {
        String s = " ";
        s += "----------------------------------------------\n";
        s += "- Raça : " + getRaca() + "\n";
        s += "- Nickname : " + getNickname() + "\n";
        s += "- Classe : " + getClasse() + "\n";
        s += "- Stamina : " + getStamina() + "\n";
        s += "- Mana : " + getMana() + "\n";
        s += "- Power Attack : " + getPower_attack() + "\n";
        s += "- Intelecto : " + getIntelecto() + "\n";
        s += "- --------------------------------------------------\n";
        return s;
    }
}//fim da class Cachorro

package Builder;
 // Não Altere nada
public class Personagem {
    private String nome;
    private String classe;
    private int vida;
    private int mana;
    private int forca;
    private int inteligencia;
    private int agilidade;

    public Personagem(String nome, String classe, int vida, int mana, int forca, int inteligencia, int agilidade) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s\nClasse: %s\nVida: %d\nMana: %d\nForça: %d\nInteligência: %d\nAgilidade: %d\n",
            nome, classe, vida, mana, forca, inteligencia, agilidade
        );
    }
}
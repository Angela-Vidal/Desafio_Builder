package Builder;

public class GuerreiroBuilder implements PersonagemBuilder {
    private String nome;
    private int vida = 120;
    private int mana = 30;
    private int forca = 100;
    private int inteligencia = 20;
    private int agilidade = 40;

    @Override
    public Personagem build() {
        return new Personagem(nome, "Guerreiro", vida, mana, forca, inteligencia, agilidade);
    }
}
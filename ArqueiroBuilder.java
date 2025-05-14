package Builder;

public class ArqueiroBuilder implements PersonagemBuilder {
    private String nome;
    private int vida = 80;
    private int mana = 60;
    private int forca = 50;
    private int inteligencia = 50;
    private int agilidade = 100;

    @Override
    public Personagem build() {
        return new Personagem(nome, "Arqueiro", vida, mana, forca, inteligencia, agilidade);
    }
}
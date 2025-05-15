package Builder;

public class GuerreiroBuilder implements PersonagemBuilder {
    private String nome;
    private int vida = 120;
    private int mana = 30;
    private int forca = 100;
    private int inteligencia = 20;
    private int agilidade = 40;

    @Override
    public PersonagemBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PersonagemBuilder comVida(int vida) {
        this.vida = vida;
        return this;
    }

    @Override
    public PersonagemBuilder comMana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public PersonagemBuilder comForca(int forca) {
        this.forca = forca;
        return this;
    }

    @Override
    public PersonagemBuilder comInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }

    @Override
    public PersonagemBuilder comAgilidade(int agilidade) {
        this.agilidade = agilidade;
        return this;
    }

    @Override
    public Personagem build() {
        return new Personagem(nome, "Guerreiro", vida, mana, forca, inteligencia, agilidade);
    }
}
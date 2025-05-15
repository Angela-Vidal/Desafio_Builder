package Builder;

public class ArqueiroBuilder implements PersonagemBuilder {
    private String nome;
    private int vida = 80;
    private int mana = 60;
    private int forca = 50;
    private int inteligencia = 50;
    private int agilidade = 100;

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
        return new Personagem(nome, "Arqueiro", vida, mana, forca, inteligencia, agilidade);
    }
}
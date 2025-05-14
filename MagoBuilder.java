package Builder;

public class MagoBuilder implements PersonagemBuilder {
    private String nome;
    private int vida = 60;
    private int mana = 120;
    private int forca = 20;
    private int inteligencia = 100;
    private int agilidade = 40;

    //Faca Restante Seguindo a mesma estrutura
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
    public Personagem build() {
        return new Personagem(nome, "Mago", vida, mana, forca, inteligencia, agilidade);
    }
}
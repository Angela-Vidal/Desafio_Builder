package Builder;

public interface PersonagemBuilder {

    //Faça o restante do builder

    PersonagemBuilder comNome(String nome);
    PersonagemBuilder comVida(int vida);
    PersonagemBuilder comMana(int mana);

    PersonagemBuilder comForca(int forca);

    PersonagemBuilder comInteligencia(int inteligencia);

    PersonagemBuilder comAgilidade(int agilidade);

    Personagem build();
}
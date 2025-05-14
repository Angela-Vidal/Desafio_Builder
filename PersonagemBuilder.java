package Builder;

public interface PersonagemBuilder {

    //Faça o restante do builder

    PersonagemBuilder comNome(String nome);
    PersonagemBuilder comVida(int vida);
    PersonagemBuilder comMana(int mana);

    Personagem build();
}
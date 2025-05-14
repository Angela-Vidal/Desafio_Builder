package Builder;

public class Builder_Main {
    public static void main(String[] args) {
        //Implemente a chamada do Builder

        Personagem guerreiro = new GuerreiroBuilder()
            .comNome("Thorfin")
            .build();

        Personagem mago = new MagoBuilder()
            .comNome("Merlin");


        Personagem arqueiro = new ArqueiroBuilder()
            .comNome("Ashe");

        System.out.println("=== GUERREIRO ===");
        System.out.println(guerreiro);

        System.out.println("=== MAGO ===");
        System.out.println(mago);

        System.out.println("=== ARQUEIRO ===");
        System.out.println(arqueiro);
    }
}
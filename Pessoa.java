public class Pessoa {
    private final String nome;
    private final int idade;
    private final String email;
    private final String telefone;
    private final Sexo sexo;

    public enum Sexo {
        MASCULINO, FEMININO, OUTRO
    }


    public Pessoa build() {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalStateException("Nome é obrigatório.");
        }
        if (idade < 0) {
            throw new IllegalStateException("Idade inválida.");
        }
        if (email != null && !isEmailValido(email)) {
            throw new IllegalStateException("Email inválido.");
        }
        if (telefone != null && !telefone.matches("\\d{10,}")) {
            throw new IllegalStateException("Telefone deve conter apenas números e ter ao menos 10 dígitos.");
        }
        return new Pessoa(this);
    }

    private boolean isEmailValido(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$", email);
    }
}

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)" +
            (sexo != null ? ", Sexo: " + sexo : "") +
            (email != null ? ", Email: " + email : "") +
            (telefone != null ? ", Telefone: " + telefone : "");
    }
}

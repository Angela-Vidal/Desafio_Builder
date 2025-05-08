# Desafio

Crie uma classe Pessoa com os seguintes campos:

nome (obrigatório)

idade (obrigatório)

email (opcional, mas se fornecido deve ser válido)

telefone (opcional, mas deve ter no mínimo 10 caracteres numéricos)

sexo (enum: MASCULINO, FEMININO, OUTRO)

Regras:
Valide a idade (deve ser >= 0).

Se email estiver presente, verifique se é válido usando regex.

Se telefone estiver presente, deve conter apenas números e ter tamanho adequado.

Crie um Builder com todas as validações no build().

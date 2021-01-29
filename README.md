# Escola-Alf-

Para utilizar a aplicação basta importar no eclipse ou a ide utilizada e rodar a classe "EscolaAlfApplication".
Os testes podem ser realizados tanto no postman quanto em qualquer outro aplicativo de teste de api.


Funcionalidades/endpoints da aplicação:
Método post: "/gabarito/cadastro"
Cadastrar o gabarito de cada prova;
exemplo de request:

{
    "questoes": [
            {
             "alternativa": "A",
             "peso": 3
            },
            {
             "alternativa": "B",
             "peso": 4
            },
            {
             "alternativa": "C",
             "peso": 5
            },
            {
             "alternativa": "D",
             "peso": 1
            },
            {
             "alternativa": "D",
             "peso": 2
            }
        ]
}

Response esperado: "Gabarito cadastrado com sucesso"

Método post: "/alunos/prova-aluno"
Cadastrar as respostas de cada aluno para cada prova;

[
        {
            "nome": "bruce",
            "provaDoAluno": [
                "A",
                "B",
                "C",
                "A",
                "D"
            ]
        },
        {
            "nome": "wayne",
            "provaDoAluno": [
                "B",
                "B",
                "B",
                "B",
                "B"
            ]
        },
        {
            "nome": "barry",
            "provaDoAluno": [
                "D",
                "D",
                "D",
                "D",
                "D"
            ]
        }
]


Response esperado: "Provas cadastrada com sucesso"

Método get: "/alunos/verificar-nota-alunos"
Verificar a nota final de cada aluno;

Response esperado: "[{"nome":"bruce","provaDoAluno":["A","B","C","A","D"],"nota":9},{"nome":"wayne","provaDoAluno":["B","B","B","B","B"],"nota":6},{"nome":"barry","provaDoAluno":["D","D","D","D","D"],"nota":4}]"

Método get: "/alunos/verificar-alunos-aprovados"
Listar os alunos aprovados.

Response esperado: "[
    [
        "bruce"
    ]
]"

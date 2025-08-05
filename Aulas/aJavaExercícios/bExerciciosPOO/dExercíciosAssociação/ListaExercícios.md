# Exercícios de Associação em Programação Orientada a Objetos

## 1. Sistema de Biblioteca

- Crie as classes:
    - **Livro**: título, gênero
    - **Autor**: nome, nacionalidade
    - **Editora**: nome, endereço
- Cada livro tem um autor e uma editora.
- Um autor pode ter vários livros.
- Uma editora pode publicar vários livros.


---

## 2. Cadastro de Cursos e Alunos

- Crie as classes:
    - **Curso**: nome, cargaHoraria
    - **Aluno**: nome, idade, matrícula
- Um aluno pode estar matriculado em vários cursos e um curso pode ter vários alunos.
- Implemente a associação muitos-para-muitos entre cursos e alunos.


---

## 3. Sistema de Reservas de Hotel

- Crie as classes:
    - **Hotel**: nome, cidade
    - **Quarto**: número, tipo (ex: simples, duplo, suíte)
    - **Reserva**: dataEntrada, dataSaida
    - **Hospede**: nome, telefone
- Um hotel possui vários quartos.
- Uma reserva está associada a um quarto e a um hóspede.


---

## 4. Agenda de Consultas Médicas

- Crie as classes:
    - **Paciente**: nome, dataNascimento
    - **Medico**: nome, especialidade
    - **Consulta**: data, horario, motivo
- Um paciente pode ter várias consultas.
- Um médico pode atender várias consultas.
- Cada consulta está associada a um paciente e a um médico.


---

## 5. Sistema de Eventos

- Crie as classes:
    - **Evento**: nome, data, descricao
    - **Participante**: nome, email
    - **Local**: endereco, capacidade
- Um evento possui vários participantes e acontece em um local.
- Um participante pode participar de vários eventos.


---

## 6. Escola de Música

- Crie as classes:
    - **Professor**: nome, instrumentoPrincipal
    - **Instrumento**: nome, tipo (ex: corda, sopro)
    - **Turma**: nome, horario
    - **Aluno**: nome, idade
- Um professor pode dar aula em várias turmas.
- Uma turma pode ter vários instrumentos e alunos.
- Os alunos podem participar de várias turmas.


---

## 7. Sistema de Pedidos de Restaurante

- Crie as classes:
    - **Pedido**: numero, data
    - **Cliente**: nome, telefone
    - **Prato**: nome, preco
    - **Restaurante**: nome, endereco
- Um cliente pode fazer vários pedidos.
- Um pedido pode ter vários pratos.
- Um restaurante possui vários pratos.


import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @org.junit.jupiter.api.Test
    void getNome() {
        Pessoa pessoa = new Pessoa("João", 30);
        assertEquals("João", pessoa.getNome());
    }

    @org.junit.jupiter.api.Test
    void setNome() {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.setNome("Maria");
    }

    @org.junit.jupiter.api.Test
    void getIdade() {
        Pessoa pessoa = new Pessoa("João", 30);
        assertEquals(30, pessoa.getIdade());
    }

    @org.junit.jupiter.api.Test
    void setIdade() {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.setIdade(31);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Pessoa pessoa = new Pessoa("João", 30);
        assertEquals("Pessoa{nome='João', idade=30}", pessoa.toString());
    }
}
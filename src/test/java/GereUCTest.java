import exercício_1.ContactManager;
import exercício_3.GereUC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GereUCTest {
    private GereUC gereUC;

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Contact Manager");
        gereUC = new GereUC();
    }

    @Test
    @DisplayName("Deve inserir uma nota")
    public void shouldCreateNota() {
        assertTrue(gereUC.insereNotaUc(46257,10));
        assertEquals(1, gereUC.getAllNotas());
    }


    @DisplayName("Deve retornar a nota de um dado aluno")
    @ParameterizedTest
    @ValueSource(ints = {46255, 41586, 44861})
    public void shouldReturnNota(int nota) {
        gereUC.insereNotaUc(46257,10);
        gereUC.insereNotaUc(41586,9);
        gereUC.insereNotaUc(44861,15);
        assertNotEquals(-1, gereUC.pesquisaAluno(nota));

    }

    @Test
    @DisplayName("Deve retornar a média")
    public void shouldReturnNota() {
        gereUC.insereNotaUc(46257,10);
        gereUC.insereNotaUc(41586,9);
        gereUC.insereNotaUc(44861,15);
        assertNotEquals(-1, gereUC.media());

    }



    @ParameterizedTest
    @DisplayName("Deve retornar se esta aprovado ou não")
    @ValueSource(ints = {5, 15, 6})
    public void shouldCheckGradde(int number) {
        assertTrue(gereUC.aprovado(number));

    }

}

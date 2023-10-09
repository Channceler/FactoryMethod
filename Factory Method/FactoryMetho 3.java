// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServicoRegistroTest {
   ServicoMatriculaTest() {
   }

   @Test
   void deveExecutarRegistro() {
      IServico servico = ServicoFactory.obterServico("Registro");
      Assertions.assertEquals("Registro\u00edcula efetivada", servico.executar());
   }

   @Test
   void deveCancelarRegistro() {
      IServico servico = ServicoFactory.obterServico("Registro");
      Assertions.assertEquals("Registro\u00edcula cancelada", servico.cancelar());
   }
}
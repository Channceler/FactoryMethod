public // Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServicoColacaoTest {
   ServicoColacaoTest() {
   }

   @Test
   void deveExecutarColacao() {
      IServico servico = ServicoFactory.obterServico("Colacao");
      Assertions.assertEquals("Colacao efetivada", servico.executar());
   }

   @Test
   void deveCancelarColacao() {
      IServico servico = ServicoFactory.obterServico("Colacao");
      Assertions.assertEquals("Colacao cancelada", servico.cancelar());
   }

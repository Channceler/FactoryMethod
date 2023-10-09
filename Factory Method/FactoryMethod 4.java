// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServicoCancelamentoTest {
   ServicoInterromperTest() {
   }

   @Test
   void deveExecutarInterromeper() {
      IServico servico = ServicoFactory.obterServico("Interromeper");
      Assertions.assertEquals("Interromeper efetivado", servico.executar());
   }

   @Test
   void deveCancelarInterromeper() {
      IServico servico = ServicoFactory.obterServico("Interromeper");
      Assertions.assertEquals("Interromeper cancelado", servico.cancelar());
   }
}
// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConteudoFactoryTest {
   ConteudoFactoryTest() {
   }

   @Test
   void deveRetornarExcecaoParaConteudoInexistente() {
      try {
         IConteudo conteudo = ConteudoFactory.obterConteudo("Evasao");
         Assertions.fail();
      } catch (IllegalArgumentException var2) {
         Assertions.assertEquals("Conteudo\u00e7o inexistente", var2.getMessage());
      }

   }

   @Test
   void deveRetornarExcecaoParaConteudoInvalido() {
      try {
         IConteudo conteudo = ConteudoFactory.obterConteudo("Jubilamento");
         Assertions.fail();
      } catch (IllegalArgumentException var2) {
         Assertions.assertEquals("Conteudo\u00e7o inv\u00e1lido", var2.getMessage());
      }

   }
}
# Method References

- Substituto do lambda expression em muitos casos para interfaces funcionais, que são as interfaces que implementam somente um método abastrato
 - referência a um método de instância de um objeto particular
 - referência a um método estático, método invocado a partir da classe
  - NomeDaClasse::nomeMetodo
 - referência a um método de instância de um objeto arbritário a partir de um tipo específico (uma classe específica), método invocado a partir do obj de instância da classe
  - NomeDaClasse::nomeMetodo
 - referência a um construtor
  - no lugar do nomeMetodo, usar o operador: new
   - NomeDaClasse::new
  
  
sintaxe: classe ou objeto :: métodoReferenciado

# Quando utilizar?
Se lambda implementar em uma classe anônima somente um único método, ela pode ser substituída por method references, obtendo assim, um código mais consiso
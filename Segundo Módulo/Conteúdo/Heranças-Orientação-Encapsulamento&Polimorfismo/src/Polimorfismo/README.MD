Diferentemente dos outros execicios aqui propostos, este é apenas uma abstração.

No Caso do Polimorfismo, 
A classe Empregado vai delegar para uma classe mais específica o trabalho
a ser feito. As classes específicas Engenheiro, Vendedor e Gerente recebem 
o que antes era feito num comando condicional. 
Todas as classes mais específicas sobrescrevem a superclasse TipoDeEmpregado.

A essência do polimorfismo é que, em vez de perguntar a um objeto qual é o 
seu tipo e então chamar algum comportamento baseado nessa resposta, 
você simplesmente chama o comportamento. O objeto, dependendo do seu tipo, 
faz a coisa certa.

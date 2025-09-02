package eJavaClassesUtilitárias.Aula29Locale;

public class PT03InternacionalizaçãoMoedas {
    /*
A internacionalização de moedas em Java é realizada principalmente através das classes Locale e NumberFormat.

Principais características:
- Locale permite definir o idioma e país, influenciando o formato da moeda, símbolos, separadores e casas decimais.
- NumberFormat, especialmente por meio do método getCurrencyInstance(Locale), retorna um formatador capaz de exibir valores numéricos como moeda no padrão do país/idioma especificado.

Exemplo do código:
- São criados quatro instâncias de NumberFormat, cada uma configurada para um Locale diferente: padrão do sistema, Japão, Brasil e Itália.
- O método format(valor) converte o número em String formatada conforme o padrão monetário do Locale.
  Exemplo:
    - Japão: ¥10,000
    - Brasil: R$ 10.000,21
    - Itália: € 10.000,21

- O método getMaximumFractionDigits() retorna o número máximo de casas decimais permitidas para a moeda do Locale.

Conversão de String para número:
- O método parse(String) permite converter uma String no formato monetário do Locale para um objeto Number, facilitando o processamento de entradas de usuário em aplicações internacionais.
  Exemplo: nfa[0].parse("R$ 1.000,00") retorna o valor 1000.0 como Number.

Observações importantes:
- Sempre utilize Locale apropriado ao criar o NumberFormat, pois diferentes países utilizam símbolos de moeda distintos e formatos de separadores de milhar e decimal.
- O uso correto dessas classes é fundamental para sistemas que lidam com valores monetários em múltiplos países, garantindo clareza e precisão na apresentação dos dados.

Resumo:
- Internacionalize valores monetários usando NumberFormat e Locale.
- Formate e parse valores conforme o padrão local do usuário, evitando erros e confusões.
- NumberFormat é thread-safe para leitura, mas não para escrita; evite compartilhamento em múltiplas threads se estiver modificando instâncias.
- Para novos projetos, considere também as classes do pacote java.time para data/hora internacionalizadas, e continue usando NumberFormat para moedas.
*/
}

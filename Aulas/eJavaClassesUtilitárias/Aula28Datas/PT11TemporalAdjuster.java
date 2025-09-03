package eJavaClassesUtilitárias.Aula28Datas;

public class PT11TemporalAdjuster {
    /*
A interface TemporalAdjuster faz parte do pacote java.time.temporal e permite criar regras personalizadas para ajustar datas e horários, além dos ajustes já disponíveis com TemporalAdjusters.

Principais características:
- Permite definir regras próprias para manipulação de datas e horários, encapsulando a lógica de ajuste em uma classe.
- É usada quando as regras de negócio para ajuste de datas vão além das opções "prontas" do TemporalAdjusters.

Como utilizar:
- Implemente a interface TemporalAdjuster, sobrescrevendo o método adjustInto(Temporal temporal).
- Dentro do método, defina a lógica para calcular o novo valor ajustado.
- Use com LocalDate, LocalDateTime, ou outros tipos temporais: objeto.with(new SeuTemporalAdjuster()).

Exemplo do código acima:
- A classe ObterProximoDiaUtil implementa TemporalAdjuster e retorna o próximo dia útil para uma data:
    - Se for quinta-feira, soma 4 dias (próxima segunda-feira).
    - Se for sexta, soma 3 dias (próxima segunda-feira).
    - Se for sábado, soma 2 dias (próxima segunda-feira).
    - Para qualquer outro dia (domingo a quarta), soma 1 dia.
- Permite calcular o próximo dia útil de forma flexível, podendo ser usada em qualquer LocalDate.

Resumo:
- Use TemporalAdjuster para criar ajustes personalizados de datas e horários conforme regras específicas do seu negócio.
- Encapsula a lógica de ajuste, tornando o código mais limpo e reutilizável.
- Ideal para cenários como cálculo de próximo dia útil, datas de vencimento, feriados, etc.
*/
}

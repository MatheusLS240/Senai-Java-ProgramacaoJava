/*
As bibliotecas abaixo são as necessárias para trabalhar com
data e hora extraidas do Sistema Operacional.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

    public class DataHoraPortugues {

        public static void main(String[] args) {
            // Obter a data e hora atuais
            LocalDateTime agora = LocalDateTime.now();

            // Criar um formatador para o português do Brasil
            // No Pattern -> E dia da semana abraviado EEEE-> Dia semana extenso
            // MM -> Numero do mês MMM-> Nome mes abreviado MMMM-> Mes por extenso
            // s -> Apresenta os segundos. ss -> segundos com duas casas
            // dd -> dia do mês
            // yy -> ano com duas casa, yyyy, ano com 4 casas
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("E - dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("pt-BR"));

            // Formatar a data e hora
            String dataHoraFormatada = agora.format(formatador);

            // Imprimir a data e hora formatada
            System.out.println("Data e hora em português do Brasil: " + dataHoraFormatada);
        }
    }

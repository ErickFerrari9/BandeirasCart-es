public class IdentificadorCartao {

    public static String identificarEmissor(String numeroCartao) {
        if (numeroCartao == null || numeroCartao.length() < 2) {
            return "Número inválido";
        }

        // Verificações por prefixo
        if (numeroCartao.startsWith("4")) {
            return "Visa";
        } else if (numeroCartao.startsWith("51") || numeroCartao.startsWith("52") ||
                numeroCartao.startsWith("53") || numeroCartao.startsWith("54") ||
                numeroCartao.startsWith("55")) {
            return "Mastercard";
        } else if (numeroCartao.startsWith("36") || numeroCartao.startsWith("38")) {
            return "Diners Club";
        } else if (numeroCartao.startsWith("6011") || numeroCartao.startsWith("65")) {
            return "Discover";
        } else if (numeroCartao.startsWith("35")) {
            return "JCB";
        } else if (numeroCartao.startsWith("34") || numeroCartao.startsWith("37")) {
            return "American Express";
        }

        return "Emissor desconhecido";
    }

    public static void main(String[] args) {
        // Exemplos de uso
        String[] cartoes = {
                "4111111111111111",
                "5212345678901234",
                "36123456789012",
                "6011123456789012",
                "3528123456789012",
                "371234567890123"
        };

        for (String cartao : cartoes) {
            System.out.println("Cartão: " + cartao + " | Emissor: " + identificarEmissor(cartao));
        }
    }
}

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MinhaJanela {

    public static void main(String[] args) {

        String mensangem = "Bem-vindo ao Supermercado Tabajara";

        // Instanciação(criação) de um objeto do tipo JFrame.
        // Por padrão ele é nasce invisível eo tamanho inicial é 0x0 pixel.
        // Chamando métodos do objeto criado podemos configurar isso
        JFrame janela = new JFrame();
        janela.setLayout(new java.awt.GridLayout(2, 1, 10, 20));

        // cria um label que para receber um texto
        // o objeto com texto já existe em memória, mas presicamos comandar o "janela"
        // para exibir ele nela
        JLabel titulo = new JLabel();
        titulo.setText(mensangem);
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JButton botao = new JButton("Iniciar Venda");
        botao.addActionListener(e -> {
            System.out.println("Venda iniciada com sucesso!!!");

            


            //destruir janela atual
            janela.dispose();

            //Cria uma nova janela (A tela de vendas)
            JFrame teleVendas = new JFrame("Caixa Livre - Nova Venda");
            teleVendas.setSize(1000, 1000);

            //Nova janela também precisa encerrar o programa quando clicado no "x"
            teleVendas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            teleVendas.setVisible(true);

        });

        botao.addMouseListener(new java.awt.event.MouseAdapter() {
            // Quando o mouse passa por cima do botão
            public void mouseEntered(java.awt.event.MouseEvent e) {
                botao.setBackground(java.awt.Color.CYAN); // Muda a cor para Ciano
            }

            // Quando o mouse sai de cima do botão
            public void mouseExited(java.awt.event.MouseEvent e) {
                botao.setBackground(null); // O "null" faz o botão voltar à cor padrão original
            }
        });

        // Métodos que definem o tamanho e visibilidade da janela
        janela.setSize(600, 400);

        // Adiciona "titulo" na "janela"
        janela.add(titulo);
        // Cria um painel transparente (ele usa FlowLayout por padrão)
        javax.swing.JPanel painelBotao = new javax.swing.JPanel();

        // Adiciona o botão dentro do painel
        painelBotao.add(botao);

        // Adiciona o painel na parte de baixo da janela
        janela.add(painelBotao);
        janela.setVisible(true);

        // Garante o encerramento do programa ao clicar no "x" da janela.
        // Sem isso, ao clicar no "x" da janela só fechamos a janela e não o programa.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

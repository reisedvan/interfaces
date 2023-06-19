package interfaces.view;

public class CadastroProdutoView extends javax.swing.JFrame {

  
    public CadastroProdutoView() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plano_de_fundo = new javax.swing.JPanel();
        titulo_cadastro_produtos = new javax.swing.JLabel();
        nome_produto_label = new javax.swing.JLabel();
        nomeProdutoCampoTexto = new javax.swing.JTextField();
        botaoSalvarCadastroProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        plano_de_fundo.setBackground(new java.awt.Color(255, 255, 255));

        titulo_cadastro_produtos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        titulo_cadastro_produtos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_cadastro_produtos.setText("Cadastro de Produtos");

        nome_produto_label.setText("Nome:");

        botaoSalvarCadastroProduto.setText("Salvar");

        javax.swing.GroupLayout plano_de_fundoLayout = new javax.swing.GroupLayout(plano_de_fundo);
        plano_de_fundo.setLayout(plano_de_fundoLayout);
        plano_de_fundoLayout.setHorizontalGroup(
            plano_de_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plano_de_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plano_de_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_cadastro_produtos, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plano_de_fundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSalvarCadastroProduto))
                    .addGroup(plano_de_fundoLayout.createSequentialGroup()
                        .addGroup(plano_de_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_produto_label)
                            .addComponent(nomeProdutoCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        plano_de_fundoLayout.setVerticalGroup(
            plano_de_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plano_de_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_cadastro_produtos)
                .addGap(31, 31, 31)
                .addComponent(nome_produto_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProdutoCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(botaoSalvarCadastroProduto)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plano_de_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plano_de_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvarCadastroProduto;
    private javax.swing.JTextField nomeProdutoCampoTexto;
    private javax.swing.JLabel nome_produto_label;
    private javax.swing.JPanel plano_de_fundo;
    private javax.swing.JLabel titulo_cadastro_produtos;
    // End of variables declaration//GEN-END:variables
}

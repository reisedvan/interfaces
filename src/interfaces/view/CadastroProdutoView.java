package interfaces.view;

import interfaces.Interfaces;
import interfaces.model.Produto;
import interfaces.service.ProdutoService;
import javax.swing.JLabel;

public class CadastroProdutoView extends javax.swing.JFrame {

    public CadastroProdutoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoDeFundo = new javax.swing.JPanel();
        tituloCadastroProdutos = new javax.swing.JLabel();
        nomeProdutoLabel = new javax.swing.JLabel();
        nomeProdutoCampoTexto = new javax.swing.JTextField();
        botaoSalvarCadastroProduto = new javax.swing.JButton();
        unidadeMedidaProdutoLabel = new javax.swing.JLabel();
        unidadeMedidaProdutoCampoTexto = new javax.swing.JTextField();
        descricaoProdutoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoAreaTexto = new javax.swing.JTextArea();
        estoqueProdutoCampoTexto = new javax.swing.JTextField();
        estoqueProdutoLabel = new javax.swing.JLabel();
        precoProdutoLabel = new javax.swing.JLabel();
        precoProdutoCampoTexto = new javax.swing.JTextField();
        erroLabel = new javax.swing.JLabel();
        navegarMenuBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXEMPLO");
        setBackground(new java.awt.Color(51, 255, 255));

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));

        tituloCadastroProdutos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        tituloCadastroProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCadastroProdutos.setText("Cadastro de Produtos");

        nomeProdutoLabel.setText("Nome:");

        botaoSalvarCadastroProduto.setText("Salvar");
        botaoSalvarCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarCadastroProdutoActionPerformed(evt);
            }
        });

        unidadeMedidaProdutoLabel.setText("UN:");

        descricaoProdutoLabel.setText("Descrição:");

        descricaoAreaTexto.setColumns(20);
        descricaoAreaTexto.setRows(5);
        jScrollPane1.setViewportView(descricaoAreaTexto);

        estoqueProdutoLabel.setText("Estoque:");

        precoProdutoLabel.setText("Preço:");

        erroLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        erroLabel.setForeground(new java.awt.Color(255, 51, 51));

        navegarMenuBotao.setText("Voltar");
        navegarMenuBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navegarMenuBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout planoDeFundoLayout = new javax.swing.GroupLayout(planoDeFundo);
        planoDeFundo.setLayout(planoDeFundoLayout);
        planoDeFundoLayout.setHorizontalGroup(
            planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeProdutoLabel)
                            .addComponent(nomeProdutoCampoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(estoqueProdutoCampoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(estoqueProdutoLabel)
                            .addComponent(precoProdutoCampoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(precoProdutoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(planoDeFundoLayout.createSequentialGroup()
                                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descricaoProdutoLabel)
                                    .addComponent(unidadeMedidaProdutoCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unidadeMedidaProdutoLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(navegarMenuBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSalvarCadastroProduto))
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(erroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        planoDeFundoLayout.setVerticalGroup(
            planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCadastroProdutos)
                .addGap(31, 31, 31)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(nomeProdutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeProdutoCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precoProdutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoProdutoCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(descricaoProdutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(unidadeMedidaProdutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidadeMedidaProdutoCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planoDeFundoLayout.createSequentialGroup()
                        .addComponent(estoqueProdutoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estoqueProdutoCampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(planoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarCadastroProduto)
                    .addComponent(navegarMenuBotao))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarCadastroProdutoActionPerformed
        String nome = getNome();
        String descricao = getDescricao();
        String unidadeMedida = getUnidadeMedida();
        Double preco = getPreco();
        Double estoque = getEstoque();
        if (preco != null && estoque != null) {
            Produto produto = new Produto(nome, descricao, estoque, unidadeMedida, preco);
            produto.retirada(2d);
            
            service.cadastrarProduto(produto);
            
            System.out.println("quantidade apos retirada:" + produto.getEstoque());
            clearErro();
        }


    }//GEN-LAST:event_botaoSalvarCadastroProdutoActionPerformed

    private void navegarMenuBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navegarMenuBotaoActionPerformed
        Interfaces.navegarMenu();
        Interfaces.ocultarCadastro();
    }//GEN-LAST:event_navegarMenuBotaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvarCadastroProduto;
    private javax.swing.JTextArea descricaoAreaTexto;
    private javax.swing.JLabel descricaoProdutoLabel;
    private javax.swing.JLabel erroLabel;
    private javax.swing.JTextField estoqueProdutoCampoTexto;
    private javax.swing.JLabel estoqueProdutoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton navegarMenuBotao;
    private javax.swing.JTextField nomeProdutoCampoTexto;
    private javax.swing.JLabel nomeProdutoLabel;
    private javax.swing.JPanel planoDeFundo;
    private javax.swing.JTextField precoProdutoCampoTexto;
    private javax.swing.JLabel precoProdutoLabel;
    private javax.swing.JLabel tituloCadastroProdutos;
    private javax.swing.JTextField unidadeMedidaProdutoCampoTexto;
    private javax.swing.JLabel unidadeMedidaProdutoLabel;
    // End of variables declaration//GEN-END:variables
    ProdutoService service ;

    String getNome() {
        String nome = nomeProdutoCampoTexto.getText();
        return nome;
    }

    void setNome(String nome) {
        nomeProdutoCampoTexto.setText(nome);
    }

    String getDescricao() {
        return descricaoAreaTexto.getText();
    }

    void setDescricao(String descricao) {
        descricaoAreaTexto.setText(descricao);
    }

    String getUnidadeMedida() {
        return unidadeMedidaProdutoCampoTexto.getText();
    }

    void setUnidadeMedida(String unidadeMedida) {
        unidadeMedidaProdutoCampoTexto.setText(unidadeMedida);
    }

    Double getPreco() {
        String textoPreco = precoProdutoCampoTexto.getText();
        try {
            return Double.valueOf(textoPreco);
        } catch (NumberFormatException e) {
            setErro("preco");
            return null;
        }
    }

    Double getEstoque() {
        String textoEstoque = estoqueProdutoCampoTexto.getText();
         try {
            return Double.valueOf(textoEstoque);
        } catch (NumberFormatException e) {
            setErro("estoque");
            return null;
        }
    }

    public void setErro(String campo) {
        erroLabel.setText("Formato inválido para o campo " + campo);
    }
    public void clearErro() {
        erroLabel.setText("");
    }

}

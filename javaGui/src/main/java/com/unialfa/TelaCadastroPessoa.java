package com.unialfa;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroPessoa extends JFrame {

    private JTextField campoNome;
    private JButton botao;

    public TelaCadastroPessoa(){
        setTitle("Cadastro de Pessoa");
        setSize(500, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets= new Insets(5,5,5,5);

        JLabel labelNome = new JLabel("Nome:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        painel.add(labelNome,constraints);

        campoNome = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        painel.add(campoNome,constraints);

        botao = new JButton("Salvar");
        botao.addActionListener(e-> executarAcaoBotao());
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        painel.add(botao,constraints);

        add(painel);
        setLocationRelativeTo(null);
    }
    private void executarAcaoBotao(){
        JOptionPane.showMessageDialog(this, campoNome.getText() + "Salvo com Sucesso!!");
    }

}

package textfieldtext;

// Figura 14.9: TextFieldFrame java
// Demonstrando a classe JTextField.

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame{
    
    private JTextField textField1; // Campo de texto com tamanho configurado
    private JTextField textField2; // Campo de texto construindo com texto
    private JTextField textField3; // Campo de texto com texto e tamanho
    private JPasswordField passwordField; // campo de senha com texto

    // Construtor TextFieldFrame adiciona JTextField a JFrame
    public TextFieldFrame(){
        
        super( "Testing JTextField and PasswordField" );
        setLayout ( new FlowLayout () ); // Configura o layout de frame
        
        // Constrói textfield com 10 colunas
        textField1 = new JTextField ( 10 );
        add (textField1); // Adiciona textField ao Jframe
        
        // Constrói textfield com o texto padrão
        textField2 = new JTextField ( "Enter Text Here" );
        add (textField2); // Adiciona textField2 ao Jframe 
        
        // Constrói textfield com o texto padrão e 21 colunas
        textField3 = new JTextField ( "Uneditable Text Field", 21 );
        textField3.setEditable( false ); // Desativa aedição
        add (textField3); // Adiciona textField3 ao Jframe

        // Constrói passwordfield com o texto padrão
        passwordField = new JPasswordField ( "Hiden Text");
        add (passwordField); // Adiciona passwordField ao Jframe
        
        
        // handlers de evento registradores
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener ( handler );
        textField2.addActionListener ( handler );
        textField3.addActionListener ( handler );
        passwordField.addActionListener ( handler );
        // Fim do construtor TextFieldFrame
        
    }
    
    // Classe interna private para tratamento de evento
    private class TextFieldHandler implements ActionListener{
        
        // Processa eventos de campo do texto
        public void actionPerformed ( ActionEvent event ){
            
            String string = ""; // Declara string a ser exibida
            
            // usuário pressionou Enter no JTextField textField1
            if ( event.getSource() == textField1 )
                string = String.format( " textField1: %s ", 
                        event.getActionCommand());
            
            // usuário pressionou Enter no JTextField textField2
             if ( event.getSource() == textField2 )
                string = String.format( " textField2: %s ", 
                        event.getActionCommand());
             
             // usuário pressionou Enter no JTextField textField3
              if ( event.getSource() == textField3 )
                string = String.format( " textField3: %s ", 
                        event.getActionCommand());
              
              // usuário pressionou Enter no JTextField passwordField
              else if ( event.getSource() == passwordField )
                string = String.format( " textField1: %s ", 
                        event.getActionCommand());
            
              // Exibe o conteúdo de JTextField
              JOptionPane.showMessageDialog ( null, string );
        } // Fim do método actionPerformed
    } // Fim da classe TextFieldHandler interna peivate
} // Fim da classe TextFieldFrame

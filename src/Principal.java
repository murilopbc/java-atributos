import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNome("Murilo");
        cliente.setEmail("murilo@gmail.com");
        cliente.setTelefone("(19) 1234-5678");

        JOptionPane.showMessageDialog(null, cliente.obterContatos(), "Contatos",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, cliente.obterEndereco(), "Contatos",JOptionPane.INFORMATION_MESSAGE);

    }
}

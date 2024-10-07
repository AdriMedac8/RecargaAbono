package InterfazTransporte;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JMonthChooser;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class RecargaAbono {

	public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Recarga de Abono de Transporte");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(603, 427);

        // Crear el panel principal con un GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Crear la etiqueta de instrucción
        JLabel label = new JLabel("Seleccione el mes para recargar su abono:");
        label.setBounds(83, 152, 263, 53);
        panel.add(label);

        // Crear el JComboBox con los nombres de los meses
        String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(336, 159, 130, 38);
        panel.add(monthComboBox);

        // Crear el botón de recarga
        JButton button = new JButton("Recargar Abono");
        button.setBounds(83, 269, 384, 53);
        panel.add(button);

        // Agregar el panel al marco
        frame.getContentPane().add(panel);
        
        // Crear el panel de imagen
        BufferedImage myPicture;
		try 
		{
			myPicture = ImageIO.read(new File("C:\\Users\\Medac\\Pictures\\Bus.jpg"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setSize(577, 388);
			picLabel.setLocation(0, 0);
			panel.add(picLabel);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        // Agregar el panel al marco
        frame.getContentPane().add(panel);

        // Agregar el ActionListener al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el mes seleccionado
                String selectedMonth = (String) monthComboBox.getSelectedItem();

                // Mostrar el cuadro de diálogo de confirmación
                JOptionPane.showMessageDialog(frame, "Su abono de transporte ha sido recargado para el mes de: " + selectedMonth);
            }
        });

        // Hacer visible el marco
        frame.setVisible(true);
    }
}


package a17;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.*;

public class Formulario{
    public static void main(String[] args) {
        JFrame formulario = new JFrame("Completando sentecias");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.setSize(900, 700);
        
        JPanel panel = new JPanel(new BorderLayout());
        
        //Se coloca la imagen.
        ImageIcon imagen = new ImageIcon("C:\\Users\\Jesus Maldonado Cruz"
                + "\\Documents\\Cuarto Semestre\\Ejercicio.png");
        JLabel etiquetaimagen = new JLabel(imagen);
        panel.add(etiquetaimagen, BorderLayout.PAGE_START);
        
        //Se crea el cuestionario
        JPanel panelCuestionario = new JPanel(new GridLayout(0,2 ));
        //Se agregan las preguntas
        String [] preguntas ={
            "1. Anne is Paul's: ",
            "2. Jason and Emily are their: ",
            "3. Paul is Anne's: ",
            "4. Jason is Anne's: ",
            "5. Emily is Paul's: ",
            "6. Jason is Emily: ",
            "7. Emily is Jason's: ",
            "8. Paul and Anne are Jason'n: "
        };
        //Se agregan las respuestas.
        String [] respuestas ={
            "wife",
            "2.",
            "3.",
            "4.",
            "5.",
            "6.",
            "7.",
            "8. "
        };
        
        for (int i = 0; i < preguntas.length; i++) {
            // Crear la etiqueta de la pregunta y agregarla al panel del cuestionario
            JLabel etiquetaPregunta = new JLabel(preguntas[i]);
            panelCuestionario.add(etiquetaPregunta);

            // Crear el campo de texto para la respuesta y agregarlo al panel del cuestionario
            JTextField campoRespuesta = new JTextField(20);
            panelCuestionario.add(campoRespuesta);

            final int index = i; // Variable final para acceder dentro de la clase anónima

            // Verificar la respuesta al perder el foco del campo de texto
            campoRespuesta.addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent evt) {
                    String respuestaIngresada = campoRespuesta.getText();
                    String respuestaCorrecta = respuestas[index];
                    if (!respuestaIngresada.equalsIgnoreCase(respuestaCorrecta)) {
                        campoRespuesta.setForeground(Color.RED);
                        campoRespuesta.setText(respuestaCorrecta);
                    }
                }
            });
        }

        panel.add(panelCuestionario, BorderLayout.CENTER);
        formulario.add(panel);
        formulario.setVisible(true);
    }
}

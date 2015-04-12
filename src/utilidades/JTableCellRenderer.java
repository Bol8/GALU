/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

//import static erp.optica.view.JFrameVentanaPrincipal.VERDE_CLARO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Alejandro
 */
public class JTableCellRenderer extends DefaultTableCellRenderer{
    
  public static final Color VERDE_APAGADO = new Color(160, 189, 154);
  public static final Color AMARILLO_APAGADO = new Color(247, 242, 165);
  public static final Color VERDE_OSCURO = new Color(33, 183, 172);
  

  public JTableCellRenderer() {
    setOpaque(true);
  }

  @Override
  public Component getTableCellRendererComponent(JTable table,
                                      Object value,
                                      boolean isSelected,
                                      boolean hasFocus,
                                      int row,
                                      int column) {
    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    JLabel label = (JLabel)super.getTableCellRendererComponent(
            table,value,isSelected,hasFocus,row,column);
    Font fontHeader = new Font((String)value, Font.BOLD, 14);
    Font fontCeldas = new Font((String)value, Font.PLAIN, 12);
    Color grisTexto = new Color(102,102,102);
    Color fondoCatFijas = new Color(224,242,241);
    label.setFont(fontCeldas);
   // setText(value.toString());
    JTableHeader header = table.getTableHeader();
      header.setOpaque(false);
      header.setBackground(VERDE_APAGADO);
      header.setForeground(Color.BLACK);
      header.setFont(fontHeader);
      
//    if (row == 0 || row == 1 || row == 2) {
//         setBackground(fondoCatFijas);
//         setForeground(grisTexto);
//     }
//    else {
        if (isSelected) {
      setBackground(AMARILLO_APAGADO);
      setForeground(Color.BLACK);
    } else {
      setBackground(Color.WHITE);
      setForeground(grisTexto);
    }
//    }
    
    
    
    this.setBorder(new EmptyBorder(5,5,5,5));
    
    return label;
  }
  
  
}

package Controller;

import Model.Treino;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class Util {

//Ajusta tamanho de largura de colunas de Jtables com numero dinamico
    public static void setColumnWidths(JTable table, int... widths) {
        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < widths.length; i++) {
            if (i < columnModel.getColumnCount()) {
                columnModel.getColumn(i).setMaxWidth(widths[i]);
            } else {
                break;
            }
        }
    }

    //Valia String com padrao de email
    public boolean validaEmail(String email) {
        final Pattern VALIDA_EMAIL_REGEX
                = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALIDA_EMAIL_REGEX.matcher(email);
        return matcher.find();
    }

    //Armazena a foto em em temp e retorna seu path
    public String getImage(Icon icon) {
        String path = "";
        try {
            BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics graphics = image.createGraphics();
            icon.paintIcon(null, graphics, 0, 0);
            graphics.dispose();
            String tmpdir = System.getProperty("java.io.tmpdir");
            path = tmpdir + "\\image.png";
            ImageIO.write(image, "png", new File(path));
            return path;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a foto", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    //Metodos para calular a idade
    public int calculaIdade(java.util.Date dataNasc) {
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(dataNasc);
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        } else {
            if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }
        return idade;
    }

    //Remove letras das String para identificacao de IDs
    public String removeLetras(String palavra) {
        palavra = palavra.substring(0, 6).replaceAll("[^0-9]", "");
        palavra = palavra.replaceAll("-", "");
        if (palavra.equals("")) {
            return "-1";
        }
        return palavra;
    }

    //Rebece uma lista que poula uma tabala e gera um aquivo PDF a partir dos dados dela
    public void gerarPDF(ArrayList<Treino> list) {
        Document document = new Document();
        try {

            PdfWriter.getInstance(document, new FileOutputStream("Treinos.pdf"));
            document.open();
            Paragraph p = new Paragraph("Treinos:");
            p.setAlignment(1);
            document.add(p);
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
            PdfPTable table = new PdfPTable(6);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Nome:"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Exercicío:"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Ordem:"));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Carga:"));
            PdfPCell cell5 = new PdfPCell(new Paragraph("Series:"));
            PdfPCell cell6 = new PdfPCell(new Paragraph("Repetições:"));

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);
            table.addCell(cell6);

            for (Treino treino : list) {
                cell1 = new PdfPCell(new Paragraph(treino.getCliente().getNome()));
                cell2 = new PdfPCell(new Paragraph(treino.getExercicios().getNome()));
                cell3 = new PdfPCell(new Paragraph(String.valueOf(treino.getOrdem())));
                cell4 = new PdfPCell(new Paragraph(treino.getCarga()));
                cell5 = new PdfPCell(new Paragraph(treino.getSeries()));
                cell6 = new PdfPCell(new Paragraph(treino.getRepeticao()));
                table.addCell(cell1);
                table.addCell(cell2);
                table.addCell(cell3);
                table.addCell(cell4);
                table.addCell(cell5);
                table.addCell(cell6);
            }
            document.add(table);

        } catch (DocumentException de) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar o PDF",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar o PDF",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        document.close();
    }
}

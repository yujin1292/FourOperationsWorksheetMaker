import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

class CreateMultiply extends Create {
    CreateMultiply(int a, int b, int p){
        first = a;
        second =b;
        page = p;
        op = "x";
    }
    @Override
    public boolean makePDFPage()throws Exception {
        String filename = "multiply"+ System.currentTimeMillis()/1000+".pdf";
        Number number = new Number();
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        document.open();

        for (int i = 0; i < page; i++) {
            Paragraph preface = new Paragraph();

            // 제목 생성
            BaseFont objBaseFont = BaseFont.createFont("H2HDRM.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Paragraph title = new Paragraph("곱셈 연습", new Font(objBaseFont, 18, Font.BOLD));
            title.setAlignment(Paragraph.ALIGN_CENTER); // 가운데 정렬.

            Image image2 = Image.getInstance("line.png");
            image2.setAlignment(Image.ALIGN_CENTER); // 가운데 정렬

            Paragraph blank = new Paragraph("  " , new Font(objBaseFont, 15, Font.BOLD));
            blank.setAlignment(Paragraph.ALIGN_CENTER); // 가운데 정렬.

            //제목 삽입
            preface.add(title);
            preface.add(image2);
            preface.add(blank);



            for(int row = 0 ; row < 4 ; row ++){

                // 표 생성
                PdfPTable table = new PdfPTable(new float[]{1f, 1f, 1f, 1f, 1f, 1f, 1f});

                PdfPCell c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                c1.setBorder(Rectangle.NO_BORDER);
                table.addCell(c1);


                // 첫번째 자리수
                if (first == 1) {

                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);


                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);

                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);


                }
                else if (first == 2) {

                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeAny()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);


                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);

                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeAny()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);


                }


                table.setHeaderRows(1);


                // 두번째 자리수
                if (second == 1) {

                    c1 = new PdfPCell(new Paragraph(op, new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);

                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Paragraph(op, new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);

                }
                else if (second == 2) {

                    c1 = new PdfPCell(new Phrase(op, new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeAny()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);


                    c1 = new PdfPCell(new Paragraph("", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);

                    c1 = new PdfPCell(new Phrase(op, new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeNoneZero()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                    c1 = new PdfPCell(new Phrase(Integer.toString(number.makeAny()), new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);

                }

                for( int t = 0 ; t < 7 ; t++){
                    c1 = new PdfPCell(new Phrase(" ", new Font(objBaseFont, size)));
                    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    c1.setBorder(Rectangle.TOP);
                    if( t == 3)
                        c1.setBorder(Rectangle.NO_BORDER);
                    table.addCell(c1);
                }

                preface.add(table);
                if( row == 3)
                    continue;
                preface.add(blank);
                preface.add(blank);
                preface.add(blank);
                preface.add(blank);

            }

            // preface에 추가합니다.



            // preface를 document에 저장합니다.
            document.add(preface);
            document.newPage();

        }
        document.close();

        return true;
    }

}